package StudentSchool;

public class Student {
	private String sname;
	private int id;
	private int std;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public Student(String sname, int id,int std) {
		this.sname = sname;
		this.id = id;
		this.std = std;
	}
	

}
