//: DotNew.java
// Creating an inner class directly using the .new syntax.
package c10;

public class DotNew {
    public DotNew() {
        System.out.println("DotNew()");
    }

    public class Inner {
        public Inner() {
            System.out.println("Inner()");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
