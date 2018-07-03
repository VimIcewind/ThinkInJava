//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

package initialization;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-7-3.
 */
class Tree {
    int height;

    Tree() {
        print("Planting a seeding");
    }

    Tree(int initialHeight) {
        height = initialHeight;
        print("Create new Tree that is " + height + " feet tall");
    }

    void info() {
        print("Tree is " + height + " feet tall");
    }

    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }
        // Overload constructor:
        new Tree();
    }
} /* Output:
Create new Tree that is 0 feet tall
Tree is 0 feet tall
Overloaded method: Tree is 0 feet tall
Create new Tree that is 1 feet tall
Tree is 1 feet tall
Overloaded method: Tree is 1 feet tall
Create new Tree that is 2 feet tall
Tree is 2 feet tall
Overloaded method: Tree is 2 feet tall
Create new Tree that is 3 feet tall
Tree is 3 feet tall
Overloaded method: Tree is 3 feet tall
Create new Tree that is 4 feet tall
Tree is 4 feet tall
Overloaded method: Tree is 4 feet tall
Planting a seeding
*///:~

