// access/CookieThief.java
// TIJ4 Chapter Access, Exercise 4, page 153
// Show that protected methods have package access but are not public.
package access.cookie2;

/**
 * Created by HWD on 2018-7-16.
 */
public class CookieMonster {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        x.bite(); // package access to protected method
    }
}
