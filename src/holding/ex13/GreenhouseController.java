// holding/ex13/GreenhouseController.java
// TIJ4 Chapter Holding, Exercise 13, page 262
/* In the innerclass/GreenhouseController.java example, the class
 * Controller uses an ArrayList. Change the code to use a LinkedList
 * instead, and use an Iterator to cycle trough the set of events.
 */
package holding.ex13;

import innerclasses.controller.Event;

import java.util.*;

public class GreenhouseController {
    // A class from java.util to hold Event objects:
    private LinkedList<Event> eventList = new LinkedList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        LinkedList<Event> eventListCopy = new LinkedList<Event>(eventList);
        ListIterator<Event> it = eventListCopy.listIterator();
        while (it.hasNext()) {
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}
