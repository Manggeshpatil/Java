package collectio;

import java.util.Scanner;

public class BankDriver {
	public static void main(String[] args) {
		Bank ref = new Bank();
		Scanner sc = new Scanner (System.in);
		boolean condition = true;
		while (condition) {
			System.out.println("Enter the choice\n1. Creat Account \n2. Cancel Account\n3. Update Details\n4. Display Detalis\n5. Change Passward\n6. Withdraw Amount\n7. Deposite Amount\n8. Display Balance\n9. Exit ");
		    int choice = sc.nextInt();
		    switch(choice) {
			    case 1 : ref.createAccount();
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
			    default : {
			    	System.out.println("Something Went Wrong !!....Please Try Again");
			    	System.out.println("-------------------------------------------");
			    }			    
		    }
		}		
	}
}
