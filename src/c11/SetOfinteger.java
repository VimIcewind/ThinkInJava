// SetOfInteger.java
package c11;

import java.util.*;

public class SetOfinteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 1000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
