package OlaBooking;

public class Xuv extends Cab {
	private String dname="Vijay Raj";
	 private String cno="MH12 MX 3344";
	 private String color="Blue";
	 private String name="Fortuner";
	 
	 
	 public Xuv(String pikup,String destination)
	 {
		 super(pikup,destination);
	 }


	public String getDname() {
		return dname;
	}


	public String getCno() {
		return cno;
	}


	public String getColor() {
		return color;
	}


	public String getName() {
		return name;
	}
	
}
