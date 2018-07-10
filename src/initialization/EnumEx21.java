// initialization/EnumEx21.java
// TIJ4 Chapter Initialization, Exercise 21, page 140
// Create an enum of the least-valuable six types of paper currency. Loop through
// the values() and print each value and its ordinal().
package initialization;

/**
 * Created by HWD on 2018-7-10.
 */
public class EnumEx21 {
    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFY, HUNDRED
    }

    public static void main(String[] args) {
        for (Bills b : Bills.values()) {
            System.out.println(b + ", ordinal " + b.ordinal());
        }
    }
}
