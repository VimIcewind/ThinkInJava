// Modify Exercise 5 so that A and B have constructors with arguments instead
// of default constructos. Write a constructor for C and perform all
// initialization within C's constructor.
package reusing;

/**
 * Created by HWD on 2018-7-24.
 */
class A7 {
    A7(char c, int i) {
        System.out.println("A(char, int)");
    }
}

class B7 extends A7 {
    B7(String s, float f) {
        super(' ', 0);
        System.out.println("B(String, float)");
    }
}

public class C7 extends A7 {
    private char c;
    private int i;

    C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }

    B7 b7 = new B7("hi", 1f); // will then construct another A7 and then a B7

    public static void main(String[] args) {
        C7 c = new C7('b', 2); // will construct an A first
    }
}
