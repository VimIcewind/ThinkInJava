package innerclasses.ex22;

interface Selector {
    boolean end();

    Object current();

    void next();
}

interface ReverseSelector {
    boolean begin();

    Object current();

    void previous();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
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

    private class SequenceReverseSelector implements ReverseSelector {
        private int i = items.length - 1;

        @Override
        public boolean begin() {
            return i == -1;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void previous() {
            if (i > -1) {
                i--;
            }
        }
    }

    public ReverseSelector reverseSelector() {
        return new SequenceReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();

        ReverseSelector reverseSelector = sequence.reverseSelector();

        while (!reverseSelector.begin()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.previous();
        }
        System.out.println();
    }
}
