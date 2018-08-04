package reusing.ex15;

/**
 * Created by HWD on 2018-8-4.
 */
public class BasicDevice {
    private String s = "Original";

    public BasicDevice() {
        s = "Original";
    }

    protected void changeS(String c) {
        s = c;
    }

    public void showS() {
        System.out.println(s);
    }
}
