//: MainException.java
package c12;

import java.io.*;

public class MainException {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("src/c12/MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
} ///:~
