// access/UnpackageMyClass.java
// TIJ4 Chapter Access, Exercise 1, page 147
// Create a class in a package. Create an instance of your class outside of that package.
package access;

/**
 * Created by HWD on 2018-7-16.
 */
public class UnpackagedMyClass {
    public static void main(String[] args) {
        access.mypackage.MyPackagedClass m = new access.mypackage.MyPackagedClass();
    }
}
