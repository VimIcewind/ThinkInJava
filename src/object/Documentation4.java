// object/Documentation4.java
// TIJ4 Chapter Object, Exercise 14, page 90
// Add an HTML list of items to the documentation in the previous exercise.
package object;

import java.util.Date;

/**
 * Created by HWD on 2018-5-29.
 * You can even insert a list;
 * <ol>
 *     <li> Item one
 *     <li> Item two
 *     <li> Item three
 * </ol>
 *
 * Another test list
 * <ol>
 *     <li> One
 *     <li> Two
 *     <li> Three
 * </ol>
 */
public class Documentation4 {
    /** Let's try a public field list
     * <ol>
     *     <li> One
     *     <li> Two
     *     <li> Three
     * </ol>
     */

    public int i = 2;

    /** A private field list (-private to see)
     * <ol>
     *     <li> One
     *     <li> Two
     *     <li> Three
     * </ol>
     */

    private int j = 3;

    /**
     * Another list can be inserted here to help explain the
     * following method call
     * <ol>
     *     <li> One
     *     <li> Two
     *     <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     * @param args array of string arguments
     */

    public static void main(String[] args) {
        /**
         * Let's try another test list here
         * <ol>
         *     <li> One
         *     <li> Two
         *     <li> Three
         * </ol>
         */

        Date d = new Date();
        System.out.println("d = " + d);
    }
}
