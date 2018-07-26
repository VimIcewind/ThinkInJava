// reusing/Ex8.java
// TIJ4 Chapter Reusing, Exercise 8, page 163
// Create a base class with only a non-default constructor, and a derived class
// with both a default (no-arg) and non-default consructor. In the derived-class
// constructors, call the base-class constructor.
package reusing;

/**
 * Created by HWD on 2018-7-26.
 */
class A8 {
    A8(char c, int i) {
        System.out.println("A8(char, int)");
    }
}

public class Ex8 extends A8 {
    private char c;
    private int i;

    Ex8() {
        super('z', 3);
    }

    Ex8(char a, int j) {
        super(a, j);
        c = a;
        i = j;
        System.out.println("Ex8(char, int)");
    }

    public static void main(String[] args) {
        Ex8 ex1 = new Ex8();
        Ex8 ex2 = new Ex8('b', 2);
    }
}
