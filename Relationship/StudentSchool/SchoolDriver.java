package StudentSchool;
import java.util.Scanner;
public class SchoolDriver {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	School s1 = new School("Hal School");
	boolean exit = true;
	while (exit)
	{
		System.out.println("Enter the Choice\n1 Taken Admision\n2 Cancele Admision\n3 Update STD \n4 Display Details\n5 Exite");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			{
				System.out.println("ENTER THE STUDENT NMAE");
				String name = sc.next();
						System.out.println("ENTER THE STUDENT ID");
				int id = sc.nextInt();
				System.out.println("ENTER THE STD");
				int std = sc.nextInt();
				s1.addstudent();
			}
			break;	
				case 2:
				{
					s1.canceleadmision();
				}
				break;
				case 3:
				{
					s1.updatestd();
				}
				break;
				case 4:
				{
					s1.displaydetails();
				}
				break;
				case 5:
				{
					exit = false;
					System.out.println("APLICATION CLOSED..........");
					System.out.println("---------------------------------------");
					
				}
				break;
				default:
				{
					System.out.println("Invalid choice______");
				}
				}
			}
		}
	}

