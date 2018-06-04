// operators/DogCompare.java
// TIJ4 Chapter Operators, Exercise 6, page 105
// Create a class called Dog containing two String: name and says.
// Following exercise 5, create a new Dog reference and assign it to spot's
// object. Test for comparison using == and equals() for all references.
package operators;

/**
 * Created by HWD on 2018-6-4.
 */
public class DogCompare {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("Spot");
        spot.setSays("Ruff!");
        Dog scruffy = new Dog();
        scruffy.setName("Scruffy");
        scruffy.setSays("Wurf!");
        spot.showName();
        spot.speak();
        scruffy.showName();
        scruffy.speak();
        Dog butch = new Dog();
        butch.setName("Butch");
        butch.setSays("Hello!");
        butch.showName();
        butch.speak();
        System.out.println("Comparison: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.println("Now assign: spot = butch");
        spot = butch;
        System.out.println("Compare again: ");
        System.out.println("spot == butch: " + (spot == butch));
        System.out.println("spot.equals(butch): " + spot.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(spot));
        System.out.println("Spot: ");
        spot.showName();
        spot.speak();
        System.out.println("Butch: ");
        butch.showName();
        butch.speak();
    }
}
