// holding/ex10/Rodent10.java
// TIJ4 Chapter Holding, Exercise 10, page 409
/* Change Exercise 9 in the Polymorphism chapter to use an ArrayList
 * to hold the Rodents an an Iterator to move through the sequence of
 * Rodents.
 */
package holding.ex10;

import java.util.*;

class RandomRodentGenerator {
    private Random rand = new Random();

    public Rodent next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Rat();
            case 2:
                return new Squirrel();
        }
    }
}

class Rodent {
    private String name = "Rodent";

    protected void eat() {
        System.out.println("Rodent.eat()");
    }

    protected void run() {
        System.out.println("Rodent.run()");
    }

    protected void sleep() {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";

    @Override
    protected void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    protected void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Rat extends Rodent {
    private String name = "Rat";

    @Override
    protected void eat() {
        System.out.println("Rat.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Rat.run()");
    }

    @Override
    protected void sleep() {
        System.out.println("Rat.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";

    @Override
    protected void eat() {
        System.out.println("Squirrel.eat()");
    }

    @Override
    protected void run() {
        System.out.println("Squirrel.run()");
    }

    @Override
    protected void sleep() {
        System.out.println("Squirrel.sleep()");
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Rodent10 {
    private static RandomRodentGenerator gen =
            new RandomRodentGenerator();

    public static void main(String[] args) {
        List<Rodent> rodentList = new ArrayList<Rodent>();
        for (int i = 0; i < 10; i++) {
            rodentList.add(gen.next());
        }
        Iterator<Rodent> it = rodentList.iterator();
        while (it.hasNext()) {
            Rodent r = it.next();
            System.out.print(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}
