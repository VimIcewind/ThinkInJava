// exceptions/Ex3.java
// TIJ4 Chapter Exceptions, Exercise 3
package exceptions.ex3;

/**
 * Created by HWD on 2019/3/18 21:35
 */
public class Ex3 {
    private static int[] ia = new int[2];

    public static void main(String[] args) {
        try {
            ia[2] = 3;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
    }
}
