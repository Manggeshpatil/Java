package OlaBooking;

public class Cab {
	private  String pikup;
	private String Destination;
	public Cab(String pikup, String destination) {
		super();
		this.pikup = pikup;
		Destination = destination;
	}
	public String getPikup() {
		return pikup;
	}
	public void setPikup(String pikup) {
		this.pikup = pikup;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
}
