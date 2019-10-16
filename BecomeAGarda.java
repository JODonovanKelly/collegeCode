/**
 * @(#)BecomeAGarda.java
 *
 *
 * @author 
 * @version 1.00 2019/10/16
 */

import java.util.Scanner;
public class BecomeAGarda {

    public static void main(String args[]) {
    	int age, weight;
    	float height;
    	String gender, criminalRecord, irishLeavingCert, irishCourse;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Please enter your age: ");
    	age = input.nextInt();
    	
    	System.out.print("Please enter your height in meters: ");
    	height = input.nextFloat();
    	
    	System.out.print("Please enter your weight in KG: ");
    	weight = input.nextInt();
    	
    	System.out.println("Please enter your gender <m or f>: ");
    	gender = input.nextLine();
    	gender = input.nextLine();
    	
    	System.out.println("Do you have a criminal record <y or n>: ");
    	criminalRecord = input.nextLine();
    	
    	System.out.println("Did you receive at least a D grade in pass Irish in the Leaving Cert <y or n>: ");
    	irishLeavingCert = input.nextLine();
    	
    	if ((age>=18 && age<=35) && ((height>=1.85 && gender.equals("m")) || (height>=1.6 && gender.equals("f"))) && weight<100 && criminalRecord.equals("n") && irishLeavingCert.equals("y"))
    	{
    		System.out.println("\nYou can be a Pig");
    	}
    	else if ((age>=18 && age<=35) && ((height>=1.85 && gender.equals("m")) || (height>=1.6 && gender.equals("f"))) && weight<100 && criminalRecord.equals("n") && irishLeavingCert.equals("n"))
    	{
    		System.out.println("\nDo you commit to taking a 10 week Irish course on application <y or n>: ");
    		irishCourse = input.nextLine();
    		
			if (irishCourse.equals("y"))
			{
				System.out.println("\nYou can be a pig");
			}
			else
			{
				System.out.println("\nYou'll never be good enough to be one of us");
			}			
    	}
    	else
    	{
    		System.out.println("\nYou'll never be good enough to be one of us");
    	}			
    }
    
    
}