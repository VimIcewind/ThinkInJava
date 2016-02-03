package c05;

/**
 * Created by HWD on 2016/2/3.
 */
public class DescMemTest {
    public static void main(String[] args) {
        DescMem dm = new DescMem();
        System.out.println(dm.publicS);
        System.out.println(dm.s);
        System.out.println(dm.protectedS);
        //! System.out.println(dm.privateS);
    }
}
