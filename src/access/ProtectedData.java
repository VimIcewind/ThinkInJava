// access/ProtectedData.java
// TIJ4 Chapter Access, Exercise 6, page 153
// Create a class with protected data. Create a second class in the same file with
// a method that maipulates the protected data in the first class.
package access;

/**
 * Created by HWD on 2018-7-16.
 */
class SomeData {
    protected int a = 13;
}

class DataChange {
    static void change(SomeData sd, int i) {
        sd.a = i;
    }
}

public class ProtectedData {
    public static void main(String[] args) {
        SomeData x = new SomeData();
        System.out.println(x.a);
        DataChange.change(x, 99);
        System.out.println(x.a);
    }
}
