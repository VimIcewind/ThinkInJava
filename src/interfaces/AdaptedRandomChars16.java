// interfaces/AdaptedRandomChars16.java
// TIJ4 Chapter Inerfaces, Exercise 16, page 216
/* Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 *
 */
package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChars16 extends RandomChars implements Readable {
    private int count;

    public AdaptedRandomChars16(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars16(10));
        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
