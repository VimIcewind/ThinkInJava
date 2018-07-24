// reusing/CC.java
// TIJ4 Chapter Reusing, Exercise 5 page 163
// Create two classes, A and B, with default constructors (empty argument
// list) that announce themselves. Inherit a new class called C from A, and
// create a member of class B inside C. Do not create a constructor for C.
// Create an object of class C and observe the resluts.
package reusing;

/**
 * Created by HWD on 2018-7-24.
 */
class AA {
    AA() {
        System.out.println("AA()");
    }
}

class BB extends AA {
    BB() {
        System.out.println("BB()");
    }
}

public class CC extends AA {
    BB bb = new BB(); // will then construct another AA and then a BB

    public static void main(String[] args) {
        CC cc = new CC(); // will construct an A first
    }
}
