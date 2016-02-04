//: SprinklerSystem.java
// Composition for code reuse
package c06;

class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = new String("Constructed");
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String value1, value2, value3, value4;
    WaterSource source;
    int i;
    float f;

    void print() {
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("source = " + source);
    }

    public static void main(String[] args) {
        SprinklerSystem x = new SprinklerSystem();
        x.print();
    }
}
