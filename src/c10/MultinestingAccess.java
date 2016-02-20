//: MultiNestingAccess.java
// Nested classes can access all members of all
// levels of the class they are nested within.
package c10;

class MNA {
    private void f() {

    }

    class A {
        private void g() {

        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultinestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
} ///:~
