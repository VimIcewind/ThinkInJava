package c03;

/**
 * Created by HWD on 2016/1/29.
 */
public class RandomBounds {
    static void usage() {
        System.err.println("Usage: \n\t" + "c03.RandomBounds lower\n\t" + "c03.RandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) {

            usage();
        }
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0)
                ; // Keep tring
            System.out.println("Produced 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0)
                ; // Keep tring
        } else {
            usage();
        }
    }
} ///:~
