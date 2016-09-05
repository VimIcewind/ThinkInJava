package c15;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Compiles: produce ClassCastException:
        // gia = (Generic<Integer>[]) new Object[SIZE];
        // Runtime type is raw(erased) type:
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        // gia[1] = new Object(); // Compile-time error
        // Discove type mismatch at compile time:
        // gia[2] = new Generic<Double>();
    }
}
