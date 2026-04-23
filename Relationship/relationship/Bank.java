package relationship;
import java.util.Scanner;
public class Bank {
	Account a;
	String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	public void createAccount(Account a) {
		if (this.a==null) {
			this.a=a;
			System.out.println("Account Created Successully....");
			System.out.println("-------------------------------");
		}
		else {
			System.out.println("Account Already created.......");
			System.out.println("------------------------------");
		}
	}
	public void cancelAccount() {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter the Pin");
			int pin = sc.nextInt();
			if (pin==a.getPswd()) {
			this.a=null;
			System.out.println("Account Canceled Successfully..");
			System.out.println("------------------------------");
			}
			else {
				System.out.println("Incorrect Pin....");
			}
		}
	}
	public void updateDetails() {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter the Pin");
			int pin = sc.nextInt();
			if (pin==a.getPswd()) {
				System.out.println("Enter the new Contact Number");
				long ncno = sc.nextLong();
				System.out.println("Enter New Branch Name");
				String branch = sc.next();
				a.setCno(ncno);
				a.setBranch(branch);
				System.out.println("The updation for Branch And Contact Number is Successfull.....");
				System.out.println("------------------------------");
			}
			else {
				System.out.println("Incorrect Pin....");			
			}
		}
	}
	public void displayDetails () {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");		
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter the Pin");
			int pin = sc.nextInt();
			if (pin==a.getPswd()) {
				System.out.println(">>>>>>>>>>>>>>> "+bankName);
				System.out.println("Name  : "+ a.getName());
				System.out.println("Branch Name :"+ a.getBranch());
				System.out.println("Contact Number : "+ a.getCno());
				System.out.println("Account Number : "+ a.getAcno());
				System.out.println("------------------------------");
			}
			else {
				System.out.println("Incorrect Pin....");
			}
		}
	}
	public void changePassward () {
		if (this.a==null) {
			System.out.println("Login first");
			System.out.println("------------------");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Old passward");
			int opswd = sc.nextInt();
			if (opswd == a.getPswd()) {
				Scanner sm =new Scanner (System.in);
				System.out.println("Enter new Passward");
				int npswd = sm.nextInt();
				a.setPswd(npswd);
				System.out.println("New Passward Updated Succesully.....");
			}
			else {
				System.out.println("Incorrect Old Passward");
			}
		}
	}
	public void withdrawAmount () {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");	
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pswd = sc.nextInt();
			if (pswd == a.getPswd()) {
				System.out.println("Enter Withdraw Amount");
				int amt = sc.nextInt();
				if (amt <= a.getBalance()) {
					double remainingAmount = a.getBalance() - amt;
					a.setBalance(remainingAmount);	
					System.out.println("Withdraw Successull....");
					System.out.println("-------------------------");
				}
				else {
					System.out.println("Insuficient Balance");
					System.out.println("-------------------------");
				}
			}
			else {
				System.out.println("Inncorect Pin..");
			}
		}
	}
	public void depositeAmount () {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");	
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pswd = sc.nextInt();
			if (pswd == a.getPswd()) {
				System.out.println("Enter Deposite Amount");
				double depositeAmount = sc.nextDouble();
				double remainingAmount = a.getBalance() + depositeAmount;
				a.setBalance(remainingAmount);
				System.out.println("Deposition Successull....");
				System.out.println("-------------------------");
			}
			else {
				System.out.println("Incorrect Passward");
			}
		}
		
	}
	public void displayBalance () {
		if (this.a==null) {
			System.out.println("Account not created Yet.......");
			System.out.println("------------------------------");	
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pswd = sc.nextInt();
			if (pswd == a.getPswd()) {	
			System.out.println("Total Balance is : " + a.getBalance());
			System.out.println("----------------------");
			}
			else {
				System.out.println("Incorrect pin..");
				System.out.println("----------------------");
			}
		}
					
	}

}

