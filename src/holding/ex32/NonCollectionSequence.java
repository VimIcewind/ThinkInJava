// holding/NonCollectionSequence.java
// TIJ4 Chapter Holding, Exercise 32
package holding.ex32;

import typeinfo.pets.*;
import java.util.*;

/**
 * Created by HWD on 2019/3/11 15:38
 */
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable {
    @Override
    public Iterator iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        System.out.print("pets: ");
        for (Pet p : nc.pets) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.print("reversed: ");
        for (Pet p : nc.reversed()) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.print("randomized: ");
        for (Pet p : nc.randomized()) {
            System.out.print(p + " ");
        }
    }
}
