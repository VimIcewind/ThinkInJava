//: reusing/Chess.java
// Inheritance, constructos and arguments.
package reusing;

/**
 * Created by HWD on 2018-7-24.
 */
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // System.out.println("BoardGame constructor"); // call to super must be first statement in constructor
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
