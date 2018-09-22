package innerclasses.ex24;

import innerclasses.controller.Event;

public class GreenhouseController24 {
    public static void main(String[] args) {
        GreenhouseControls24 gc = new GreenhouseControls24();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOff(200),
                gc.new FanOn(300),
                gc.new LightOff(400),
                gc.new FanOff(500),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(
                    new GreenhouseControls24.Terminate(
                            new Integer(args[0])
                    )
            );
            gc.run();
        }

    }
}
