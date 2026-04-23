import java.util.Scanner;
class calculater 
{
	public void add() 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the 1st num");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd num");
		int b = sc.nextInt();
		int res = a+b;		
		System.out.println("Addition is :"+res);
	}
	public void sub() 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the 1st num");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd num");
		int b = sc.nextInt();
		int res = a-b;		
		System.out.println("Subtraction is :"+res);
	}
	public void mul() 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the 1st num");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd num");
		int b = sc.nextInt();
		int res = a*b;		
		System.out.println("Multiplication is :"+res);
	}
	public void div() 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the 1st num");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd num");
		int b = sc.nextInt();
		int res = a/b;		
		System.out.println("Dividation is :"+res);
	}
}
