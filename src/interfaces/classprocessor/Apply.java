//: interfaces/classprocessor/Apply.java
package interfaces.classprocessor;

import java.util.Arrays;

import static net.mindview.util.Print.print;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    // Covariant return
    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Process " + p.name());
        print(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
} /* Output:
Using Process Upcase
DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Process Downcase
disagreement with beliefs is by definition incorrect
Using Process Splitter
[Disagreement, with, beliefs, is, by, definition, incorrect]
*///:~
