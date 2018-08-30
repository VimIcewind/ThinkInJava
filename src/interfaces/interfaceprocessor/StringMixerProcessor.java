// interfaces/interfaceprocessor/StringMixerProcessor.java
// TIJ4 Chapter Interfaces, Exercise 11, page 211
/* Create a class with a method that takes a String argument and produces
 * a result that swaps each pair of characters in that argument. Adapt the
 * class so that it works with interfaceprocessor.Apply.process().
 *
 */
package interfaces.interfaceprocessor;

class StringMixerAdapter implements Processor {
    @Override
    public String name() {
        return "StringMixerAdapter";
    }

    StringMixer stringMixer;

    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    @Override
    public String process(Object input) {
        return stringMixer.process((String)input);
    }
}

public class StringMixerProcessor {
    public static void main(String[] args) {
        String s = new String(args[0]);
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
