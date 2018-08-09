// reusing/Scarab.java
// TIJ4 Chapter Reusing, Exercise 24, page 180
// In Beetle.java, inherit a specific type beetle from class Beetle, following
// the same format as the existing classes. Trace and expain the output.
package reusing.ex24;

import static net.mindview.util.Print.*;

/**
 * Created by HWD on 2018-8-9.
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");
}

public class Scarab extends Beetle {
    private int n = printInit("Scarab.n initialized");

    public Scarab() {
        print("n = " + n);
        print("j = " + j);
    }

    private static int x3 = printInit("static Scarab.x3 initialized");

    public static void main(String[] args) {
        print("Scarab constructor");
        Scarab sc = new Scarab();
    }
}
