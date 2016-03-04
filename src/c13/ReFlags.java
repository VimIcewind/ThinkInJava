//: ReFlags.java
package c13;

import java.util.regex.*;

public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                "Java has pretty good regular expressions\n" +
                "Regular expressions are in Java");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
