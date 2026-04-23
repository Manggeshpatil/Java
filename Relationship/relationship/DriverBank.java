package relationship;
import java.util.Scanner;
public class DriverBank {
	public static void main(String[] args) {
		Bank ref = new Bank("IndianBank");
		Scanner sc = new Scanner (System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("Enter the choice\n1. Creat Account \n2. Cancel Account\n3. Update Details\n4. Display Detalis\n5. Change Passward\n6. Withdraw Amount\n7. Deposite Amount\n8. Display Balance\n9. Exit ");
		    int choice = sc.nextInt();
		    switch(choice) {
			    case 1 : {
			    	System.out.println("Enter The Name");
			    	String name = sc.next();
			    	System.out.println("Enter The Account Number");
			    	long acno = sc.nextLong();
			    	System.out.println("Enter The Branch");
			    	String branch = sc.next();
			    	System.out.println("Enter The Contact Number");
			    	long cno = sc.nextLong();
			    	System.out.println("Enter The Balence");
			    	double balence = sc.nextDouble();
			    	System.out.println("Enter The Passward/Pin");
			    	int pswd = sc.nextInt();
			    	ref.createAccount(new Account (name,acno,branch,cno,balence,pswd));
			    }
			    break;
			    case 2 : ref.cancelAccount();
			    break;
			    case 3 : ref.updateDetails();
			    break;
			    case 4 : ref.displayDetails();
			    break;
			    case 5 : ref.changePassward();
			    break;
			    case 6 : ref.withdrawAmount();
			    break;
			    case 7 : ref.depositeAmount();
			    break;
			    case 8 : ref.displayBalance();
			    break;
			    case 9 : {
			    	condition = false;
			    	System.out.println("Application Closed.....");
			    }
			    break;
			    default : System.out.println("Something Went Wrong....Try Again");
		    }
		}
		
	}

}

