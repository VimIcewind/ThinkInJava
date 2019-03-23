//: exceptions/ExceptionMethods.java
// Demonstrating the Exception Methods.
package exceptions;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2019/3/23 20:39
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            print("Caugth Exception");
            print("getMessage():" + e.getMessage());
            print("getLocalizeMessage():" + e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
Caugth Exception
getMessage():My Exception
getLocalizeMessage():My Exception
toString():java.lang.Exception: My Exception
printStackTrace():
java.lang.Exception: My Exception
	at exceptions.ExceptionMethods.main(ExceptionMethods.java:13)
*///:~
