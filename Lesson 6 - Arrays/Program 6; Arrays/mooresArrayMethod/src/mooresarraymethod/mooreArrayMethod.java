/*
 * Kyle Moore
 * Arrays
 * Wednesday, February 24, 2021 (Now Due Friday, April 9, 2021)
 * This program will implement an ArrayMethod Class's Application, consisting of five methods. Their purposes are to display all integers in both standard and reverse sequence, display the sum of all the integers, display all values less than a limiting argument, and display all values higher than a calculated average value.
 */

package mooresarraymethod;

//Class: mooreArrayMethod
public class mooreArrayMethod {

    //main
    public static void main(String[] args) {

        //Declarations
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;

        //Method Calls with arguments
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }

        //Method: display - Displays all elements in the array
        public static void display(int[] arr) {

            System.out.print("\nDisplaying all integers in the array: ");
            
            //Count-Controlled Loop - Loop through array to display each element
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        //Method: displayReverse - Displays all elements in the array in reverse
        public static void displayReverse(int[] arr) {

            System.out.print("\nDisplaying all integers in the array in reverse order: ");

            //Count-Controlled Loop - Loop through array backwards to display all the array elements in reverse
            for(int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }

        //Method: displaySum - Displays the sum of all of the values of the elements in the array
        public static void displaySum(int[] arr) {

            //Initializes sum to find summation
            int sum = 0;

            //Count-Controlled Loop - Loop through array to add each array element value to sum
            for(int i = 0; i < arr.length; i++) { 
                sum += arr[i];
            }

            System.out.println("\nThe sum of the integers in the array is: " + sum);
        }

        //Method: displayLessThan - Displays all values less than the limiting argument
        public static void displayLessThan(int[] arr, int limit) {

            System.out.print("Displaying all values less than the limiting argument (" + limit + "): ");

            //Count-Controlled Loop - Loop through array - checks and displays each element value that is less than the limiting argument
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < limit) {
                   System.out.print(arr[i] + " ");
                }
            }
        }

        //Method: displayHigherThanAverage - Displays all values that are higher than the calculated average value of the array
        public static void displayHigherThanAverage(int[] arr) {

            //Scope Declarations
            int sum = 0;

            //Count-Controlled Loop - Loop through array to add each array element value to sum (Same code as in displaySum Method)
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            
            double average = sum / arr.length;

            System.out.print("\nDisplaying all values higher than the calculated average value (" + average + "): ");

            //Count-Controlled Loop - Loop through array - checks and displays each element value that is greater than average
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > average) {
                  System.out.print(arr[i] + " ");
                }
            }

            System.out.println("\n");
        }
}