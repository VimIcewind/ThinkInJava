// TIJ4 Chapter Holding, Exercise 25
/* Create a Map<String, ArrayList<Integer>>. Use net.mindview.TextFile
 * to open a text file and read it in a word at a time (use "\\W+\" as
 * the second argument to the TextFile constructor). Count the words as
 * you read them in, and for each wod in the file, record in the
 * ArrayList<Integer> the word count associated with that word - that is,
 * in effect, the location in the file where that word was found.
 */
package holding.ex25;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by HWD on 2019-3-1 16:17
 */
public class Ex25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> m = new LinkedHashMap<String, ArrayList<Integer>>();
        List<String> words = new LinkedList<String>();
        words.addAll(new TextFile("E:/GitHub/ThinkInJava/src/holding/SetOperations.java", "\\W+"));
        System.out.println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while (itWords.hasNext()) {
            String s = (String) itWords.next();
            count++;
            if (!m.keySet().contains(s)) {
                ArrayList<Integer> ai = new ArrayList<Integer>();
                ai.add(0, count);
                m.put(s, ai);
            } else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println("Map of word locations: " + m);
    }
}
