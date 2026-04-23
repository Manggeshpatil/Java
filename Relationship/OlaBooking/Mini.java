package OlaBooking;

public class Mini extends Cab {
	private String dname="jay yadav";
	 private String cno="MH14 AR 3957";
	 private String color="White";
	 private String name="Maruti";
	 
	 
	 public Mini(String pikup,String destination)
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
