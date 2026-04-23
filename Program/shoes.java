class shoes 
{
	String colour;
	int size;
	String company;
	public static void forrunning()
	{
		System.out.println("use for running");
	}
	public static void main(String[] args) 
	{
		shoes s1 = new shoes();

		System.out.println(s1.colour);
		System.out.println(s1.size);
		System.out.println(s1.company);
		
		s1.colour = "black";
		s1.size = 7;
		s1.company = "woodland";
		
		System.out.println(s1.colour);
		System.out.println(s1.size);
		System.out.println(s1.company);

		s1.forrunning();
		
		shoes s2 = new shoes();
		
		System.out.println(s2.colour);
		System.out.println(s2.size);
		System.out.println(s2.company);
	}
}
