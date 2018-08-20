package polymorphism.rodent;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-20.
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    public String toString() {
        return "Shared " + id;
    }

    public void showRefcount() {
        print("refcount = " + refcount);
    }
}
