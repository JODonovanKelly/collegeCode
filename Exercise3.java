/**
 * @(#)Exercise3.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.util.Scanner;
public class Exercise3 {

    public static void main(String args[]) {
    	float area;
    	final float HECTARES = 0.4046f;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter an area in acres: ");
    	area = input.nextFloat();
    	
    	String hectares = ("\nThis is equivalent to " + String.format("%.3f",(area*HECTARES)) + " hectares");
    	
    	System.out.println(hectares);
    }
    
    
}