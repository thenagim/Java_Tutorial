public class Main4 {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();
        int value = -1;

        try {
            thrower.throwException(value);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}