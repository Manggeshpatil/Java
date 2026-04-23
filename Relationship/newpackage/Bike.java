package newpackage;

public class Bike extends Car {
	public void noofwheels()
	{
		System.out.println("4 wheels");
	}
	public void noofseats()
	{
		System.out.println("5 seats");
	}
	public static void main(String[] args) {
		Bike b1 = new Bike ();
		b1.noofseats();
		b1.noofwheels();
	}
}
