import java.util.logging.Logger;

public class Main5 {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            throwIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            LOGGER.severe(e.toString());
        }

        try {
            throwMyException1();
        } catch (MyException1 e) {
            LOGGER.severe(e.toString());
        }
    }

    private static void throwIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        int i = arr[3];
    }

    private static void throwMyException1() throws MyException1 {
        throw new MyException1("MyException1 was thrown");
    }
}