// exception/Ex2.java
// TIJ4 Chapter Exceptions, Exercise 2
package exceptions.ex2;

/**
 * Created by HWD on 2019/3/18 21:29
 */
public class Ex2 {
    private static Integer i = null;

    public static void main(String[] args) {
        // leads to NullPointerException:
        // System.out.println(i.toString());
        try {
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        }
        try {
            i = 10;
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        } finally {
            System.out.println("Got Through it");
        }
    }
}
