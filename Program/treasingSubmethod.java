class treasingSubmethod  
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		sub ();
		System.out.println("main end");
	}
	public static void sub()
	{
		int a = 50;
		int b = 20;
		int res = a-b;
		System.out.println(res);
	}
}
