package colutils.io;

public class OutputString {
    /* Constructor Function */
    public OutputString() {
        d = "";
    }
    
/* === Instance Methods === */

    /* Get [str], repeated [n] times */
    private String repeat(String str, int n) {
        String result = str;
        for (int i = 0; i < n-1; i++) {
            result += str;
        }
        return result;
    }
    
    /**
     * Append some data to [this] String
     */
    public void append(Object data) {
        d += data.toString();
    }
    
    /**
     * Start a new line
     */
    public void newline() {
        append("\n");
        if (indentLevel > 0)
            append(repeat(" ", indentLevel));
    }
    
    /**
     * Increase [indentLevel] by [n]
     */
    public void indent(int n) {
        indentLevel += n;
    }
    
    /**
     * Decrease [indentLevel] by [n]
     */
    public void dedent(int n) {
        indentLevel -= n;
        if (indentLevel < 0)
            indentLevel = 0;
    }
    
    /**
     * Cast to a String
     */
    public String toString() {
        return this.d;
    }
    
/* === Instance Fields === */

    private String d;
    private int indentLevel;
}