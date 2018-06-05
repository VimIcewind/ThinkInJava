//: operators/BitManipulation.java
// Using the bitwise operators.
package operators;

import java.util.*;

import static net.mindview.util.Print.*;

/**
 * Created by HWD on 2018-6-5.
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("maxpos", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    }

    static void printBinaryInt(String s, int i) {
        print(s + ", int: " + i + ", binary:\n   " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        print(s + ", long: " + l + ", binary:\n   " + Long.toBinaryString(l));
    }
} /* Output:
-1, int: -1, binary:
   11111111111111111111111111111111
+1, int: 1, binary:
   1
maxpos, int: 2147483647, binary:
   1111111111111111111111111111111
maxneg, int: -2147483648, binary:
   10000000000000000000000000000000
i, int: -1172028779, binary:
   10111010001001000100001010010101
~i, int: 1172028778, binary:
   1000101110110111011110101101010
-i, int: 1172028779, binary:
   1000101110110111011110101101011
j, int: 1717241110, binary:
   1100110010110110000010100010110
i & j, int: 570425364, binary:
   100010000000000000000000010100
i | j, int: -25213033, binary:
   11111110011111110100011110010111
i ^ j, int: -595638397, binary:
   11011100011111110100011110000011
i << 5, int: 1149784736, binary:
   1000100100010000101001010100000
i >> 5, int: -36625900, binary:
   11111101110100010010001000010100
(~i) >> 5, int: 36625899, binary:
   10001011101101110111101011
i >>> 5, int: 97591828, binary:
   101110100010010001000010100
(~i) >>> 5, int: 36625899, binary:
   10001011101101110111101011
-1L, long: -1, binary:
   1111111111111111111111111111111111111111111111111111111111111111
+1L, long: 1, binary:
   1
maxpos, long: 9223372036854775807, binary:
   111111111111111111111111111111111111111111111111111111111111111
maxpos, long: -9223372036854775808, binary:
   1000000000000000000000000000000000000000000000000000000000000000
l, long: -8652529054300476342, binary:
   1000011111101100000010101010101100001101101011000110110001001010
~l, long: 8652529054300476341, binary:
   111100000010011111101010101010011110010010100111001001110110101
-l, long: 8652529054300476342, binary:
   111100000010011111101010101010011110010010100111001001110110110
m, long: 2955289354441303771, binary:
   10100100000011010011000000001010010011111101111010011011011011
l & m, long: 72066398748419146, binary:
   100000000000010000000001000000001101001000010010001001010
l | m, long: -5769306098607591717, binary:
   1010111111101111010011101010101110011111111111111110111011011011
l ^ m, long: -5841372497356010863, binary:
   1010111011101111010001101010100110011110010110111100101010010001
l << 5, long: -179768631971968704, binary:
   1111110110000001010101010110000110110101100011011000100101000000
l >> 5, long: -270391532946889886, binary:
   1111110000111111011000000101010101011000011011010110001101100010
(~l) >> 5, long: 270391532946889885, binary:
   1111000000100111111010101010100111100100101001110010011101
l >>> 5, long: 306069219356533602, binary:
   10000111111011000000101010101011000011011010110001101100010
(~l) >>> 5, long: 270391532946889885, binary:
   1111000000100111111010101010100111100100101001110010011101
*///:~
