// reusing/Airplane.java
// TIJ4, Chapter Reusing, Exercise 1, page 160
// Create a simple class. Inside a second class, define a reference to an object of
// the first class. Using lazy initialization to instantiate this object.
package reusing;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-7-18.
 */
class Engine {
    private String s;

    Engine() {
        print("Engine()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Airplane {
    private String fuselage, wings, tail;
    private Engine e;

    public Airplane() {
        print("Inside Airplane()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }

    public String toString() {
        if (e == null) { // lazy (delayed) initialization:
            e = new Engine();
        }
        return "fuselage = " + fuselage + ", " +
                "wings = " + wings + ", " +
                "tail = " + tail + ", " +
                "Engine = " + e;
    }

    public static void main(String[] args) {
        Airplane N1234 = new Airplane();
        print(N1234);
    }
}
