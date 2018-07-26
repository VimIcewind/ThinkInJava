// reusing/Stem.java
// TIJ4 Chapter Reusing, Exercise 9, page 163
// Create a class called Root that contains an instance of each of the classes
// (that you also create) named Component1, Component2 and Component3. Derive a
// class Stem from Root that also contains an instance of each "component." All
// class should have default constructors that print a message about that class.
package reusing;

/**
 * Created by HWD on 2018-7-26.
 */
class Component1 {
    Component1() {
        System.out.println("Component1()");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2()");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3()");
    }
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;

    Root() {
        System.out.println("Root()");
    }
}

public class Stem extends Root {
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;

    Stem() {
        System.out.println("Stem()");
    }

    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
