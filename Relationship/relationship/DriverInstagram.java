package relationship;

import java.util.Scanner;

public class DriverInstagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Instagram ref = new Instagram ();
		boolean condition = true;
		while (condition) {
			System.out.println(">>>>>>>>>>>>>> INSTAGRAM <<<<<<<<<<<<<<<<");
			System.out.println("Enter the choice\n1. Login\n2. Logout\n3. Update Status\n4. Display Detalis\n5. Change Passward\n6. EXIT");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : {
				    System.out.println("Enter User Name");
				    String name =sc.next();
				    System.out.println("Enter User Contact Number");
				    long cno = sc.nextLong();
				    System.out.println("Enter Passard");
				    int pswd = sc.nextInt();
				    System.out.println("Enter the status");
				    String status = sc.next();
					ref.loginuser(new user (name,cno,pswd,status));
					System.out.println("===============================");
				}
				break;
				case 2 : ref.logout();
				break;
				case 3 : ref.updateStatus();
				break;
				case 4 : ref.displayDetails();
				break;
				case 5 : ref.changePassward();
				break;
				case 6 :{
					condition = false;
					System.out.println("Aplication Exit........");
				}
				break;
				default : {
					System.out.println("Invalid Input....Please take valid input");
				}
				
			}
		}
	}
}



