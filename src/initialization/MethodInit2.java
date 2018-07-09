//: initialization/MethodInit2.java
package initialization;

/**
 * Created by HWD on 2018-7-9.
 */
public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
