// innerclass/ex14/HorrorShow14.java
// TIJ4 Chapter Innerclasses, Exercise 14, page 232
/* Modify interface/HorrorShow.java to implement DangerousMonster and
 * Vampire using anonymous classes.
 */
package innerclasses.ex14;

import static net.mindview.util.Print.print;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}

public class HorrorShow14 {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            @Override
            public void menace() {

                print("DangerousMouster Menace");
            }

            @Override
            public void destroy() {
                print("DangerousMouster Destroy");
            }
        };
    }

    public Vampire vampireMaker() {
        return new Vampire() {
            @Override
            public void menace() {
                print("Vampire Menace");
            }

            @Override
            public void drinkBlood() {
                print("Vampire Destroy");
            }

            @Override
            public void destroy() {
                print("Vampire Kill");
            }

            @Override
            public void kill() {
                print("Vampire DrinkBlood");
            }
        };
    }

    public static void main(String[] args) {
        HorrorShow14 show = new HorrorShow14();
        show.u(show.monsterMaker());
        show.v(show.monsterMaker());
        show.u(show.vampireMaker());
        show.v(show.vampireMaker());
        show.w(show.vampireMaker());
    }
}
