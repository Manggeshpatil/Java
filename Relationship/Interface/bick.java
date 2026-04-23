package Interface;

public class bick implements company  {
String company;
String NoOFSeats;
	public bick(String company, String NoOFSeats) {
		this.company = company;
		this.NoOFSeats = NoOFSeats;
	}

	public String toString() {
		return "Shine:"+company;
		
	}
	
	public boolean equals(Object o) {
		bike b2 = (bick)o;
		return this.company.compareTo(b1.company)
	}
	public int hashCode() {
		Object object;
		return.object.hashCode(company);
	}

}
