/**
 * @(#)simpleIf.java
 *
 *
 * @Jonathan O'Donovan Kelly 
 * @version 1.00 2019/10/9
 */

import java.util.Scanner;
public class simpleIf {

    public static void main(String args[]) {
    	String answerAsString;
    	char answer;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Do you like Java (y/n)?");
    	answerAsString = input.nextLine();
    	
    	answer = answerAsString.charAt(0);
    	
    	if(answer == 'y')
    		System.out.println("\nWell it's not like I like you too or anything, Idiot!");
    		
    	if(answer == 'n')
    		System.out.println("\nFeeling's mutual Jackass!");	
    }
    
    
}