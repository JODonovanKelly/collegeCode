/**
 * @(#)ArithmeticOperators.java
 *
 *
 * Jonathan O'Donovan Kelly 
 * @version 1.00 2019/10/2
 */

import java.util.Scanner;
public class ArithmeticOperators {

    public static void main(String args[]) {
    	float firstNumber, secondNumber;
    	
    	Scanner input= new Scanner(System.in);
    	
    	System.out.println("Please enter any number: ");
    	firstNumber = input.nextFloat();
    	
    	System.out.println("Please enter any number: ");
    	secondNumber = input.nextFloat();
    	
    	String maths = ("\n\n***********Results of Arithmetic Calculaions***********\n\n" + firstNumber + " + " + secondNumber + " is " + String.format("%.3f",(firstNumber + secondNumber)) + "\n" +	firstNumber + " - " + secondNumber + " is " + String.format("%.3f",(firstNumber - secondNumber)) + "\n" + firstNumber + " * " + secondNumber + " is " + String.format("%.3f",(firstNumber * secondNumber)) + "\n" + firstNumber + " / " + secondNumber + " is " + String.format("%.3f",(firstNumber / secondNumber)) + "\n" + firstNumber + " % " + secondNumber + " is " + String.format("%.3f",(firstNumber % secondNumber)));
    		
    	System.out.println(maths);	
    }
    
    
}