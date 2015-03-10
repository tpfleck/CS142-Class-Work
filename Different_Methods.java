public class Different_Methods {
    public static void main(String[] args) {
    	String userInput;
    	
    	System.out.print("What figure do you want to show? "); //change here
    	userInput = TextIO.getWord();
    	
    	if (userInput == "Figure1") {
    		TopHalf();
    		BottomHalf();
    		Break();
    	}
    	
    	TopHalf();
    	BottomHalf();
    	Break();
    	
    	TopHalf();
    	BottomHalf();
    	Line();
    	Break();
    	
    	TopHalf();
    	Stop();
    	BottomHalf();
    	Break();
    	
    	TopHalf();
    	Line();
    }
    	
	public static void TopHalf() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
	}
	
	public static void BottomHalf() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
	
	public static void Line() {
        System.out.println("+--------+");
	}
	
	public static void Stop() {
        System.out.println("|  STOP  |");
	}
	
	public static void Break() {
		System.out.println();
	}
}
