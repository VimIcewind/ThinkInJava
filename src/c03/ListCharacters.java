//: c03.ListCharacters.java
// Demonstrates "for" loop by listing
// all the ASCII characters.
package c03;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (c != 26) { // ANSI Clear screen
                System.out.println("c03.Value: " + (int) c + "character: " + c);
            }
        }
    }
}
