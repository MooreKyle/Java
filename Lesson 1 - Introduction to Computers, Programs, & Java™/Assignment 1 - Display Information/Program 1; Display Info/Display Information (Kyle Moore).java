//Class: Main
class Main {
  //Public Class: main
  public static void main(String[] args) {

    /*Program Information:
    Kyle Moore                                                     
    Programming Assignment #1: Display Information                 
    Due Tuesday, January 19, 2021                                  
                                                                   
    This program will calculate and display the area and perimeter of a rectangle
    with a width of 4.5 and a height of 9.7 using the following formulas:
      area = width * height
      perimeter = (2 * width) + (2 * height)
    */

    //Declarations
    double width = 4.5;
    double height = 9.7;
    double perimeter = (2 * width) + (2 * height); //Calculate perimeter
    double area = width * height; //Calculate area

    //Assignment/Executable Statements
    //Display area & perimeter of rectangle on separate lines to user
    System.out.println("\nThe area of the rectangle is " + area);
    System.out.println("The perimeter of the rectangle is " + perimeter);
  }
}