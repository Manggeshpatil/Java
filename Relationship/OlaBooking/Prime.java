package OlaBooking;

public class Prime extends Cab {
	private String dname="Ravi kumar";
	 private String cno="MH12 BE 4468";
	 private String color="Red";
	 private String name="BMW";
	 
	 
	 public Prime(String pikup,String destination)
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
