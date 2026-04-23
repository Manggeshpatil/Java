package collectio;

public class student {
	int id;
	String sName;
	int std;
	public student (int id,String sName,int std) {
		this.id = id;
		this.sName = sName;
		this.std = std;
	}
	
	public String toString() {
		return "Student id : " + id + "\nStudent Name : " + sName + "\nstd : " + std;
	}
}
