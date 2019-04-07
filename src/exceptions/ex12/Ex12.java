// exceptions/ex12/Ex12.java
// TIJ4 Chapter Exception, Exercise 12
package exceptions.ex12;

/**
 * Created by HWD on 2019/4/7 21:01
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Ex12 {
    private Object[] items;
    private int next = 0;

    public Ex12(int size) {
        items = new Object[size];
    }

    public void add(Object x) throws ArrayIndexOutOfBoundsException {
        // check for full array first:
        if (next == items.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // if not full, fill:
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Ex12 sequence = new Ex12(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        // attempt to add object to full array produces
        // ArrayIndexOutOfBoundsException:
        sequence.add(Integer.toString(10));
    }
}
