package relationship;

import java.util.Scanner;

public class Instagram {
	user u;
	public void loginuser(user u) {
		if (this.u==null) {
			this.u=u;
			System.out.println("Login Successfully......");
			System.out.println("-------------------------");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the passward");
			int pswd = sc.nextInt();
			
			if (pswd == u.getPswd()) {
				System.out.println("Already Logged in");
				System.out.println("-------------------------");
			}
			else {
				System.out.println("Incorrect Passward");
				System.out.println("-------------------------");
			}
		}
	}	
		public void logout () {
			if (this.u==null) {
				System.out.println(" loged in First");
				System.out.println("-------------------------");
			}
			else {
				this.u=null;
				System.out.println("Logout Successfully.....");
				System.out.println("-------------------------");
			}
		}
		public void updateStatus () {
			if (this.u==null) {
				System.out.println("Login First....you havent log in");
				System.out.println("-------------------------");
			}
			else {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the passward");
				int pswd = sc.nextInt();
				if (pswd == u.getPswd()) {
				
					//Scanner sm = new Scanner(System.in);
					System.out.println("Update the status");
					String status = sc.next();
					u.setStatus(status);
					System.out.println("Status updated succesfully.......");
					System.out.println("-------------------------");
				}
				else {
					System.out.println("Incorrect Passward");
				}
			}
			
		}
		public void displayDetails () {
			if (this.u==null) {
				System.out.println("login first...");
				System.out.println("-------------------------");
			}
			else {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the passward");
				int pswd = sc.nextInt();
				if (pswd == u.getPswd()) {
					System.out.println("user name : "+ u.getName());
					System.out.println("user contact number : "+ u.getCno());
					System.out.println("user satus : "+ u.getStatus());
					System.out.println("-------------------------");
				}
				else {
					System.out.println("Incorrect Passward");
				}
			}
		}

		public void changePassward () {
			if (this.u==null) {
				System.out.println("Login first");
				System.out.println("------------------");
			}
			else {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Old passward");
				int opswd = sc.nextInt();
				if (opswd == u.getPswd()) {
					Scanner sm =new Scanner (System.in);
					System.out.println("Enter new Passward");
					int npswd = sm.nextInt();
					u.setPswd(npswd);
					System.out.println("New Passward Updated Succesully.....");
				}
				else {
					System.out.println("Incorrect Old Passward");
				}
			}
		}
}



