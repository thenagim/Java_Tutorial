public class ExcDemo2 {
    public static void myMethod(int num) {
        try {
            if (num == 0) {
                throw new ArithmeticException("Divide by zero");
            } else if (num >= 10) {
                throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
            } else {
                System.out.println("No exception thrown.");
            }
        } catch (ArithmeticException ex) {
            System.out.println("An ArithmeticException occurred: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}