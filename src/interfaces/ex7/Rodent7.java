// interfaces/rodent/Rodent7.java
// TIJ4 Chapter Interface, Exercise 7, page 207
// Modify Exercise 9 in the Polymorphism chapter so that Rodent is an
// interface.
package interfaces.ex7;

import static net.mindview.util.Print.print;

interface Rodent {
    String name = "Rodent";

    void eat();

    void run();

    void sleep();

    @Override
    String toString();
}

class Mouse implements Rodent {
    private String name = "Mouse";

    @Override
    public void eat() {
        print("Mouse.eat()");
    }

    @Override
    public void run() {
        print("Mouse.run()");
    }

    @Override
    public void sleep() {
        print("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat implements Rodent {
    private String name = "Rat";

    @Override
    public void eat() {
        print("Rat.eat()");
    }

    @Override
    public void run() {
        print("Rat.run()");
    }

    @Override
    public void sleep() {
        print("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel implements Rodent {
    private String name = "Squirrel";

    @Override
    public void eat() {
        print("Squirrel.eat()");
    }

    @Override
    public void run() {
        print("Squirrel.run()");
    }

    @Override
    public void sleep() {
        print("Squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Rodent7 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();

    public static void main(String[] args) {
        // Error: cannot instantiate (abstract) interface:
        // Rodent x = new Rodent();
        // But OK to create array of implementing objects:
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
