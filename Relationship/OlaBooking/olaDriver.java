package OlaBooking;

import java.util.Scanner;

public class olaDriver {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Ola o1=new Ola();
		boolean exit=true;
		while(exit)
		{
			System.out.println("---Welcome To Ola Cabs--- \n1.Book Cab \n2.Cancel Cab \n3.Check Cab \n4.Show Cab \n5.Update Pikup \n6.Update Destination \n7.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{

			System.out.println("which you want to booking cab \n1.Prime Cab \n2.Xuv Cab \n3.Mini Cab");
		    int no= sc.nextInt();
			if (no<=3) 
			{
				System.out.println("Enter cab pikup");
				String pikup=sc.next();
				System.out.println("Enter your destination");
				String destination=sc.next();
				o1.bookCab(no, pikup, destination);
			
			}
			else
			{
				System.out.println("Invalid choice");
				System.out.println("------------------------------");
			}
		}
		break;
		case 2:
		{
			o1.cancleCab();
		}
		break;
		case 3:
		{
			o1.checkCab();
		}
		break;
		case 4:
		{
			o1.showCab();
		}
		break;
		case 5:
		{
			o1.UpdatePikup();
		}
		break;
		case 6:
		{
			o1.updateDestination();
		}
		break;
		case 7:
		{
			exit=false;
			System.out.println("Application Closed");
			System.out.println("------------------");
		}
		break;
		default:
		{
			System.out.println("Inavllid Choice");
			System.out.println("---------------");
		}
	  }
    }
  }
}

