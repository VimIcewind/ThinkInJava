//: initialization/DynamicArray.java
// Array initialization.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
} /* Output:
fiddle de dum
*///:~
