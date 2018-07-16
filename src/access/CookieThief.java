// access/CookieThief.java
// TIJ4 Chapter Access, Exercise 4, page 153
// Show that protected methods have package access but are not public.
package access;

import access.cookie2.Cookie;

/**
 * Created by HWD on 2018-7-16.
 */
public class CookieThief {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        //! x.bite(); // access protected
    }
}
