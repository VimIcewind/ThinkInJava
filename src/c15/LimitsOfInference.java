package c15;

import c14.pets.*;
import net.mindview.util.New;

import java.util.*;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {

    }
    public static void main(String[] args) {
         //f(New.map()); // Does not compile
    }
}
