// initialization/AutomaticConstructor.java
// TIJ4 Chapter Initialization, Exercise 7, page 116
// Create a class without a constructor, and then create an object of that
// class in main() to verify that the default constructor is automatically
// synthesized.
package initialization;

/**
 * Created by HWD on 2018-7-4.
 */
class Aso {
    void bark() {
        System.out.println("woof");
    }
}

public class AutomaticConstructor {
    public static void main(String[] args) {
        Aso a = new Aso();
        a.bark();
    }
}
