// innerclasses/SecondOuter.java
// TIJ4 Chapter Innerclasses, Exercise 26, page 245
// Create a class with an inner class that has a non-default contructor
// (one that takes arguments). Create a second class with an inner
// class that inherits from the first inner class.
package innerclasses.ex26;

class FirstOuter {
    public class FirstInner {
        FirstInner(String s) {
            System.out.println("FirstOuter.FirstInner() " + s);
        }
    }
}

public class SecondOuter {
    public class SecondInner extends FirstOuter.FirstInner {
        SecondInner(FirstOuter x) {
            x.super("hello");
            System.out.println("SecondOuter.SecondInner()");
        }
    }

    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        SecondOuter so = new SecondOuter();
        SecondInner si = so.new SecondInner(fo);
    }
}
