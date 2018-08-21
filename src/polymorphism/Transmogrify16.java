package polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by HWD on 2018-8-21.
 */
class AlertStatus {
    public void alert() {

    }
}

class NormalAlert extends AlertStatus {
    public void alert() {
        print("AlterStatus Normal");
    }
}

class HighAlert extends AlertStatus {
    public void alert() {
        print("AlertStatus High");
    }
}

class MaximumAlert extends AlertStatus {
    public void alert() {
        print("AlterStatus Maximum");
    }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();

    public void normalAlert() {
        alertStatus = new NormalAlert();
    }

    public void highAlert() {
        alertStatus = new HighAlert();
    }

    public void maximumAlert() {
        alertStatus = new MaximumAlert();
    }

    public void checkAlertStatus() {
        alertStatus.alert();
    }
}

public class Transmogrify16 {
    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.checkAlertStatus();
        ss.highAlert();
        ss.checkAlertStatus();
        ss.maximumAlert();
        ss.checkAlertStatus();
        ss.normalAlert();
        ss.checkAlertStatus();
    }
}
