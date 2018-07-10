// initialization/InitTest.java
// TIJ4 Chapter Initialization, Exercise 17, page 134
// Create a class with a constructor that takes a String argument. During
// constriction, print the argument. Create and array of object references to this
// class, but don't actually create objects to assign into the array. When you run
// the program, notice whether the initialization messages from the constructor
// are printed.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
class Init{
    Init(String s) {
        System.out.println("Init()");
        System.out.println(s);
    }

}

public class InitTest {
    public static void main(String[] args) {
        Init[] it = new Init[10];
    }
}
