//: exceptions/LoggingExceptions.java
// An exception that reports through a Logger.
package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by HWD on 2019/3/19 09:12
 */
class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
} /* Output: (85% match)
三月 19, 2019 9:18:53 上午 exceptions.LoggingException <init>
SEVERE: exceptions.LoggingException
	at exceptions.LoggingExceptions.main(LoggingExceptions.java:25)

Caught exceptions.LoggingException
三月 19, 2019 9:18:53 上午 exceptions.LoggingException <init>
SEVERE: exceptions.LoggingException
	at exceptions.LoggingExceptions.main(LoggingExceptions.java:30)

Caught exceptions.LoggingException
*///:~
