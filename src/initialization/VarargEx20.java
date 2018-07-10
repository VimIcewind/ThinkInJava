// initialization/VarargEx20.java
// TIJ4 Chapter Initialization, Exercise 20, page 138
// Create a main() that uses varargs instead of the ordinary main() syntax. Print
// all the elements in the resulting args array. Test it with various numbers of
// command-line arguments.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class VarargEx20 {
    public static void main(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
