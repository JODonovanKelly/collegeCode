/**
 * @(#)Exercise3.java
 *
 *
 * @author 
 * @version 1.00 2019/9/20
 */

import java.util.Scanner;
public class Exercise3 {

    public static void main(String args[]) {
    	
    	Float weight,height;
    	String name, address;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Name: ");
    	name = input.nextLine();
    	
    	System.out.print("Weight: ");
    	weight = input.nextFloat();
    	
    	System.out.print("Height: ");
    	height = input.nextFloat();
    	
    	input.nextLine();
    	
    	System.out.print("Address: ");
    	address = input.nextLine();
    	
    	System.out.println("\n\n\nName: "+name+"\nWeight: "+weight+"kg"+"\nHeight: "+height+"cm"+"\nAddress: "+address+"\n\n\n");
       }
    
    
}