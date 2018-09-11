// innerclass/Outer13.java
// TIJ4 Chapter Innerclasses, Exercise 13, page 232
/* Repeat Exercise 9 using anonymous inner class.
 * (Exercise 9: Create an interface with at least one method, and implement
 * that interface by defining an inner class within a method, which returns
 * a reference to your interface.)
 */
package innerclasses.ex13;

interface Ex13Interface {
    String say(String s);
}

public class Outer13 {
    Ex13Interface f() {
        return new Ex13Interface() {
            @Override
            public String say(String s) {
                return s;
            }
        };
    }

    public static void main(String[] args) {
        Outer13 o = new Outer13();
        System.out.println(o.f().say("Hi"));
    }
}
