package c06;

/**
 * Created by HWD on 2016/2/14.
 */

class A extends C {
    public A() {
        System.out.println("A()");
    }

    public A(String s) {
        System.out.println("A(" + s + ")");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }

    public B(String s) {
        System.out.println("B(" + s + ")");
    }
}

class C {

    B b = new B();

    public C() {

    }

    public C(String s) {
        A a = new A(s);
        b = new B(s);
    }
}

public class ABC {
    public static void main(String[] args) {
        C c = new C();
        C cs = new C("Called by C");
    }
}
