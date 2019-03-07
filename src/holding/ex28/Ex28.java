// holding/ex28/Ex28.java
// TIJ4 Chapter Holding, Exercise 28
package holding.ex28;

import java.util.*;

/**
 * Created by HWD on 2019/3/7 16:30
 */
public class Ex28 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        PriorityQueue<Double> d = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            d.offer(rand.nextDouble() * i);
        }
        while (d.peek() != null) {
            System.out.print(d.poll() + " ");
        }
    }
}
