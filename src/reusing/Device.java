// reusing/Device.java
// TIJ4. Chapter Reusing, Exervicse 15, page 171
// Create a class inside a package. Your class should contain a protected
// method. Outside of the package, try to call the protected method and eplain
// the results. Now inherit from your class and call the protected method from
// inside a method of your derived class.
package reusing;

import reusing.ex15.BasicDevice;

/**
 * Created by HWD on 2018-8-4.
 */
class DeviceFail {
    public static void main(String[] args) {
        BasicDevice fail = new BasicDevice();
        fail.showS();
        // fail.changeS("good-bye"); // cannot access protected method
    }
}

public class Device extends BasicDevice {
    void changeBasic(String t) {
        super.changeS(t); // calls protected method
    }

    public static void main(String[] args) {
        Device d = new Device();
        d.showS();
        d.changeBasic("Changed"); // derived class can access protected
        d.showS();
        d.changeS("Device");
        d.showS();
        DeviceFail.main(args);
    }
}
