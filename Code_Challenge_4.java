/* A program that converts Cartesian coordinates
 * into polar coordinates
 * 
 * @author Carl Argabright
 * @author Garrett Engle
 * @author Tyler Fleckenstein
 * 
 * The unicode was provided by Fry. Thanks Fry!
 * 
 */
 
public class Code_Challenge_4 {
       
        public static void main(String[] args) {
               
                // Declare the variables
                double inputX, inputY, radius, theta; 
                String charDegree = "\u00b0"; // Unicode for the Degree symbol
                String charTheta = "\u03B8"; // Unicode for the Theta symbol
                String charArrowR = "\u2192"; // Unicode for the Rightwards Arrow
 
                // Welcome Statement!
                System.out.println("==========================================================");
                System.out.println("=    This is designed to convert Cartesian coordiants    =");
                System.out.println("=    into Polar coordinants. It might look something     =");
                System.out.println("=    like this.                                          =");
                System.out.println("=                                                        =");
                System.out.println("=              (X,Y) " + charArrowR + " (radians " + charTheta + ", degrees " + charDegree + ")            =");
                System.out.println("=                                                        =");
                System.out.println("=                                                        =");
                System.out.println("=              Follow the Instructions Below:            =");
                System.out.println("=              ------------------------------            =");
                System.out.println("=                Enter values for 'X' & 'Y'              =");
                System.out.println("=                                                        =");
                System.out.println("=                                                        =");
                System.out.println("=    We discovered we could easily find the angle        =");
                System.out.println("=    in radians by using the 'atan' or arctangent of     =");
                System.out.println("=    coordinants (X,Y) by dividing Y/X.                  =");
                System.out.println("=                                                        =");
                System.out.println("=                                                        =");
                System.out.println("=                    Enjoy our program!                  =");
                System.out.println("=                                                        =");
                System.out.println("=                                                        =");
                System.out.println("==========================================================");
                System.out.print("\n");
                
                
                
                // Gather the Cartesian coordinates from the user
                System.out.println("Please enter the Cartesian coordinates...\n");
                System.out.print("Enter the \"X\" coordinate: ");
                inputX = TextIO.getlnDouble();
                System.out.print("Enter the \"Y\" coordinate: ");
                inputY = TextIO.getlnDouble(); 
                System.out.println("\nThe coordinates you entered are (" + inputX + "," + inputY + ")");  // Verify the entered values
       
       
                // Solve for the hypoteneuse
                radius = Math.hypot(inputX, inputY);
                System.out.println("The radius is: " + radius + "\n");
               
                                                //Compute theta using atan2
                                                //theta = Math.atan2(inputX, inputY);
                                                //System.out.println("The angle in radians is: " + theta );
                                                //System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");
       
        // Compute theta using atan
       
        if (inputX > 0){
                theta = (Math.atan(inputY/inputX));
                System.out.println("The if statement ran (x > 0)\n");
                System.out.println("The angle of theta in radians is: " + theta + charTheta);
                System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + charDegree + "\n");
        } // End if
       
        else if (inputX < 0){
                System.out.println("else if statement ran (x < 0)");
                theta = Math.atan(inputX/inputY);
                theta = theta + Math.PI;
                System.out.println("The angle of theta in radians is: " + (theta) + charTheta);
                System.out.println("The angle in degrees is: " + ((theta) * (180/Math.PI)) + charDegree + "\n");
        }
       
        else if (inputX == 0){
                System.out.println("else if x == 0 has ran");
                    if (inputY == 0){
                       System.out.println("The angle can only equal 0");
                    }
                    else if (inputY < 0){
                        System.out.println("The angle can only be 270 degrees");
                    }
                    else if (inputY > 0){
                        System.out.println("The angle can only be 90");
                    }
        } // eEnd of else if X == 0
                       
//       End if
//      else {
//              System.out.println("The else statement ran\n");
//             
//              theta = Math.atan(((inputX/inputY) + Math.PI));
//              System.out.println("theta = " + theta);
//              System.out.println();
//              System.out.println("The angle of theta in radians is: " + theta);
//              System.out.println("The angle in degrees is: " + (theta * (180/Math.PI)) + "\n");
 
 
//      } // end else  
       
       
                       
                       
       
        System.out.println("The program has ended");
       
                       
        } // End main method
} // End of the class