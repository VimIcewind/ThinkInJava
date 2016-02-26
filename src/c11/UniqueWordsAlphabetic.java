// UniqueWordsAlphabetic.java
// Producing an alphabetic listing.
package c11;

import java.util.*;
import net.mindview.util.*;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/c11/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
