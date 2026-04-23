class pen 
{
	String color;
	double price;
	pen()
	{
		System.out.println("Hello no argument construction");
	}
	pen(String h)
	{
		color=h;
	}
	pen(String a, double b)
	{
		color = a;
		price = b;
	}
	public static void main(String[] args) 
	{
		pen p1 = new pen ();
		System.out.println(p1.color);
		System.out.println(p1.price);
		pen p2 = new pen ("black",100);
		System.out.println(p2.color);
		System.out.println(p2.price);
		pen p3 = new pen ("blue");
		System.out.println(p3.color);
		System.out.println(p3.price);

	}
}
