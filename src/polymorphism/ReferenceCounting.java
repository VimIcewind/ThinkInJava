//: polymorphism/ReferenceCounting.java
// Clean up shared member objects.
package polymorphism;

import java.util.concurrent.CompletionService;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-20.
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void finalize() {
        if (refcount > 0) {
            print("Error: " + refcount + " Shared " + id + " objects in use");
        }
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }

}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),
        new Composing(shared), new Composing(shared),
        new Composing(shared), new Composing(shared)};

        for (Composing c : composing) {
            c.dispose();
        }
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        sharedTest.finalize();
    }
} /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
Creating Composing 5
Creating Composing 6
Error: 2 Shared 0 objects in use
Creating Shared 1
Creating Composing 7
Error: 1 Shared 1 objects in use
*///:~
