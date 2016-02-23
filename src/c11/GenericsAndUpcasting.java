// GenericsAndUpcasting.java
package c11;

import java.util.*;

class GrannySmith extends Apple {

}

class Gale extends Apple {

}

class Fuji extends Apple {

}

class Braeburn extends Apple {

}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gale());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            System.out.println(c);
        }
    }
}
/* Output: (Sample)
c11.GrannySmith@6d6f6e28
c11.Gale@135fbaa4
c11.Fuji@45ee12a7
c11.Braeburn@330bedb4
 */
