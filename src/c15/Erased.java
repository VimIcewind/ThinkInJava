package c15;

public class Erased<T> {
    private final int SIZE = 100;

    public static void f(Object arg) {
//        if (arg instanceof T) {          // Error
//
//        }
//        T Var = new T();                 // Error
//        T[] array = new T[SIZE];         // Error
//        T[] array = (T)new Object[SIZE]; // Unchecked warning
    }
}
