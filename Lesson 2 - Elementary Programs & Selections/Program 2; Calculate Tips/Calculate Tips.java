/*Program Information:
    Kyle Moore                                                     
    Programming Assignment #2: Calculate Tips                 
    Due Tuesday, January 26, 2021                                  
                                                                   
    This program will prompt the user for a subtotal and gratuity rate, then compute the gratuity and total. It will then ask the user if they wish to pay the entire bill or split the bill between 2, 3, and 4 people. It will then display the amount each person in the party must pay to cover the bill. Afterwards, the program will display the gratuity and the total based on this criteria.
*/

//Retrieve Scanner Class from Java API
import java.util.Scanner;

//Class: Main
public class Assignment_2 {

  // Public Class: main
  public static void Calculate_Tips(String[] args) {

    // Declarations
    Scanner input = new Scanner(System.in); // Creates new Scanner object of the Scanner Class

    // Get subtotal & gratuityRate via user input
    System.out.print("\nPlease enter the subtotal and the gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    //Calculate gratuity & total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    // Display results
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);

    //Need to add option to pay entire bill or split in various quantities
  }
}