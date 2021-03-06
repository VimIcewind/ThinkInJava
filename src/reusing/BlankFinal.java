//: reusing/BlankFinal.java
// "Blank final fields.
package reusing;

/**
 * Created by HWD on 2018-8-5.
 */
class Poppet {
    private int i;

     Poppet(int ii) {
         i = ii;
     }
}

public class BlankFinal {
    private final int i = 0; // Initialized final
    private final int j; // Blank final
    private final reusing.Poppet p; // Blank final reference

    // Blank finals MUST be initialized in the constructor:
    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new reusing.Poppet(1); // Initialize blank final reference
    }

    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new reusing.Poppet(x); // Initialize blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
