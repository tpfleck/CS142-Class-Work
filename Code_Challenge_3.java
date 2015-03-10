/**
 * 
 * @author Tyler
 *
 */

public class Code_Challenge_3 {

	public static void main(String[] args) {
	
		int x,y,z;
		
		System.out.print("Give a value for 'x': ");
		x = TextIO.getInt();
		
		if (x < 0) {
			y = 1;
		} else { 
			y = 2;
		}
		
		System.out.println(y);
		
		if (x < 0) {
			z = 1;
		}
		// Change the following: if (x >= 0) { 
		else { 
			z = 2;
		}
		
		System.out.println(z);
		
	}
}
