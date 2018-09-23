//: innerclasses/LocalInnerClass.java
// Holds a sequence of Objects.
package innerclasses;

import static net.mindview.util.Print.*;

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        // A local inner class:
        class LocalCounter implements Counter {
            public LocalCounter() {
                // Local inner class can have a constructor
                print("LocalCounter()");
            }

            @Override
            public int next() {
                printnb(name); // Access local final
                return count++;
            }
        }
        return new LocalCounter();
    }

    // The same thing with an anonymous inner class:
    Counter getCounter2(final String name) {
        return new Counter() {
            // Anonymous inner class cannot have a named
            // constructor, only an instance initializer:
            {
                print("Counter()");
            }

            @Override
            public int next() {
                printnb(name); // Access local final
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");

        for (int i = 0; i < 5; i++) {
            print(c1.next());
        }

        for (int i = 0; i < 5; i++) {
            print(c2.next());
        }
    }
} /* Output:
LocalCounter()
Counter()
Local inner0
Local inner1
Local inner2
Local inner3
Local inner4
Anonymous inner5
Anonymous inner6
Anonymous inner7
Anonymous inner8
Anonymous inner9
*///:~
