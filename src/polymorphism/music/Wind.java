//: polymorphism/music/Wind.java
package polymorphism.music;

/**
 * Created by HWD on 2018-8-13.
 */
// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
