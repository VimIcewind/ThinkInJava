package c15;

import java.util.*;

/**
 * Created by HWD on 2016/9/27.
 */
public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    // List<Fruit> flist = new ArrayList<Apple>();
    List<Fruit> flist = new ArrayList<Fruit>();
}
