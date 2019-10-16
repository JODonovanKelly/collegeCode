/**
 * @(#)PhoneOne.java
 *
 *
 * @author 
 * @version 1.00 2019/10/16
 */

import java.util.Scanner;
public class PhoneOne {

    public static void main(String args[]) {
    	float cost, units;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Please enter the number of units used: ");
    	units = input.nextInt();
    	
    	if (units == 0)
    	{
    		System.out.println("Stop wasting my time");	
    	}
    	if (units <= 99)
    	{ 
    	 	cost = units*0.05f;
    	 	System.out.println("The cost of your mobile bill is EUR" + String.format("%.2f",(cost)));
    	}  
    	  
    	else if (units <= 299)
    	{
    	  	cost = (units-99)*0.03f+4.95f;
    	 	System.out.println("The cost of your mobile bill is EUR" + String.format("%.2f",(cost)));
    	}
    	else if (units <= 399)
    	{
    		cost = (units-299)*0.02f+10.95f;
    	 	System.out.println("The cost of your mobile bill is EUR" + String.format("%.2f",(cost)));
    	}	  	
    	else if (units > 399)
    	{
    		cost = (units-399)*0.01f+12.95f;
    		System.out.println("The cost of your mobile bill is EUR" + String.format("%.2f",(cost)));
    	}	
    		
    
    	
    	
    	
    }
    
    
}