package c03;

/**
 * Created by HWD on 2016/1/29.
 */
public class IfElseTest {
    public static void main(String[] args) {
        int i = 8;
        int j = -8;

        System.out.println("i = 8 is " + test(i));
        System.out.println("j = -8 is " + test(j));

    }

    static int test(int testval) {
        int result = 0;
        if (testval < 0)
            return -1;
        if (testval > 0)
            return +1;
        return 0;
    }
}
