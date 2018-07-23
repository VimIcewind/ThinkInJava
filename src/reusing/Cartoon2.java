package reusing;

/**
 * Created by HWD on 2018-7-23.
 */
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon2 extends Drawing {
    public static void main(String[] args) {
        Cartoon2 x = new Cartoon2();
    }
}
