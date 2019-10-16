/**
 * @(#)ifElse.java
 *
 *
 * @author 
 * @version 1.00 2019/10/9
 */

import java.util.Scanner;
public class ifElse {

    public static void main(String args[]) {
    	String answer;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("What is half a byte called - (One word please)?");
    	answer = input.nextLine();
    	
    	if (answer.toLowerCase().equals("nibble"))
    		System.out.println("\nDamn right it is.");
    	else
    		System.out.println("Nah, it's a \"nibble\".");			
    }
    
    
}