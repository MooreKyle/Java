/*
 * Kyle Moore
 * Loops
 * Tuesday, February 9, 2021 (Now Due Friday, April 23, 2021)
 * This program will prompt the user for an amount, annual interest rate, and number of months. It will use this information to calculate and display the amount in the savings account after that given month.
 */

package mooresloops;

import java.util.Scanner;
//import java.util.InputMismatchException;

//Class: mooreLoops
public class mooreLoops {
    
    //main
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	// Prompt user to input an amount, annual interest rate and the number of months & retrieve these values
        //Prompt user for input for amount
	System.out.printf("\nEnter an amount: ");
	double amount = input.nextDouble();
        
        //Input Validation/Error Handler: User must enter positive value for amount
        while(amount < 0) {
            System.out.printf("Invalid input. Please reenter a valid value for amount: ");
            amount = input.nextDouble();
        }
        
        //Prompt user for input for annualInterestRate
	System.out.printf("Enter an annual interest rate: ");
	double annualInterestRate = input.nextDouble();
        
        //Input Validation/Error Handler: User must enter positive value for annualInterestRate
        while (annualInterestRate < 0) {
            System.out.printf("Invalid input. Please reenter a valid value for annual interest rate: ");
            annualInterestRate = input.nextDouble();
        }
        
        //Prompt user for input for months
	System.out.printf("Enter the number of months: ");
	int months = input.nextInt();
        
        //Input Validation/Error Handler: User must enter positive value for months between 1 and 12
        while (months < 0) {
            System.out.printf("Invalid input. Please reenter a valid value for months: ");
            months = input.nextInt();
        }
        
        
	// Compute monthly interest rate
	double monthlyInterestRate = annualInterestRate / 1200;

	// Compute amount in savings account after the given month
	double compoundInterest = 0;
        
        // Counter-Controlled Loop: Calculates Compound Interest based on number of months
	for (int m = 1; m <= months; m++) {
	    compoundInterest = (amount + compoundInterest) * (1 + monthlyInterestRate);
        }

	// Display compoundInterest to user
	System.out.printf("\nThe amount in your savings account after " + months + " months is: $%.2f\n", compoundInterest); // precision set to 2 decimal places
    }
}