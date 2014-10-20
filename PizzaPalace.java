/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <change to your name>
 * @version <today's date>
 */
 
 import java.util.Scanner;

public class PizzaPalace {

	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   double totalPies = 0;
   
   System.out.println("Please enter the number of people eating pizza.");
   double numPeople = scnr.nextDouble();
   System.out.println("Please enter the number of slices per person.");
   double numSlice = scnr.nextDouble();
   System.out.println("Please enter the number of slices per pie.");
   double numPie = scnr.nextDouble();
   totalPies = (numPeople*numSlice)/numPie;
   System.out.println("You need to order " + Math.ceil(totalPies) + " pies.");

  	}

}
