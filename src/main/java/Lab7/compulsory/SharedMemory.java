package Lab7.compulsory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SharedMemory {
    private final List<Token> tokens = new ArrayList<>();
    /*declare a collection of tokens*/
    public SharedMemory(int n) {
        /*add all tokens to the collection and shuffle them;*/
        for(int i = 0; i < n; i++){
            Token token = new Token(i);
            tokens.add(token);
        }
        Collections.shuffle(tokens);
    }

    public synchronized List<Token> extractTokens(int howMany) {
        List<Token> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (tokens.isEmpty()) {
                break;
            }
            /*poll one token from the collection*/
            extracted.add(tokens.remove(0));
        }
        return extracted;
    }

}