// initialization/InstanceClauseTest.java
// TIJ4 Chapter Initialization, Exercise 15, page 131
//
package initialization;

/**
 * Created by HWD on 2018-7-9.
 */
class Tester1 {
    String s;
    {
        s = "Initializing string in Tester";
    }

    Tester1() {
        System.out.println("Tester1()");
    }
}

public class InstanceClauseTest {
    public static void main(String[] args) {
        new Tester1();
    }
}
