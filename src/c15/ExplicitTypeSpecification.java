package c15;

import c14.pets.*;
import net.mindview.util.New;

import java.util.*;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {

    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>> map());
    }
}
