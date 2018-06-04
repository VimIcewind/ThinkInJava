//: operators/CoinToss.java
// TIJ4 Chapter Operators, Exercise 7, page 106
// Write a program that simulates coin-flipping
package operators;

import java.util.Random;

/**
 * Created by HWD on 2018-6-4.
 */
public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if (coin % 2 == 0) {
            System.out.println("heads");
        } else {
            System.out.println("tails");
        }
    }
}
