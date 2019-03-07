// holding/Ex29.java
// TIJ4 Chapter Holding, Exercise 29
package holding.ex29;

import java.util.PriorityQueue;

/**
 * Created by HWD on 2019/3/7 16:35
 */
class Simple extends Object {

}

public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<Simple> s = new PriorityQueue<Simple>();
        // OK to add one Simple:
        s.offer(new Simple());
        // but no more allowed; get runtime exception:
        // Simple connot be cast to Comparable:
        s.offer(new Simple());
    }
}
