//: Human.java
// Catching exception hierarchies.
package c12;

class Annoyance extends Exception {

}

class Sneeze extends Annoyance {

}

public class Human {
    public static void main(String[] args) {
        // catch the exact type;
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type:
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
