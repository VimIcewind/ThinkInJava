// interface.TestEx6.java
// TIJ4 Chapter Interfaces, Exercise 6, page 207
// Prove that all the methods in an interface are automatically public
package interfaces;

import interfaces.ex6.Ex6b;

public class TestEx6 {
    public static void main(String[] args) {
        Ex6b x = new Ex6b();
        x.sayOne();
        x.sayTwo();
        x.sayThree();
    }
}
