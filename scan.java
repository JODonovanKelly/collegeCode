/**
 * @(#)scan.java
 * @Jonathan O'Donovan Kelly 
 * @version 1.00 2019/9/20
 */

import java.util.Scanner;

public class scan {

    public static void main(String args[]) {
    	int numberOfCPU, RAM;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter the number of CPUs on your computer: ");
    	numberOfCPU = input.nextInt();
    	
    	System.out.println("Please enter the total amount of RAM in your computer in MB: ");
    	RAM = input.nextInt();
    	
    	System.out.println("\n\n\nThe details you entered were as follows:\n\nNumber of "+"CPUs: "+numberOfCPU+"\nAmount of RAM: "+RAM+"MB\n\n\n");
    }
    
    
    
}
