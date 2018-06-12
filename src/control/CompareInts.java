// control/CompareInts.java
// TIJ4 Chapter Control, Exercise 2, page 139
// Write a program that generates 25 random int values. For each value, use an
// if-else statement to classsify it as greater than, less than or equal to a
// second randomly generated value.
package control;

import java.util.Random;

/**
 * Created by HWD on 2018-6-12.
 */
public class CompareInts {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if (x < y) {
                System.out.println(x + " < " + y);
            } else if (x > y) {
                System.out.println(x + " > " + y);
            } else {
                System.out.println(x + " = " + y);
            }
        }
    }
}
