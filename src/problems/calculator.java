package problems;

public class calculator {
	static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1, num2);
		
	}
	static double powerDouble(double num1,double num2)
	{
		return (double) Math.pow(num1, num2);
		
	}
	public static void main(String[]args)
	{
		System.out.println(powerInt(2,2));
		System.out.println(powerDouble(2,5));
	}


}
