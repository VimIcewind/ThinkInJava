//: exceptions/LoggingExceptions2.java
// Logging caught exceptions.
package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by HWD on 2019/3/19 09:22
 */
public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            logException(e);
        }
    }
} /* Output: (90% match)
三月 19, 2019 9:29:50 上午 exceptions.LoggingExceptions2 logException
SEVERE: java.lang.NullPointerException
	at exceptions.LoggingExceptions2.main(LoggingExceptions2.java:23)
*///:~
