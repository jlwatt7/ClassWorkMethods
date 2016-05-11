import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);
		double x;
		double y;
		x= scan1.nextDouble();
		y= scan1.nextDouble();
		lessthan5(x, y);
		printNumber(x);
	}

	private static void lessthan5(double x, double y) {
		boolean result;
		  if ((x-y)<5)
		  {
			  result = true;
			  	  System.out.println("True");
		  }
		  else
		{
			result = false;
			System.out.println("Sike Naw");
		}
	 
	}
	{
	}
	public static void printNumber(double x) {
		
		 
				for(int i=1;i<=x;i++)
					
			{
				System.out.println(i);
			}
	}
}
