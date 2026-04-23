package collectio;

import java.util.Scanner;

public class SchoolDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		School ref = new School ();
		boolean condition = true;
		while (condition) {
			System.out.println("Enter The Choice\n1. Take Admisssion\n2. Cancel Admission\n3. Display Details\n4. Update Details\n5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : ref.takeAdmission();
				break;
				case 2 : ref.cancelAdmission();
				break;
				case 3 : ref.displayDetails();
				break;
				case 4 : ref.UpdateDetails();
				break;
				case 5 : {
					condition = false;
					System.out.println("Its Closed Now :)");
				}
				break;
				default : {
					System.out.println("Enter valid choice :(");
				}
			}
		}
	}
}


