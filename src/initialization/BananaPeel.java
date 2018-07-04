//: initialization/BananaPeel.java
package initialization;

/**
 * Created by HWD on 2018-7-4.
 */
class Banana {
    void peel(int i) {
        System.out.println("peel");
    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
