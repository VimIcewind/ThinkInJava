// initialization/ConstructorTest.java
// TIJ4 Chapter Initialization, Exercise 1, p110
// Create a class containing an unitialized String reference.
// Demostrate that this reference is initialized by Java to null.
package initialization;

/**
 * Created by HWD on 2018-7-2.
 */
class Tester {
    String s;
}

public class ConstructorTest {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
