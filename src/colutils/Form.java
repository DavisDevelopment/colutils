package colutils;

import java.util.Hashtable;

public class Form {
    public Form() {
        this.fields = new Hashtable();
    }
    
    public void addField(String name, String message) {
        if (!this.fields.containsKey(name)) {
            this.fields.put(name, new Prompt(message));
        }
    }
    
    public void info(String message) {
        System.out.println( message );
    }
    
    public Prompt get(String name) {
        return this.fields.get( name );
    }
    
    public String sget(String n) {
        return get(n).str();
    }
    
    public double dget(String n) {
        return get(n).dbl();
    }
    
    public int iget(String n) {
        return get(n).i();
    }
    
    private Hashtable<String, Prompt> fields;
}