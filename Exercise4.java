/**
 * @(#)Exercise4.java
 *
 *
 * @author 
 * @version 1.00 2019/10/18
 */

import java.util.Scanner;
public class Exercise4 {

    public static void main(String args[]) { 
    char charAsString;
    int days, month;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the month number: ");
    month = input.nextInt();
    
    switch (month)
    {
    	case 1:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 2:
    			days = 28;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 3:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 4:
    			days = 30;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 5:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 6:
    			days = 30;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 7:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 8:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 9:
    			days = 30;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 10:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 11:
    			days = 30;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	case 12:
    			days = 31;
    			System.out.println("\nThe number of days in this month is " + days);
    			break;
    	default:
    		 System.out.println("\nYou're so dumb, there's no month past 12");												
    } 	
    }
    
    
}