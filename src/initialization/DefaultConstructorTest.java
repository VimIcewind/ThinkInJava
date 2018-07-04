// initialization/DefaultConstructorTest.java
// TIJ4 Chapter Initialization, Exercise 3, page 116
// Create a class with a default contructor (one that takes no arguments) that
// prints a message. Create an object of this class.
package initialization;

/**
 * Created by HWD on 2018-7-4.
 */
class Kabayo {
    Kabayo() {
        System.out.println("isa lang kabayo");
    }
}

public class DefaultConstructorTest {
    public static void main(String[] args) {
        Kabayo k = new Kabayo();
    }
}
