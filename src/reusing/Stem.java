// reusing/Stem.java
// TIJ4 Chapter Reusing, Exercise 10, page 163
// Modify the previous exercise so that each class only has non-default
// constructors.
package reusing;

/**
 * Created by HWD on 2018-7-26.
 */
class Component1 {
    Component1(byte b) {
        System.out.println("Component1(byte)");
    }
}

class Component2 {
    Component2(short s) {
        System.out.println("Component2(short)");
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("Component3(int)");
    }
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;

    Root(float f) {
        c1root = new Component1((byte)0);
        c2root = new Component2((short)0);
        c3root = new Component3(0);
        System.out.println("Root(float)");
    }
}

public class Stem extends Root {
    Component1 c1stem10;
    Component2 c2stem10;
    Component3 c3stem10;

    Stem(double d) {
        super(2.78f);
        c1stem10 = new Component1((byte)1);
        c2stem10 = new Component2((short)1);
        c3stem10 = new Component3(1);
        System.out.println("Stem(double)");
    }

    public static void main(String[] args) {
        Stem s = new Stem(2.78);
    }
}
