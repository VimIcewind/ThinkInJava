//: Statistics.java
// Simple demonstration of HashMap.
package c11;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            // Produce a number between 0 and 20;
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
            System.out.println(m);
        }
        System.out.println(m);
    }
}
