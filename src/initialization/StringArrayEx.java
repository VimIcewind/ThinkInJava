// initialization/StringArrayEx.java
// TIJ4 Chapter Initialization, Exercise 16, page 134
// Create an array of String objects and assign a String to each element. Print
// the array by using an forloop.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class StringArrayEx {
    public static void main(String[] args) {
        String[] s = {"one", "two", "three",};
        for (int i = 0; i < s.length; i++) {
            System.out.println("s[" + i + "] = " + s[i]);
        }
    }
}
