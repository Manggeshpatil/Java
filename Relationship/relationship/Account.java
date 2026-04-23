package relationship;

public class Account {
	private String name;
	private long acno;
	private String branch;
	private long cno;
	private double balance;
	private int pswd;
	public Account(String name, long acno, String branch, long cno, double balance, int pswd) {
		this.name = name;
		this.acno = acno;
		this.branch = branch;
		this.cno = cno;
		this.balance = balance;
		this.pswd = pswd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPswd() {
		return pswd;
	}
	public void setPswd(int pswd) {
		this.pswd = pswd;
	}


}
