package relationship;
import java.util.Scanner;
public class DriverBag {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Bag ref = new Bag ();	
		boolean condition = true;
		while (condition) {

			System.out.println("Enter The number \n1. Add The Ball\n2. Remove The Ball\n3. Check The Bag\n4. Show The Game\n5. Exit");
			int number = sc.nextInt();
			switch (number) {
				case 1 : {
					System.out.println("Enter The choice\n1. Add Tennis Ball\n2. Add Basket Ball");
					int choice = sc.nextInt();
					System.out.println("Enter The Radius Of Ball");
					double radius = sc.nextDouble();
					System.out.println("-----------------------------");
					ref.addBall(choice,radius);
				}
				break;
				case 2 : ref.removeBall();
				break;
				case 3 : ref.checkBag();
				break;
				case 4 : ref.showGame();
				break;
				case 5 : {
					condition =  false;
					System.out.println("Exit successfully...........");
				}
				break;
				default : {
					System.out.println("Something went Wrong...");
				}
			}
		}
	}

}
