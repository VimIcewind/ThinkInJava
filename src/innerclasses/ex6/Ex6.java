// innerclasses/Ex6.java
// TIJ4 Chapter Innerclasses, Exercise 6, page 228
/* Create an interface with at least one method, in its own package. Create
 * class in a separate package. Add a protected inner class that
 * implements the interface. In a third package, inherit from your class and
 * inside amethod, return an object of the protected inner class, upcasting
 * to the interface during the return.
 */
package innerclasses.ex6;

import innerclasses.ex6.ex6base.Ex6Base;
import innerclasses.ex6.ex6interface.Ex6Interface;

public class Ex6 extends Ex6Base {
    Ex6Interface getBaseInner() {
        return this.new Ex6BaseInner();
    }

    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        System.out.println(ex.getBaseInner().say());
    }
}
