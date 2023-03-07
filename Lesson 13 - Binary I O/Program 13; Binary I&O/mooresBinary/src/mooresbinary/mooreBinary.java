/*
 * Kyle Moore
 * Binary I/O
 * Thursday, April 29, 2021
 * This program will create five loan objects, and store them in a file named "MooreSerial.dat".
 * The program will also implement Serializable in the loan class of this program.
 */

package mooresbinary;

import java.io.*;

//Class: mooreBinary
public class mooreBinary {

    //main
    public static void main(String[] args) throws IOException {
        
        //Creates five loan objects - To write & store in file "mooreSerial.dat"
	Loan loan1 = new Loan();
	Loan loan2 = new Loan(2.5, 2, 3000);
	Loan loan3 = new Loan(3.25, 3, 6000);
	Loan loan4 = new Loan(4.0, 4, 10000.73);
	Loan loan5 = new Loan(5.9, 5, 36000.99);

        // Create an output stream for file "mooreSerial.dat"
	try (ObjectOutputStream output = new ObjectOutputStream(new 
	    BufferedOutputStream(new FileOutputStream("mooreSerial.dat")));
	    )   {
		//Write five loan objects to file "mooreSerial.dat"
		output.writeObject(loan1);
		output.writeObject(loan2);
		output.writeObject(loan3);
		output.writeObject(loan4);
		output.writeObject(loan5);
                
                output.flush(); //flushes the output stream, forcing any buffered output bytes to be written out
                
                output.close();
		}
        finally {
            //Scanner reader = new Scanner(new File("mooreSerial.dat"));
            System.out.println("\nSerialization has been successfully executed.\n");
        }
    }
}