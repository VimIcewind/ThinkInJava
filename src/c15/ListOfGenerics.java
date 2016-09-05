package c15;

import java.util.*;

public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T index(int index) {
        return array.get(index);
    }
}
