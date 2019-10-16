/**
 * @(#)age.java
 *
 *
 * @author 
 * @version 1.00 2019/10/9
 */

import java.util.Scanner;
public class age {

    public static void main(String args[]) {
    	int	age;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("What age are you?");
    	age = input.nextInt();
    	
    	if(age >= 18)
    		System.out.println("\nYou are an adult!");
    	else
    		System.out.println("Get out minor!");	
    }
    
    
}