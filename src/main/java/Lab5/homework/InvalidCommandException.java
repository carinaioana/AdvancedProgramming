package Lab5.homework;

/**
 *  custom exception that is thrown when a command is invalid.
 */
class InvalidCommandException extends Exception {
    public InvalidCommandException(String message) {
        super(message);
    }
}
