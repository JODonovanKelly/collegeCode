/**
 * @(#)Exercise2.java
 * @Jonathan O'Donovan Kelly 
 * @version 1.00 2019/9/20
 */


public class Exercise2Formatted {

    public static void main(String args[]) {
    	int pages = 317, year = 1999;
    	String author = "J.K. Rowling", title = "Harry Potter and the Prisoner of Azkaban", name = "Author:", subject = "Title:", sheets = "Pages:", date = "Year:", cost = "Price:", eur = "EUR";
    	float price = 35.50f;
    	
    	String formatString = String.format("%-10s%-1s\n%-10s%-1s\n%-10s%-1d\n%-10s%-1d\n%-10s%-3s%.2f", subject,title,name,author,sheets,pages,date,year,cost,eur,price);
    		
    	System.out.println(formatString);
    }
    
    
}