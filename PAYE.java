/**
 * @(#)PAYE.java
 *
 *
 * @author 
 * @version 1.00 2019/10/9
 */

import java.util.Scanner;
public class PAYE {

    public static void main(String args[]) {
    int grossIncome, pensionPayment, cutOffPoint, taxCredits;
    float PAYE;
    final float TWENTY_PERCENT = 0.2f, FORTYTWO_PERCENT = 0.42f;
    
    Scanner input = new Scanner(System.in);
    
     System.out.print("Please enter your gross income: ");
     grossIncome = input.nextInt();
     
     System.out.print("Please enter your pension payment: ");
     pensionPayment = input.nextInt();
     
     System.out.print("Please enter your cut-off point: ");
     cutOffPoint = input.nextInt();
     
     System.out.print("Please enter your tax-credits: ");
     taxCredits = input.nextInt();
     
    
     if (grossIncome > cutOffPoint)
     	{
     	PAYE = (cutOffPoint*TWENTY_PERCENT)+((grossIncome-cutOffPoint-pensionPayment)*FORTYTWO_PERCENT)-taxCredits;
     	System.out.println("\nThe PAYE due by this employee is EUR" + String.format("%.2f",(PAYE)));
     	}
     else
     	{
     	PAYE = ((grossIncome-pensionPayment)*TWENTY_PERCENT)-taxCredits;
     	System.out.println("\nThe PAYE due by this employee is EUR" + String.format("%.2f",(PAYE)));
    	}		
    }
    
    
}