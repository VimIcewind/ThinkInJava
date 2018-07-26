// reusing/DetergentDelegation.java
// TIJ4 Chapter Reusing, Exercise 11, page 165
// Modify Detergent.java so that is uses delegation.
package reusing;

/**
 * Created by HWD on 2018-7-26.
 */
public class DetergentDelegation {
    private String s = "DetergentDelegation";
    Cleanser c = new Cleanser();

    public void append(String a) {
        s += a;
    }

    // two methods delegated entirely to Cleanser c:
    public void dilute() {
        c.dilute();
    }

    public void apply() {
        c.apply();
    }

    // method delegated in part to Cleanser c:
    public void scrub() {
        append(" DetergentDelegation.scrub()");
    }

    public void foam() {
        append(" foam()");
    }

    public String toString() {
        return s + " " + c;
    }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
