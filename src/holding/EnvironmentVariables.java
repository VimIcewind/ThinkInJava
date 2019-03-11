//: holding/EnvironmentVariables.java
package holding;

import java.util.Map;

/**
 * Created by HWD on 2019/3/11 10:10
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
} /* (Execute to see output) *///:~
