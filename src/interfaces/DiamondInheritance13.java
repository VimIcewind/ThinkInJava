// interfaces/DiamondInheritance13.java
// TIJ4 Chapter Interfaces, Exercise 13, page 213
/* Create an interface, and inherit two new interfaces from that
 * interface. Multiply inherit a third interface from the second
 * two.
 */
package interfaces;

interface CanDo {
    void doIt();
}

interface CanDoMore extends CanDo {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {
    @Override
    public void doIt() {

    }

    @Override
    public void doMore() {

    }

    @Override
    public void doFaster() {

    }

    @Override
    public void doMost() {

    }
}

public class DiamondInheritance13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore)d).doMore();
        ((CanDoFaster)d).doFaster();
        ((CanDo)d).doIt();
    }
}
