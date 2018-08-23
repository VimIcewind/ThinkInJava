// interfaces/rodent/Rodent1.java
// TIJ4 Chapter Interfaces, Exercise 1, page 204
/* Modify Exercise 9 in the previous chapter so that Rodent is an abstract class.
* Make the methods of Rodent abstract whenever possible.
 */
package interfaces.rodent;

import polymorphism.rodent.RandomRodentGenerator;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-23.
 */
abstract class Rodent {
    private String name = "Rodent";

    abstract protected void eat();

    abstract protected void run();

    abstract protected void sleep();

    abstract public String toString();
}

class Mouse extends Rodent {
    private String name = "Mouse";

    protected void eat() {
        print("Mouse.eat()");
    }

    protected void run() {
        print("Mouse.run()");
    }

    protected void sleep() {
        print("Mouse.sleep()");
    }

    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    protected void eat() {
        print("Rat.eat()");
    }

    protected void run() {
        print("Rat.run()");
    }

    protected void sleep() {
        print("Rat.sleep()");
    }

    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Rat";

    protected void eat() {
        print("Squirrel.eat()");
    }

    protected void run() {
        print("Squirrel.run()");
    }

    protected void sleep() {
        print("Squirrel.sleep()");
    }

    public String toString() {
        return name;
    }
}

public class Rodent1 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();

    public static void main(String[] args) {
        // Error: cannot instantiate abstract class:
        // Rodent x = new Rodent();
        // But OK to create array to be downcast to derived objects:
        Rodent[] rodents = new Rodent[10];
        for (Rodent r : rodents) {
            r = gen.next();
            print(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
