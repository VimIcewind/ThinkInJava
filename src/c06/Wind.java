//: Wind.java
// Inheritance & upcasting
package c06;

import java.util.*;

class Instrument {
    public void play() {
        System.out.println("play");
    }

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Wind objects are instruments
// because they hava the same interface:
class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcating
    }
} ///:~

