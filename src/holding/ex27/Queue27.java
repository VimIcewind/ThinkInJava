// holding/Queue27.java
// TIJ4 Chapter Holding, Exercise 27
package holding.ex27;

import java.util.*;

/**
 * Created by HWD on 2019/3/7 15:11
 */
class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.println(s);
    }
}

class Build {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<Command>();
        for (int i = 0; i < 10; i++) {
            q.offer(new Command(i + " "));
        }
        return q;
    }
}

public class Queue27 {
    public static void commandEater(Queue<Command> qc) {
        while (qc.peek() != null) {
            qc.poll().operation();
        }
    }

    public static void main(String[] args) {
        Build b = new Build();
        commandEater(b.makeQ());
    }
}
