package Lab7.compulsory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SharedMemory Class: contains all available tokens;
 */
public class SharedMemory {
    private final List<Token> tokens;

    /**
     * Constructor
     * receives the number of tokens;
     * it will generate and initializes them with unique numbers, adding them to a list of Token objects.
     * @param numTokens
     */

    public SharedMemory(int numTokens) {
        tokens = new ArrayList<>();
        for (int i = 1; i <= numTokens; i++) {
            tokens.add(new Token(i));
        }
        Collections.shuffle(tokens);
    }

    /**
     * the takeToken method is synchronized and allows a thread to take the first available token from the token list and remove it from the list
     * @return
     */

    public synchronized Token takeToken() {
        if (tokens.isEmpty()) {
            return null;
        }
        return tokens.remove(0);
    }
}
