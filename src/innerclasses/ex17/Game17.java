// innerclasses/ex17/Games17.java
// TIJ4 Chapter Innerclasses, Exercise 17, page 234
/* Modify the solution to Exercise 19 from the Interfaces chapter to use
 * anonymous inner classes.
 * (Exercise 19, Interfaces: Create a framework using Factory Methods
 * that proforms both coin tossing and dice tossing.
 */
package innerclasses.ex17;

import java.util.Random;

import static net.mindview.util.Print.print;

interface Games {
    void play();
}

interface GamesFactory {
    Games getGames();
}

class CoinToss implements Games {
    Random rand = new Random();

    @Override
    public void play() {
        print("Toss Coin: ");
        switch (rand.nextInt(2)) {
            case 0 :
                print("Heads");
                return;
            case 1 :
                print("Tails");
                return;
            default :
                print("OnEdge");
                return;
        }
    }

    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new CoinToss();
                }
            };
}

class DiceThrow implements Games {
    Random rand = new Random();

    @Override
    public void play() {
        print("Throw Dice: " + (rand.nextInt(6) + 1));
    }

    public static GamesFactory factory =
            new GamesFactory() {
                @Override
                public Games getGames() {
                    return new DiceThrow();
                }
            };
}

public class Game17 {
    public static void playGame(GamesFactory factory) {
        Games g = factory.getGames();
        g.play();
    }

    public static void main(String[] args) {
        playGame(CoinToss.factory);
        playGame(DiceThrow.factory);
    }
}
