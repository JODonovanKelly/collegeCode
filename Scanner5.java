/**
 * @(#)Scanner5.java
 *
 *
 * @Jonathan O'Donovan Kelly 
 * @version 1.00 2019/10/4
 */

import java.util.Scanner;
public class Scanner5 {

    public static void main(String args[]) {
    	final float GRAVITATION = 6.67300E-11f;
    	float massOne, massTwo;
    	int distance;
    	float objectOne, objectTwo, objectDist, forceExerted;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter the mass in kg of the first object: ");
    	massOne = input.nextFloat();
    	
    	System.out.println("Please enter the mass in kg of the second object: ");
    	massTwo = input.nextFloat();
    	 
    	System.out.println("Please enter the distance in meters between the object: ");
    	distance = input.nextInt();
    	
    	forceExerted = GRAVITATION*massOne*massTwo/((float)distance*distance);
    	
    	String result = ("*****Results of Program*****\n\nThe mass of the first object is " + massOne + "kg" + "\nThe mass of the second object is " + massTwo + "kg" + "\nThe distance between the two objects is " + distance + "m" + "\nThe force exerted on the objects is " + String.format("%.2f",(forceExerted)) + "N");
    	
    	System.out.println(result); 
    }
    
    
}