import java.awt.*;
import javax.swing.*;


public class TurtleGraphics {

	/**
	 * A global variable representing a "turtle" that moves
	 * around in a window, drawing lines as it moves.  The
	 * turtle has a number of built-in subroutines such as
	 * turtle.forward(distance) and turtle.turn(angle).
	 */

	private static TurtlePanel turtle;
	
	
	public static void turtleSquare(int ) {
		
		
	} // End of turtleSquare()
	
	
	private static void turtleBurst() {
		
		for (int i = 0; i < 500; i++) {	
			turtle.setDelay(0);
			turtle.forward(Math.random()*8+1);
			turtle.randomColor();
			turtle.moveTo(0, 0);
			turtle.face(Math.random()*360+5);
			turtle.lineWidth(Math.random()*4);
		} // End of Loop
		
	} // End of turtleBurst()
	
	
	private static void turtleStar(double starSize) {
		
		for (int i = 0; i < 5; i++) {
			turtle.forward(starSize);
			turtle.turn(-144);
		 }	
	}
	
	public static void main(String[] args) {
		
		createTurtle();  // Create the turtle object, and show its window on the screen.
		
		// Exercise 1: First Turtle Drawing
		
		// for (int i = 0; i < 3; i++) {
		//	turtle.setDelay(250);
		//	turtle.color(Color.RED);
		//	turtle.forward(6);
		//	turtle.turn(120);
		// }
		
		// turtle.forward(3); // Centers the turtle
		// turtle.turn(60);
		
		// for (int i = 0; i < 3; i++) {
		//	turtle.setDelay(100);
		//	turtle.color(Color.BLUE);
		//	turtle.back(-3);
		//	turtle.turn(120);
		// }
		
		
		// Exercise 2: Using a Subroutine
		
		// turtleSquare(0); {
			
		//	double squareSize = 8;
		//	for (int i = -2; i < 2; i++) {
		//		turtle.penUp();
		//		turtle.moveTo(i, i);
		//		turtle.penDown();
		//		turtle.randomColor();
		//		turtle.lineWidth(Math.random()*6+1);
		//		turtleSquare(squareSize);
		//		squareSize = squareSize - 2;
		//	} // End of Loop
			
		// } // End of turtleSquare(0);
		
		
		// Exercise 3

		// turtleBurst();
		
		
		// Exercise 4: 
		
		turtleStar(5);
		
	} // End of main()
	
	

	//-------------------------------------------------------------------------------
	
	/**
	 * Creates the turtle and the window in which the turtle movwes.
	 * (There is no need to change or to use this method, other than
	 * to call it at the beginning of main().)
	 */
	private static void createTurtle() {
		turtle = new TurtlePanel(800);
		JFrame window = new JFrame("Turtle Land");
		window.setContentPane(turtle);
		window.pack();
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(100,100);
		window.setVisible(true);
	}
	
} // end class TurtleGraphics
