// exception/Ex4.java
// TIJ4 Chapter Exceptions, Exercise 4
package exceptions.ex4;

/**
 * Created by HWD on 2019/3/18 21:40
 */
class Exception4 extends Exception {
    private String msg;

    Exception4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }

    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}

public class Ex4 {
    public static void f() throws Exception4 {
        System.out.println("f()");
        throw new Exception4("Ouch from f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch(Exception4 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}
