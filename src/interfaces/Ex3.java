// interfaces/Ex3.java
// TIJ4 Chapter Interfaces, Exercise 3, page 204
/* Create a base class with an abstract print() method that is overridden in a
* derived class. The overridden version of the method prints the value of an int
* variable defined in the derived class. At the point of definition of this
* variable, give it a nonzero value. In the base-class contructor, call this
* method. In main(), create an object of the drived type, and then call its
* print() method. Explain the results.
 */
package interfaces;

/**
 * Created by HWD on 2018-8-23.
 */
abstract class Dad {
    protected abstract void print();

    Dad() {
        print();
    }
}

class Son extends Dad {
    private int i = 1;

    @Override
    protected void print() {
        System.out.println("Son.i = " + i);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        /* Process of initialization:
         * 1. Storage for Son s allocated and initialized to binary zero
         * 2. Dad() called
         * 3. Son.print() called in Dad() (s.i = 0)
         * 4. Member initializers called in order (s.i = 1)
         * 5. Body of Son() called
         */
        Son s = new Son();
        s.print();
    }
}
