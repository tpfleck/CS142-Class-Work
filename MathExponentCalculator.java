/**
 * 
 * Instructions: After clicking 'Run', a GUI will appear asking for 
 * a few things. Select the option you desire. You'll be asked to enter your name, 
 * pick your first number, then pick your second number.
 * The equation looks like: x^y=z. 
 * 
 * Begin and enjoy!
 * 
 * @author Tyler Fleckenstein
 * 
 * Author Notes: I am using a variety of options here to achieve the same goal.
 * First I am running the program through a GUI interface using javax.swing.JOptionPane,
 * also known as just JOptionPane. If the choice to not use the GUI is selected, then
 * we resort to using the Java console, receiving input using TextIO.java or also known
 * as just TextIO.
 * 
 * If there any criticism you can give me with this, please feel free to share!
 * 
 */

import javax.swing.JOptionPane;

public class MathExponentCalculator {
	
	public static void main(String[] args) {
		
		String inputName; // For reading first name input
		String input_X_Value; // For reading X value input
		String input_Y_Value; // For reading Y value input
		double xValue, yValue, xyResult; // x^y result
		
		Object[] options = {"GUI", "Console"};
		int inputDialogButton = JOptionPane.showOptionDialog(null,
				"Would you like to use the Java console or GUI input?",
				null,
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, 
				options, 
				options[0]);
			
		// System will check if you clicked 'GUI'
		if (inputDialogButton == JOptionPane.YES_OPTION) {
		
			JOptionPane.showMessageDialog(null, 
			"You have selected the GUI interface.");
			
			// Enter your name input dialog
			inputName = JOptionPane.showInputDialog("What is your first name?");
			if (inputName == null) System.exit(0);
		
			// Enter your X value
			input_X_Value = JOptionPane.showInputDialog("What is your first number?");
			if (input_X_Value == null) System.exit(0);
			
			// Enter your Y value
			input_Y_Value = JOptionPane.showInputDialog("What is your second number?");
			if (input_Y_Value == null) System.exit(0);
			
			// Convert input_X_Value to a double string
			xValue = Double.parseDouble(input_X_Value);
		
			// Convert input_Y_Value to a double string
			yValue = Double.parseDouble(input_Y_Value);
		
			// Calculates your problem: x^y=z
			xyResult = Math.pow(xValue, yValue);
	
			JOptionPane.showMessageDialog(null, 
			"The answer you seek is " + 
			xyResult + ", " + inputName + ".");
			
			// End of the program.
			System.exit(0);
			
			// System will check if you closed the window
		} else if (inputDialogButton == JOptionPane.CLOSED_OPTION) {
				
				// End of the program.
				System.exit(0);
			
		// System will check if you selected 'Console'
		} else {
			
			JOptionPane.showMessageDialog(null, 
			"You have selected the Java console." + 
			"\n" + "Please enter your answers below:");
			
			System.out.print("What is your first name? ");
			inputName = TextIO.getlnWord();
			
			System.out.print("What is your first number? ");
			xValue = TextIO.getlnDouble();
			
			System.out.print("What is your second number? ");
			yValue = TextIO.getlnDouble();
			
			xyResult = Math.pow(xValue, yValue);
			
			System.out.print("The answer you seek is " + 
			xyResult + ", " + inputName + ".");
			
			// End of the program.
			System.exit(0);
			
		}
	}
}