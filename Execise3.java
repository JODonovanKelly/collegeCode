/**
 * @(#)Execise3.java
 *
 *
 * @author 
 * @version 1.00 2019/10/18
 */

import java.util.Scanner;
public class Execise3 {

    public static void main(String args[]) {
    	final float PI = 3.142f;
    	float radius, result;
    	char character;
    	String oneTwoThree;
    	
    	Scanner input = new Scanner(System.in);
    	
    	String beep = String.format("%-35s%-35s\n%-35s%-35s\n%-35s%-35s", " ", "1.Calculate the area of a circle", " ", "2.Calculate the volume of a sphere", " ", "3.Quit");
    	
    	System.out.println(beep);
    		
    	System.out.print("Please enter your choice <1-3>: ");
    	oneTwoThree = input.nextLine();
    	
    	character = oneTwoThree.charAt(0);
    	
    	if (oneTwoThree.equals("1"))
    	{
    		System.out.print("\nPlease enter the radius of the circle: ");
    		radius = input.nextFloat();
    		
    		result = PI*radius*radius;
    		
    		System.out.println("\nThe radius of the circle is "+String.format("%.3f",(result))+" meters squared");
    	}
    	else if (oneTwoThree.equals("2"))
    	{
    		System.out.print("\nPlease enter the radius of the sphere: ");
    		radius = input.nextFloat();
    		
    		result = ((PI*radius*radius*radius)/3)*4; 
    			
    		System.out.println("\nThe volume of the sphere is "+String.format("%.3f",(result))+" meters cubed");	
    	}
    	else if (oneTwoThree.equals("3"))
    	{
    		System.out.println("Thank you for using the System. Goodbye!");
    	}
    	else if (character >= '4' && character <= '9')
    		System.out.println("Sorry you must have entered an invalid choice - must be between 1 and 3");							
    }
    
    
}