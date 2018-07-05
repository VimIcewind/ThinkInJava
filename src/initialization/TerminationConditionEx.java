// initialization/TerminationConditionEx.java
// TIJ4 Chapter Initialization, Exercise 10, page 122
// Create a class with a finalize() method that prints a message. In main(),
// create an object of your class. Explain the behavior of your program.
package initialization;

/**
 * Created by HWD on 2018-7-5.
 */
class WebBank {
    boolean loggedIn = false;

    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn) {
            System.out.println("Error: still logged in");
            // Normally, you'll also do this:
            // super.finalize(); // Call the base-class version
        }
    }
}

public class TerminationConditionEx {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        // Proper cleanup: log out of bank1 before going home
        bank1.logOut();
        // Drop the reference, forget to cleanup:
        new WebBank(true);
        // Force garbage collection and finalization:
        System.gc();
    }
}
