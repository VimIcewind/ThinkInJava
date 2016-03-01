//: neverCaught.java
// Ignoring RuntimeExceptions.
// {ThrowsException}
package c12;

public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
} ///:~
