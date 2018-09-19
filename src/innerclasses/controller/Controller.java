//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package innerclasses.controller;

import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventlist = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventlist.add(c);
    }

    public void run() {
        while (eventlist.size() > 0) {
            // Make a copy so you're not modifying the list
            // while you're selecting the elements in it:
            for (Event e : new ArrayList<Event>(eventlist)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventlist.remove(e);
                }
            }
        }
    }
}
