// holding/Ex15.java
// TIJ4 Chapter Holding, Exercise 15, page 415
/* Stacks are often used to evaluate expressions in programming
 * languages. Using net.mindview.util.Stack, evaluate the following
 * expression, where '+' meas "push the following letter onto the
 * stack," and '-' means "pop the top of the stack and print it":
 * "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---"
 */
package holding.ex15;

import net.mindview.util.Stack;

/**
 * Created by HWD on 2019-2-21 9:20
 */
public class Ex15 {
    public static void main(String[] args) {
        Stack<Character> sc = new Stack<Character>();
        char[] s = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---".toCharArray();
        System.out.println(s);
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '+') {
                sc.push(s[++i]);
            } else if (s[i] == '-') {
                System.out.print(sc.pop());
            }
        }
    }
}
