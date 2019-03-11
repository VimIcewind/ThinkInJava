//: holding/ForEachCollections.java
// All collection work with foreach.
package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by HWD on 2019/3/11 09:53
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs) {
            System.out.print("'" + s + "' ");
        }
    }
} /* Output:
'Take' 'the' 'long' 'way' 'home'
*///:~
