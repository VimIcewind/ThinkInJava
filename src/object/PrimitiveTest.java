// TIJ4 Chapter Object, Exercise 1, page 89
// object/PrimitiveTest.java
// Create a class containing an int and a char that are not initialized
// and print their values to verify that Java performs default initialization.
package object;

/**
 * Created by HWD on 2018-5-28.
 */
public class PrimitiveTest {
    static int i;
    static char c;

    public static void main(String[] args) {
        System.out.println("int = [" + i + "]");
        System.out.println("char = [" + c + "]");
    }

}
