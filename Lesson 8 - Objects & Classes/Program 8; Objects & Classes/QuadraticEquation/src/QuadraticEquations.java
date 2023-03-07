/*
 * Kyle Moore
 * Objects & Classes
 * Tuesday, March 23, 2021
 * This program will use the formula for the quadratic equation to calculate and display the roots (if any) of a quadratic equation to the user, based on the user's input for the values of a, b, and c.
 */

import java.util.Scanner;

//Class: QuadraticEquations
public class QuadraticEquations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //Prompt User to Input Coefficients
        System.out.println("Enter a, b, c: ");

        //Retrieves User Input as Double Values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        mooreObjects qe = new mooreObjects(a, b, c);     

        //Positive Discriminant Yields 2 Roots
        if (qe.getDiscriminant() > 0) {
            System.out.println("The equation has two roots: " + (String.format("%.6f", qe.getRoot1())) + " and " + (String.format("%.5f", qe.getRoot2())));
        }
        
        //Discriminant of Value 0 Yields 0
        else if (qe.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + qe.getRoot1());
        }
        
        //Error Handler: No Root Exists for the Equation
        else {
            System.out.println("The equation has no root.");
        }
    }
}