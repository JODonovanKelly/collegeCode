/**
 * @(#)Exercise 2.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */

import java.util.Scanner;
public class Exercise2 {

    public static void main(String args[]) {
    float radius, height;
    final float PI = 3.142f;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the radius of the cylinder: ");
    radius = input.nextFloat();
    	
   	System.out.println("Please enter the height of the cylinder: ");
    height = input.nextFloat();
    	
    String cylinder = ("\n\n=====Calculation Result=====\n\nVolume of cylinder is " + String.format("%.2f",(PI*(radius*radius)*height)) + " meters squared");
    	
    System.out.println(cylinder);	
    	
    }
    
    
}