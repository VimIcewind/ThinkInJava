// interfaces/ex19/Games19.java
// TIJ4 Chapter Interfaces, Exercise 19, page 221
/* Create a framework using Factory Methods that performs both coin
 * tossing and dice tossing.
 */
package interfaces.ex19;

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
            case 0:
                print("Heads");
                return;
            case 1:
                print("Tails");
                return;
            default:
                print("OnEdge");
                return;
        }
    }
}

class CoinTossFactory implements GamesFactory {
    @Override
    public Games getGames() {
        return new CoinToss();
    }
}

class DiceThrow implements Games {
    Random rand = new Random();

    @Override
    public void play() {
        print("Throw Dice: " + (rand.nextInt(6) + 1));
    }
}

class DiceThrowFactory implements GamesFactory {
    @Override
    public Games getGames() {
        return new DiceThrow();
    }
}

public class Games19 {
    public static void playGame(GamesFactory factory) {
        Games g = factory.getGames();
        g.play();
    }

    public static void main(String[] args) {
        playGame(new CoinTossFactory());
        playGame(new DiceThrowFactory());
    }
}
