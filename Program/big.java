class bag
{
	String colour;
	double price;
	int compartment;
	String company;
	public void tocarry()
	{
		System.out.print("tocarry a bag");
	}
	public static void main(String[] java) 
	{
		bag b1 = new bag()
		System.out.println(b1.colour);
		System.out.println(b1.print);
		System.out.println(b1.compartment);
		System.out.println(b1.company);
		b1.tocarry();
		System.out.print("---------");
		b1.colour="black";
		b1.print =500;
		b1.compartment=4;


		System.out.println(b1.colour);
		System.out.println(b1.price);
		System.out.println(b1.compartment);
		System.out.println(b1.company);

		b1.company="puma";

		System.out.println(b1.company);
	}
}
