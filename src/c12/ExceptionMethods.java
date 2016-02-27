// ExceptionMethods.java
// Demonstrating the exception Methods.
package c12;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getmessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString:" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
