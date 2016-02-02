package c04;

/**
 * Created by HWD on 2016/2/2.
 */
public class InitializeDemo {
    InitializeDemo() {
        System.out.println("Create an object of Class InitializeDemo!");
    }

    InitializeDemo(String s) {
        this();
        System.out.println("Args is " + s);
    }

    InitializeDemo(int i) {
        this();
        System.out.println("Args is " + i);
    }

    public static void main(String[] args) {
        InitializeDemo h1 = new InitializeDemo();
        InitializeDemo h2 = new InitializeDemo("too!");
        InitializeDemo[] a = new InitializeDemo[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = new InitializeDemo(i);
        }
    }
}
