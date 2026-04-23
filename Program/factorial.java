//write a java program to print the factor of 5//
class  factor
{
	public static void main(String[] args) 
	{
		int a = 5;
		int fact = 1;
		while (a>=1)
		{
			fact = fact * a;
			a--;
		}
		System.out.println("factorial is :"+fact);
	}
}
