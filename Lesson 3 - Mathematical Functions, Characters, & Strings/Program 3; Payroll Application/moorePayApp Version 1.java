/*
 * Kyle Moore
 * Payroll Application
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
	double grossPay, federalWithholdRate, stateWithholdRate, totalDeduction;

	// Prompt user for input for payroll information
        //Prompt user for name, hoursWorked, hourlyPayRate, federalTaxRate
	System.out.print("Enter the employee’s name: ");
	String name = input.next();	
	System.out.print("Enter the number of hours worked in a week: ");
	double hoursWorked = input.nextDouble();
	System.out.print("Enter the hourly pay rate: ");
	double hourlyPayRate = input.nextDouble();
	System.out.print("Enter the federal tax withholding rate: ");
	double federalTaxRate = input.nextDouble();
	System.out.print("Enter the state tax withholding rate: ");
	double stateTaxRate = input.nextDouble();
        
        // Display payroll statement to user
        //Display name, hoursWorked, hourlyPayRate
        //Compute & Display grossPay, federalWithholdRate, stateWithholdRate, totalDeduction
	System.out.printf(
	    "Employee Name: " + name + 
	    "\nHours Worked: " + hoursWorked +
	    "\nPay Rate: $" + hourlyPayRate +
	    "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
	    "\nDeductions:\n   Federal Witholding (20.0%): $" +
	    (federalWithholdRate = grossPay * federalTaxRate) +
	    "\n   State Witholding (9.0%): $" + (stateWithholdRate = grossPay * stateTaxRate) +
            "\n   Total Deduction: $" + (totalDeduction = federalWithholdRate + stateWithholdRate) +
	    "\nNet Pay: $" + (grossPay - totalDeduction)
	);
    }
}