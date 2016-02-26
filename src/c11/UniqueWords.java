// UniqueWords.java
package c11;

import java.util.*;
import net.mindview.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("src/c11/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
