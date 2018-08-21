//: polymorphism/Transmogrify.java
// Dynamicaly changing the behavior of an object
// via composition (the "State" design pttern).
package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-21.
 */
class Actor {
    public void act() {

    }
}

class HappyActor extends Actor {
    public void act() {
        print("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        print("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
