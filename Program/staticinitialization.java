class staticinitialization 
{
	static int f = 34;
	public static void main(String[] args) 
	{
		System.out.println("main start");
		add();
		System.out.println("main start");
	}
	static
	{
		System.out.println("Hello from multi line static initializer");
	}
	public static void add()
	{
		System.out.println(20+30);
	}
}
