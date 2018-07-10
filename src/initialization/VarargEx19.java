// initialization/VarargEx19.java
// TIJ4 chapter Initialization, Exercise 19, page 138
// Write a method that takes a vararg String array. Verify that you can pass
// either a comma-separated list of Strings or a String[] into this method.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class VarargEx19 {
    static void showString(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showString("one", "TWO", "three", "four");
        showString(new String[]{"1", "2", "3", "4"});
    }
}
