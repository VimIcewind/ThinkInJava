//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-18.
 */
class Instrument{
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        print("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        print("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}

class Keyboard extends Instrument {
    void play(Note n) {
        print("Keyboard.play() " + n);
    }

    public String toString() {
        return "Keyboard";
    }

    void adjust() {
        print("Adjusting Keyboard");
    }
}

class Brass extends Wind {
    void play(Note n) {
        print("Brass.play() " + n);
    }

    public String toString() {
        return "Brass";
    }

    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

class Piano extends Keyboard {
    void play(Note n) {
        print("Piano.play() " + n);
    }

    public String toString() {
        return "Piano";
    }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[20];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next();
        }
        tuneAll(orchestra);
        for (Instrument i : orchestra) {
            System.out.println(i);
        }
    }
} /* Output:
Brass.play() MIDDLE_C
Brass.play() MIDDLE_C
Piano.play() MIDDLE_C
Wind.play() MIDDLE_C
Piano.play() MIDDLE_C
Wind.play() MIDDLE_C
Woodwind.play() MIDDLE_C
Piano.play() MIDDLE_C
Percussion.play() MIDDLE_C
Piano.play() MIDDLE_C
Brass.play() MIDDLE_C
Wind.play() MIDDLE_C
Wind.play() MIDDLE_C
Keyboard.play() MIDDLE_C
Percussion.play() MIDDLE_C
Brass.play() MIDDLE_C
Stringed.play() MIDDLE_C
Percussion.play() MIDDLE_C
Wind.play() MIDDLE_C
Wind.play() MIDDLE_C
Brass
Brass
Piano
Wind
Piano
Wind
Woodwind
Piano
Percussion
Piano
Brass
Wind
Wind
Keyboard
Percussion
Brass
Stringed
Percussion
Wind
Wind
*///:~
