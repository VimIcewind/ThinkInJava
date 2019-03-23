// exceptions/ex8/Ex8.java
// TIJ4 Chapter Exceptions, Exercise 8
package exceptions.ex8;

/**
 * Created by HWD on 2019/3/23 20:21
 */
class Exception4 extends Exception {
    private String msg;

    public Exception4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }

    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}

class Test8 {
    public static void f() throws Exception4 {
        System.out.println("f()");
        throw new Exception4("Ouch from f()");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        try {
            Test8.f();
        } catch(Exception4 e) {
            System.out.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}
