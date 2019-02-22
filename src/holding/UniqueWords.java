//: holding/UniqueWords.java
package holding;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by HWD on 2019-2-22 21:15
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("E:/GitHub/ThinkInJava/src/holding/UniqueWords.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[15, 2, 2019, 21, 22, Created, E, GitHub, HWD, Output, Set, String, System, TextFile, ThinkInJava, TreeSet, UniqueWords, W, args, by, class, holding, import, java, main, mindview, net, new, on, out, package, println, public, src, static, util, void, words]
*///:~
