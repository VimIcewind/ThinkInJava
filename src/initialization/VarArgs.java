//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
class A {

}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {
            new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
} /* Output: (Sample)
47 3.14 11.11
one two three
initialization.A@7aa5f9b initialization.A@426abd0b initialization.A@6da13f3d
*///:~
