/*
 * Kyle Moore
 * Payroll Application (Strings)
 * Tuesday, February 2, 2021 (Now Due Friday, April 23, 2021)
 * This program will retrieve an Employee name, number of hours worked in a week, hourly pay rate, federal tax withholding rate, and state tax withholding rate, and print a payroll statement of all information entered.
 * In addition, it will display the gross pay, federal withholding dollar amount, state withholding dollar amount, total deductions, and net pay.
 */

package moorespayapp;

import java.util.Scanner;

//Class: moorePayApp
public class moorePayApp {

    //main
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declarations (to compute & display)
	double grossPay, federalWithholdRate, stateWithholdRate, totalDeduction, netPay;

	// Prompt user for input for payroll information
        //Prompt user for name, hoursWorked, hourlyPayRate, federalTaxRate, stateTaxRate
        //While Loops - Input Validation/Error Handlers: Allows an invalid entry to be reentered - No invalid values accepted
	System.out.print("\nEnter employee’s name (e.g. John_Doe): ");
	String name = input.next();
        
	System.out.print("Enter number of hours worked in a week (e.g. 40): ");
	double hoursWorked = input.nextDouble();
        
        while (hoursWorked < 0) {
            System.out.print("Invalid input. Please reenter a valid value for hours worked in a week: ");
            hoursWorked = input.nextDouble();
        }
        
	System.out.print("Enter hourly pay rate (e.g. 15.50): ");
	double hourlyPayRate = input.nextDouble();
        
        while (hourlyPayRate < 0) {
            System.out.print("Invalid input. Please reenter a valid value for hourly pay rate: ");
            hourlyPayRate = input.nextDouble();
        }
        
	System.out.print("Enter federal tax withholding rate (e.g. 15% as .15): ");
	double federalTaxRate = input.nextDouble();
        
        while (federalTaxRate < 0 && federalTaxRate < 100) {
            System.out.print("Invalid input. Please reenter a valid value for federal tax withholding rate: ");
            federalTaxRate = input.nextDouble();
        }
        
	System.out.print("Enter state tax withholding rate (e.g. 5% as .5): ");
	double stateTaxRate = input.nextDouble();
        
        while (stateTaxRate < 0 && stateTaxRate < 100) {
            System.out.print("Invalid input. Please reenter a valid value for state tax withholding rate: ");
            stateTaxRate = input.nextDouble();
        }
        
        
        
        // Display payroll statement to user
        //Display name, hoursWorked, hourlyPayRate
        //Compute & Display grossPay, federalWithholdRate, stateWithholdRate, totalDeduction
        System.out.println("\n----------Payroll Statement----------");
	System.out.println("\nEmployee Name: " + name);
	System.out.println("Hours Worked: " + String.format("%.2f", hoursWorked));
	System.out.println("Pay Rate: $" + String.format("%.2f", hourlyPayRate));
	System.out.println("\nGross Pay: $" + String.format("%.2f", (grossPay = hoursWorked * hourlyPayRate)));
        
	//System.out.println("\n             Deductions: ");
        System.out.printf("\n\nFederal Witholding (%.1f%%): $%.2f", (federalTaxRate * 100), (federalWithholdRate = grossPay * federalTaxRate));
	System.out.printf("\nState Witholding (%.1f%%): $%.2f", (stateTaxRate * 100), (stateWithholdRate = grossPay * stateTaxRate));
        System.out.println("\n____________________________________________+");
        System.out.println("Total Deductions: $" + String.format("%.2f", (totalDeduction = federalWithholdRate + stateWithholdRate)));
        
        
        System.out.println("\n\nGross Pay: $" + String.format("%.2f", (grossPay = hoursWorked * hourlyPayRate)));
        System.out.println("Total Deductions: $" + String.format("%.2f", (totalDeduction = federalWithholdRate + stateWithholdRate)));
        System.out.println("____________________________________________-");
        System.out.println("\nNet Pay: $" + String.format("%.2f", (netPay = grossPay - totalDeduction)));
    }
}