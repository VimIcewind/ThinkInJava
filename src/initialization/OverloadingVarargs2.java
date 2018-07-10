//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        //! f('a', 'b');
    }
}
