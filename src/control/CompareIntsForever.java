// control/CompareIntsForever.java
// TIJ4 Chapter Control, Exercise 3, page 139
// Modify exercise 2 with infinite while loop. Stop program with Ctrl-C
package control;

import java.util.Random;

/**
 * Created by HWD on 2018-6-12.
 */
public class CompareIntsForever {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        while (true) {
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
