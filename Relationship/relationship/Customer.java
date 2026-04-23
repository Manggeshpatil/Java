package relationship;

public class Customer {
	private String name;
	private long cno;
	private String address;
	public Customer(String name, long cno, String address) {
		this.name = name;
		this.cno = cno;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}	

}
