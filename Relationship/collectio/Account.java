package collectio;

public class Account {
	String name;
	long acno;
	String branch;
	long cno;
	double balance;
	int pswd;
	public Account(String name, long acno, String branch, long cno, double balance,int pswd) {
		this.name = name;
		this.acno = acno;
		this.branch = branch;
		this.cno = cno;
		this.balance = balance;
		this.pswd = pswd;
	}
	public String toString() {
		return "Account Holder Name : " + name + "\nAccount Number : " + acno + "\nBranch : " + branch + "\nContact Number : " + cno;
				
	}
}


