/**
 * @(#)PhoneProviders.java
 *
 *
 * @author 
 * @version 1.00 2019/10/11
 */

import java.util.Scanner;
public class PhoneProviders {

    public static void main(String args[]) {
    	
    	String provider;
    	float totalCalls, callsUSA, callsAUS, callsRUS, totalAmount;
    	final float VUSA = 0.06f, EUSA = 0.19f, VAUS = 0.08f, EAUS = 0.85f, VRUS = 0.24f, ERUS = 0.92f;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Which service did you use for calls? (V - Vartec, E - Eircom): ");
    	provider = input.nextLine();
    	
    	if (provider.toLowerCase().equals("v"))
    	{
    		System.out.print("Please enter the total number of calls made in the month: ");
    		totalCalls = input.nextFloat();
    		
    		if (totalCalls == 0)
    		{
    			System.out.println("Thank you for your time....Goodbye");
    		}
    		else
    		{
    		System.out.print("Please enter the total number of minutes spent calling the USA: ");
    		callsUSA = input.nextFloat();
    		
    		System.out.print("Please enter the total number of minutes spent calling Australia: ");
    		callsAUS = input.nextFloat();
    			
    		System.out.print("Please enter the total number of minutes spent calling Russia: ");
    		callsRUS = input.nextFloat();
    		
    		totalAmount=(callsUSA*VUSA)+(callsAUS*VAUS)+(callsRUS*VRUS);
    		
    		System.out.println("The total cost of using the Vartec Servive for the month is EUR"+String.format("%.2f",(totalAmount))+"\n\nThe average cost per call made is EUR"+String.format("%.2f",(totalAmount/100)));
    		} 
    	}
    	else
    	{
    		
    		if (provider.toLowerCase().equals("e"))
    			{
    			System.out.print("Please enter the total number of calls made in the month: ");
    			totalCalls = input.nextFloat();
    		
    			if (totalCalls == 0)
    			{
    			System.out.println("Thank you for your time....Goodbye");
    			}
    		
    			else
    			{		
    			System.out.print("Please enter the total number of minutes spent calling the USA: ");
    			callsUSA = input.nextFloat();
    		
    			System.out.print("Please enter the total number of minutes spent calling Australia: ");
    			callsAUS = input.nextFloat();
    			
    			System.out.print("Please enter the total number of minutes spent calling Russia: ");
    			callsRUS = input.nextFloat();
    		
    			totalAmount=(callsUSA*EUSA)+(callsAUS*EAUS)+(callsRUS*ERUS);
    		
    			System.out.println("The total cost of using the Eircom Servive for the month is EUR"+String.format("%.2f",(totalAmount))+"\n\nThe average cost per call made is EUR"+String.format("%.2f",(totalAmount/100))); 
    			}	
    		}
    		else{
    			System.out.println("Sorry - incorrect choice, it must be (V)artec or (E)ircom....Goodbye");
    		}	
    	}
    }
    
    
}