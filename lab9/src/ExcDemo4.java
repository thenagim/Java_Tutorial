// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class with method that throws the custom exception
class ExceptionThrower {
    public void throwException(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value is negative");
        } else if (value == 0) {
            throw new CustomException("Value is zero");
        } else {
            throw new CustomException("Value is positive");
        }
    }
}

