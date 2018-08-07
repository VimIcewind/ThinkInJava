// reusing/JurassicEx.java
// TIJ4 Chapter Reusing, Exercise 22, page 178
// Create a final class and attempt to inherit from it.
package reusing.ex22;

/**
 * Created by HWD on 2018-8-7.
 */
class SmallBrain {

}

final class Dinosaur {
    SmallBrain x = new SmallBrain();
}

// error: cannot inherit from final Dinosaur
// class Further extends Dinosaur {
//
// }

public class JurassicEx {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
    }
}
