//ttytgki.java
import java.util.Scanner;
public class JonathanODonovanKelly {

    public static void main(String args[]) {
    int moons;
    float speed = 13.074f;
    String name = "Planet Name", orbit = "Orbital Speed", number = "Number of Moons", jupiter;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the name of the planet: ");
    jupiter = input.nextLine();
    
    System.out.println("Please enter the number of moons of the planet: ");
    moons = input.nextInt();
    
    String formatString = String.format("%-20s%7s\n%-20s%-7.3fkm/s\n%-20s%2d", name, jupiter, orbit, speed, number, moons);
   	
   	System.out.println("\n\n\n\t\t++++++++++++++++++++++++++++\n\t\t\t\tPlanet Data\n\t\t++++++++++++++++++++++++++++\n\n\n"+formatString);		
    }
    
    
}