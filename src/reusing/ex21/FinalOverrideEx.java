// reusing/FinalOverrideEx.java
// TIJ4 Chapter Reusing, Exercise 21, page 177
// Create a class with a final method. Inherit from that class and attempt to
// override that method.
package reusing.ex21;

import com.sun.corba.se.impl.encoding.ByteBufferWithInfo;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-6.
 */
class WithFinal {
    final void f() {
        print("WithFinal.f()");
    }

    void g() {
        print("WithFinal.g()");
    }

    final void h() {
        print("WithFinal.h()");
    }
}

class OverrideFinal extends WithFinal {
    // attempt to override:
    // no can do
    // public final void f() {
    //     print("OverideFinal.f()");
    // }
    // OK, not final
    @Override public void g() {
        print("OverrideFinal.g()");
    }

    // cannot override final
    // final void h() {
    //     print("OverrideFinal.h()");
    // }
}

public class FinalOverrideEx {
    public static void main(String[] args) {
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();
        // Upcast:
        WithFinal wf = of;
        wf.f();
        wf.g();
        wf.h();
    }
}
