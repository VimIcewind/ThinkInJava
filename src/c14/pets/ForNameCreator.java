//: pets/ForNameCreator.java
package c14.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "c14.pets.Mutt",
            "c14.pets.Pug",
            "c14.pets.EgyptianMau",
            "c14.pets.Manx",
            "c14.pets.Cymric",
            "c14.pets.Rat",
            "c14.pets.Mouse",
            "c14.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
