package c06;

/**
 * Created by HWD on 2016/2/14.
 */

class A extends C {
    public A() {
        System.out.println("A()");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }
}

class C {
    B b = new B();
}

public class ABC {
    public static void main(String[] args) {
        C c = new C();
    }
}
