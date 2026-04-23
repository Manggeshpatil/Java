package relationship;

public class user {
	private String name;
	private long cno;
	private int pswd;
	private String status;
	public user(String name, long cno, int pswd, String status) {
		this.name = name;
		this.cno = cno;
		this.pswd = pswd;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public int getPswd() {
		return pswd;
	}
	public void setPswd(int pswd) {
		this.pswd = pswd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
