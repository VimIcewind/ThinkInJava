//: filters/Waveform.java
package C09.filters;

public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
} ///:~
