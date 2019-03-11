//: holding/MultiIterableClass.java
// Adding several Adapter Methods.
package holding;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by HWD on 2019/3/11 15:00
 */
public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length -1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled =
                        new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic) {
            System.out.print(s + " ");
        }
    }
} /* Output:
banana-shaped. be to Earth the now we how is that And
is banana-shaped. Earth that how the be And we now to
And that is how we now the Earth to be banana-shaped.
*///:~
