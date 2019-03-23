// exceptions/ex9/Ex9.java
// TIJ4 Chapter Exceptions, Exercise 9
package exceptions.ex9;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2019/3/23 20:54
 */
class ExceptionA extends Exception {
    ExceptionA(String msg) {
        super(msg);
    }
}

class ExceptionB extends Exception {
    ExceptionB(String msg) {
        super(msg);
    }
}

class ExceptionC extends Exception {
    ExceptionC(String msg) {
        super(msg);
    }
}

public class Ex9 {
    public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x < 0) {
            throw new ExceptionA("x < 0");
        }
        if (x == 0) {
            throw new ExceptionA("x == 0");
        }
        if (x > 0) {
            throw new ExceptionA("x > 0");
        }
    }

    public static void main(String[] args) {
        try {
            f(0);
            f(1);
            f(-1);
            // Will catch any Exception type:
        } catch(Exception e) {
            print("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
}
