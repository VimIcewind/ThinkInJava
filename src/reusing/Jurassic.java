//: reusing/Jurassic.java
// Making an entire class final.
package reusing;

/**
 * Created by HWD on 2018-8-7.
 */
class SmallBrain {

}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {

    }
}

// error:  Cannot extend final class 'Dinosaur'
// class Further extends Dinosaur {
// }

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
} ///:~
