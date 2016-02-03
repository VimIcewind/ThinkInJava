package c05;

/**
 * Created by HWD on 2016/2/3.
 */

class Secret {
    protected String p = "protected";
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Secret sec = new Secret();
        System.out.println(sec.p);
    }
}
