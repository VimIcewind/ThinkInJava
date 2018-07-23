// reusing/Sterilizer.java
// TIJ4 Chapter Reusing, Exercise 2, page 243
// Inherit a new class from class Detergent. Override scrub() and add a new method
// called sterilize().
package reusing;

/**
 * Created by HWD on 2018-7-23.
 */
public class Sterilizer extends Detergent {
    public void scrub() {
        append(" Sterilizer.scrub()");
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Sterilizer x = new Sterilizer();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println("Testing base class:");
        Detergent.main(args);
    }
}
