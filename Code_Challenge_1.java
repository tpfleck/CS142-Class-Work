/**
 * 
 * This program will help calculate X raised to the power of Y.
 * 
 * @author Tyler
 *
 */

import java.io.*;

public class Code_Challenge_1 {

	public static void main(String[] args) throws IOException {
		
		/* Declare the variables */
		
		double X, Y, Z;
		
		/* Do the computations */
		System.out.print("What is your first number? ");
		X = TextIO.getlnInt();
		
		System.out.print("What is your second number? ");
		Y = TextIO.getlnInt();
		Z = Math.pow(X, Y); // This raises X to the Y power.
		
		/* System will now output the answer */
		
		System.out.print("The answer to this problem is: " + Z);
		
	}
	
}
