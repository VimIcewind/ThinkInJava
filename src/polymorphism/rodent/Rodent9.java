package polymorphism.rodent;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-18.
 */
class Rodent {
    private String name = "Rodent";

    protected void eat() {
        print("Rodent.eat()");
    }

    protected void run() {
        print("Rodent.run()");
    }

    protected void sleep() {
        print("Rodent.sleep()");
    }

    public String toString() {
        return name;
    }
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
    private String name = "Squirrel";

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

public class Rodent9 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
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
