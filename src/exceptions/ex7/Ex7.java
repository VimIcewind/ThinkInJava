// exceptions/Ex7.java
// TIJ4 Chapter Exceptions, Exercise 7
package exceptions.ex7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by HWD on 2019/3/19 10:26
 */
public class Ex7 {
    private static int[] ia = new int[2];

    private static Logger logger = Logger.getLogger("Ex7 Exceptions");

    static void logException(Exception e) { // Exception e argument
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            // call logging method:
            logException(e);
        }
    }
}
