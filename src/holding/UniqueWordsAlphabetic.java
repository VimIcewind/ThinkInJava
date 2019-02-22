//: holding/UniqueWordsAlphabetic.java
// Producing an alphabetic listing.
package holding;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by HWD on 2019-2-22 21:23
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("E:/GitHub/ThinkInJava/src/holding/UniqueWords.java", "\\W+"));
        System.out.println(words);
    }
} /* Output:
[15, 2, 2019, 21, 22, args, by, class, Created, E, GitHub, holding, HWD, import, java, main, mindview, net, new, on, out, Output, package, println, public, Set, src, static, String, System, TextFile, ThinkInJava, TreeSet, UniqueWords, util, void, W, words]
*///:~
