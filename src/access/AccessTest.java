package access;

/**
 * Created by HWD on 2018-7-16.
 */
public class AccessTest {
    public static void main(String[] args) {
        FourWays fw = new FourWays();
        fw.showa();
        fw.showb();
        fw.showc();
        fw.a = 10;
        fw.b = 20;
        fw.c = 30;
        //! fw.d = 40; // private access, compile can't touch
        fw.showa();
        fw.showb();
        fw.showc();
        //! fw.showd(); // private access, compiler can't touch
    }
}
