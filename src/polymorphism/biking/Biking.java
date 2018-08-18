// polymorphism/biking/Biking.java
// TIJ4 Chapter Polymorphism, Exercise 1, page 183
/* Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
* Demonstrate that an instance of each type can be upcaste to Cycle via a ride()
* method.
*/

package polymorphism.biking;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-13.
 */
class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }

    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int wheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

public class Biking {
    public static void ride(Cycle c) {
        c.travel(c);
        print("wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
