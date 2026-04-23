class Books 
{
	String name;
	int noofpages;
	int price;

	public static void main(String[] java) 
	{
		Books b1 = new Books();

		System.out.println(b1.name);
		System.out.println(b1.noofpages);
		System.out.println(b1.price);
		System.out.println("_________________________");

		b1.price = 300;
		b1.name = "SQL";
		
		b1.toread();

		System.out.println(b1.name);
		System.out.println(b1.noofpages);
		System.out.println("________________________");
		
		Books b2 = new Books();

		b2.noofpages = 500;
		b1.name  = "java";
		b2.price = 500;
		
		System.out.println(b2.name);
		System.out.println(b2.price);
		System.out.println(b2.noofpages);
		System.out.println(b1.name);
		
		b2.toread();
		
		System.out.println("________________________");
		
		Books b3  = new Books();

		b3.price = 650;
		b3.name  = "python";
		b2.noofpages = 450;

		System.out.println(b3.name);
		System.out.println(b2.price);
		System.out.println(b3.noofpages);
		System.out.println(b3.price);
		System.out.println(b1.name);

		b1.toread();
	}
	public void toread()
	{
		System.out.println(name+ "is a book of" +noofpages+ "pages");
	}
}