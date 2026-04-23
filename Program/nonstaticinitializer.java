class nonstaticinitializer
{
	static int b = 34;
	int a = 25;
	static
	{
		System.out.println("Hello World MLSI");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main start");
		nonstaticinitializer n1 = new nonstaticinitializer();
		System.out.println("Main End");
	}
	{
		System.out.println("Hello World MLNSI");
	}
}
