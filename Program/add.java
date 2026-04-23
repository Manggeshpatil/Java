class add 
{
	static boolean b;
	static int d;
	public static void main(String[] args) 
	{ 
		System.out.println("main start");
		int g = demo1.add();
		System.out.println(demo1.a);
		test();
		System.out.println(g);
		System.out.println(b);
		sub();
		System.out.println("main end");
	}
	public static void sub()
	{
		System.out.println("sub start");
		int a = 20;
		int b = 10;
		int sub = a-b-d;
		System.out.println(sub);
		System.out.println(b);
		System.out.println("sub end");
	}
	public static void test()
	{
		System.out.println("test start");
		System.out.println(demo1.a);
		int c=34;
		System.out.println(add.d);
		System.out.println(c);
		System.out.println("test end");
	}
}
