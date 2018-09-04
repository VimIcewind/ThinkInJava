// innerclasses/Outer3.java
// TIJ4 Chapter Innerclasses, Exercise 3, page 225
/* Modify Exercise 1 so that Outer has a private Strng field (initialized
 * by the constructor), and Inner has a toString(0 that displays this field.
 * Create an object of type Inner and display it.
 */
package innerclasses.ex3;

public class Outer3 {
    private String s;

    class Inner3 {
        Inner3() {
            System.out.println("Inner()");
        }

        @Override
        public String toString() {
            return s;
        }
    }

    Outer3(String s) {
        System.out.println("Outer1()");
        this.s = s;
    }

    Inner3 makeInner3() {
        return new Inner3();
    }

    public static void main(String[] args) {
        Outer3 o = new Outer3("Hi is risen!");
        Inner3 i = o.makeInner3();
        System.out.println(i.toString());
    }
}
