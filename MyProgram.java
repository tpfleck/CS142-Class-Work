public class MyProgram
{
   public static void main(String[] args)      
   {
      double a = 1.0, b = 4.0;;
      double r;

      r = ToolBox.fun( a,  b );

      System.out.println(a);
      System.out.println(b);
      System.out.println(r);
   }
}

class ToolBox
{
	public static double fun(double a, double b)
	{
		double m=0;
		
		a=a+1;
		b=b+2;
		m=a+b;
		
		return(m);
	}
}