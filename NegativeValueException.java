class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("Negative value not allowed.");
    }

    public NegativeValueException(String message) {
        super(message);
    }
}