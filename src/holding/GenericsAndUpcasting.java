//: holding/GenericsAndUpcasting.java
package holding;

import java.util.ArrayList;

class GrannySmith extends Apple {

}

class Gala extends Apple {

}

class Fuji extends Apple {

}

class Braeburn extends Apple {

}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            System.out.println(c);
        }
    }
} /* Output: (Sample)
holding.GrannySmith@6d6f6e28
holding.Gala@135fbaa4
holding.Fuji@45ee12a7
holding.Braeburn@330bedb4
*///:~
