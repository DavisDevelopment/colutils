package colutils;

import java.util.Scanner;
import java.lang.*;

public class Prompt {
    /* Constructor Function */
    public Prompt(String msg) {
        this.message = msg;
        this.input = new Scanner(System.in);
    }
    
/* === Instance Methods === */

    /**
     * Display the prompt itself
     */
    private void showmsg() {
        System.out.print(this.message);
    }

    /**
     * Get a line of textual input
     */
    public String str() {
        showmsg();
        return input.nextLine();
    }
    
    /**
     * Get a double
     */
    private Double num() {
        showmsg();
        return new Double(input.nextDouble());
    }
    
    /**
     * Get a double[]
     */
    public Double[] nums(int size) {
        showmsg();
        Double[] res = new Double[size];
        for (int i = 0; i < size; i++) {
            res[i] = new Double(input.nextDouble());
        }
        return res;
    }
    
    /**
     * Get a double
     */
    public double dbl() {
        return (num().doubleValue());
    }
    
    /* Get a float */
    public float flt() {
        return (num().floatValue());
    }
    
    /* Get an int */
    public int i() {
        return (num().intValue());
    }
    
/* === Instance Fields === */

    public String message;
    private Scanner input;
    
/* === Static Methods === */

    /* Prompt the user for a String */
    public static String sprompt(String msg) {
        return (new Prompt(msg).str());
    }
    
    /* Prompt the user for a double */
    public static double dprompt(String msg) {
        return (new Prompt(msg).dbl());
    }
}