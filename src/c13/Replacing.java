//: Replacing.java
package c13;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("Shrubbery|tree|herring", "banana"));
    }
}
