// innerclasses/GreenhouseControls25.java
// TIJ4 Chpater Innerclasses, Exercise 25, page 245
// Inherit from GreenhouseControls in GreenhouseControls.java to add Event
// inner classes that turn water mist generators on and off. Write a new
// versin of GreenhouseController.java to use these new Event objects.
package innerclasses.ex25;

import innerclasses.GreenhouseControls;
import innerclasses.controller.Event;

public class GreenhouseControls25 extends GreenhouseControls {
    private boolean waterMist = false;

    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn on water mist generator
            waterMist = true;
        }

        @Override
        public String toString() {
            return "Water mist generator on";
        }
    }

    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn off water mist generator
            waterMist = false;
        }

        @Override
        public String toString() {
            return "Water mist generator off";
        }
    }
}
