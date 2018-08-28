// interfaces/music9/Music9.java
// TIJ4 Chapter Interfaces, Exercise 9, page 207
/* Refactor Music5.java by moving the common methods in Wind, Percussion
 * and Stringed into an absract class.
 */
package interfaces.music9;

import polymorphism.music.Note;

import static net.mindview.util.Print.print;

abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    @Override
    public String toString() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {

        print(this + ".adjust()");
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwing";
    }
}

public class Music9 {
    // Doesn't care about type, so new types
    // added to the system will work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
