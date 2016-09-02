package c15;

/**
 * Created by HWD on 2016/9/2.
 */
class Manipulator<T> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        // Error: cannot find symbol: method f():
        obj.f();
    }
}

public class Manipulation<T> {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulaor = new Manipulator<HasF>(hf);
        manipulaor.manipulate();
    }
}
