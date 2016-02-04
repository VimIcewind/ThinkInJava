//: Detergent.java
// Inheritance syntax & properties
package c06;

class Cleaner {
    private String s = new String("Cleaner");

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public void print() {
        System.out.println("s");
    }

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute();
        x.apply();
        x.scrub();
        x.print();
    }
}

public class Detergent extends Cleaner{
    // Change a method:
    public void scrud() {
        append("Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.print();
        System.out.println("Testing base class:");
        Cleaner.main(args);
    }
} ///:~
