//: polymorphism/Sandwich.java
// Order of constructor class.
package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-20.
 */
class Meal {
    Meal() {
        print("Meal()");
    }
}

class Bread {
    Bread() {
        print("Bread()");
    }
}

class Cheese {
    Cheese() {
        print("Cheese");
    }
}

class Lettuce {
    Lettuce() {
        print("Lettuce");
    }
}

class Pickle {
    Pickle() {
        print("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese
Lettuce
Sandwich()
*///:~
