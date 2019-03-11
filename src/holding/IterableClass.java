//: holding/IterableClass.java
// Anything Iterable works with foreach.
package holding;

import java.util.*;

/**
 * Created by HWD on 2019/3/11 09:59
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how "
            + "we now the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }
} /* Output:
And that is how we now the Earth to be banana-shaped.
*///:~
