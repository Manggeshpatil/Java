package collectio;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	Account a;
	Scanner sc = new Scanner (System.in);
	ArrayList<Account> ar = new ArrayList<Account>();
	String bankName = "Indian Bank";
	
	public void createAccount() {
		System.out.print("Enter The Name : ");
    		String name = sc.next();
    		System.out.print("Enter The Account Number : ");
    		long acno = sc.nextLong();
    		System.out.print("Enter The Branch : ");
    		String branch = sc.next();
    		System.out.print("Enter The Contact Number : ");
    		long cno = sc.nextLong();
    		System.out.print("Enter The Balence : ");
    		double balence = sc.nextDouble();
    		System.out.print("Enter The Passward/Pin : ");
    		int pswd = sc.nextInt();
    		a = new Account (name,acno,branch,cno,balence,pswd);
    		ar.add(a);
    		System.out.println("Account Created Successfully...");
	}
	
	public void cancelAccount() {
		System.out.println("Enter the Name And Passward For Cancelling Account");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println(ar.remove(a));
				System.out.println("Admission Cancelled Successfullyyy...");
				return;
			}			
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
	
	public void updateDetails() {
		System.out.println("Enter the Name And Passward For Update Account Details");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("Enter New Branch");
				String newBranch = sc.next();
				m.branch = newBranch;
				System.out.println("Enter New Contact Number");
				int newCno = sc.nextInt();
				m.cno = newCno;
				System.out.println("Details Updated Successfully :)");
				return;
			}			
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
	
	public void displayDetails () {
		System.out.println("Enter the Name And Passward For Display Account Details");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("Bank Name --->>>> "+bankName);
				System.out.println(m);
				return;
			}			
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
	
	public void changePassward () {
		System.out.println("Enter the Account Name And Old Passward For Change The Passward");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("Enter new Passward");
				int newPswd = sc.nextInt();
				m.pswd = newPswd;
				System.out.println("Passward Changed Successfully :)");
				return;
			}			
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
	
	public void withdrawAmount () {
		System.out.println("Enter the Name And Passward For Withdraw Amount");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("Enter Withdraw Amount");
				double amt = sc.nextDouble();
				if (amt <= m.balance) {
					double remainingAmount = m.balance - amt;
					m.balance = remainingAmount;	
					System.out.println("Withdraw Successull....");
					System.out.println("-------------------------");
				}
				else {
					System.out.println("Insuficient Balance");
					System.out.println("-------------------------");
				}
				return;
			}		
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
		
	public void depositeAmount () {
		System.out.println("Enter the Name And Passward For Deposite Account");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("Enter Deposite Amount");
				double depositeAmt = sc.nextDouble();
				double remainingAmount = m.balance + depositeAmt;	
				m.balance = remainingAmount;	
				System.out.println("Deposition Successull....");
				System.out.println("-------------------------");	
				return;
			}		
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
			
	public void displayBalance () {
		System.out.println("Enter the Name And Passward For Display Account Balance");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Passward : ");
		int pswd = sc.nextInt();
		for (Account m : ar) {
			if (name.equals(m.name) && pswd==m.pswd) {
				System.out.println("The Total Balance is : "+m.balance);
				return;
			}		
		}
		System.out.println("its Name/Passward Does Not Exist :(");
	}
}


