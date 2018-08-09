package reusing.ex23;

/**
 * Created by HWD on 2018-8-9.
 */
class A {
    static int j = printInit("A.j initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }

    A() {
        System.out.println("A() constructor");
    }
}

class B extends A {
    static int k = printInit("B.k initialized");

    B() {
        System.out.println("B() constructor");
    }
}

class C {
    static int n = printInitC("C.n initialized");
    static A a = new A();

    C() {
        System.out.println("C() constructor");
    }

    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class D {
    D() {
        System.out.println("D() constructor");
    }
}

public class LoadClass extends B {
    static int i = printInit("LoadClass.i initialized");

    LoadClass() {
        System.out.println("LoadClass() constructor");
    }

    public static void main(String[] args) {
        // accessing static main causes loading (and initializaiton)
        // of A, B, & LoadClass
        System.out.println("hi");
        // call constructors from loaded classes:
        LoadClass lc = new LoadClass();
        // call to static field loads & initializes C:
        System.out.println(C.a);
        // call to constructor loads D:
        D d = new D();
    }
}
