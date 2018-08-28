// Solution includes, in package interfaces.ex6:
package interfaces.ex6;

interface Ex6 {
    void sayOne();

    void sayTwo();

    void sayThree();
}

public class Ex6b implements Ex6 {
    // Error: cannot assign weaker access to public methods:
    // void sayOne() {
    //     System.out.println("one");
    // }

    // protected void sayTwo() {
    //     System.out.println("two");
    // }

    // private void sayThree() {
    //     System.out.println("three");
    // }

    // must be maintained public:
    @Override
    public void sayOne() {
        System.out.println("One");
    }

    @Override
    public void sayTwo() {
        System.out.println("two");
    }

    @Override
    public void sayThree() {
        System.out.println("three");
    }
}
