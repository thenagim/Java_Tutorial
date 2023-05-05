import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException1 extends Exception {
    private static final Logger LOGGER = Logger.getLogger(MyException1.class.getName());

    public MyException1(String message) {
        super(message);
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
}

