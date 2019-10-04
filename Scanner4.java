/**
 * @(#)Scanner4.java
 *
 *
 * @Jonathan O'Donovan Kelly 
 * @version 1.00 2019/10/4
 */

import java.util.Scanner;
public class Scanner4 {

    public static void main(String args[]) {
    	int speed, acceleration, time;
    	float distance;
    	
    	
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter the inital speed: ");
    	speed = input.nextInt();
    	
    	System.out.println("Please enter the acceleration: ");
    	acceleration = input.nextInt();
    	
    	System.out.println("Please enter the time spent travelling: ");
    	time = input.nextInt();
    	
    	distance = (speed*time)+(acceleration*time*time)/2;
    	
    	String output = ("The object traveled a distance of " + String.format("%.2f",(distance)) + " meters");
    	
    	System.out.println(output);
    	
    	
    }
    
    
}