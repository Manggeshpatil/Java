import java.util.Scanner;
class calculaterDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);

		calculater c1 = new calculater();
		boolean exit = true;
		while(exit)
		{

		System.out.println("Enter the choice \n1.Addition\n2.Substraction\n3.Multiplication\n4.Dividation\n5.exit");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			{
				c1.add();
			}
			break;
		case 2:
			{
				c1.sub();
			}
			break;
		case 3:
			{
				c1.mul();
			}
			break;
		case 4:
			{
				c1.div();
			}
			break;
		case 5:
			{
				exit = false;
				System.out.println("Application Closed______");
			}
			break;
			default:			{
				System.out.println("Invalid choice______");
			}
			
			}
		}
	}
}
