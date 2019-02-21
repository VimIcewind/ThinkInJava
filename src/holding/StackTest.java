package holding;

import net.mindview.util.Stack;

/**
 * Created by HWD on 2019-2-21 8:58
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
} /* Output:
fleas has dog My
*///:~
