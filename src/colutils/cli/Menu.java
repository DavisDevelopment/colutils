package colutils.cli;

import java.lang.HashMap;

public class Menu<T> {
    public Menu(String title) {
        this.title = title;
        this.options = new HashMap();
    }
    
/* === Instance Methods === */

    /* Add an option to [this] Menu */
    public void option(String desc, String name, T value) {
        if (!options.containsKey(desc)) {
            options.put(name, new Option(desc, value));
        }
    }
    
    /* Show [this] Menu, and return the chosen option */
    public T show() {
        Prompt p = new Prompt()
    }
    
    private OutputString buildMessage() {
        OutputString s = new OutputString();
        s.leading("-");
        s.append( title );
        s.indent( 4 );
        s.newline();
        Option<T> longest = getLongestOption();
        for (String name : options.keySet()) {
            Option<T> opt = options.get(name);
            int dif = (longest.description.length - opt.description.length);
            s.repeat("-", dif);
            s.append( opt.description );
            s.repeat(".", 8);
            s.append()
        }
    }
    
    private Option<T> getLongestOption() {
        Option<T> longest = null;
        for (Option<T> o : options) {
            if (longest == null || o.description.length > longest.description.length)
                longest = o;
        }
        return longest;
    }
    
/* === Instance Fields === */

    private String title;
    private HashMap<String, Option<T>> options; 
}

class Option<T> {
    public String description;
    public T value;
    
    /**
     * Constructor
     */
    public Option(String desc, T val) {
        description = desc;
        value = val;
    }
}