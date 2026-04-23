class StaticAndLocalVeriable
{
	static int b;
	public static void main(String[] args) 
	{
		System.out.println("main start");
		int g = program1.add();
		System.out.println(StaticAndLocalVeriable.b);
		test();
		System.out.println(g);
		System.out.println(b);
		StaticAndLocalVeriable.sub();
		System.out.println("main end");
	}
	public static void sub()
	{
		System.out.println("sub start");
		int a = 22;
		int d = 10;
		int sub = a-d;
		System.out.println(sub);
		System.out.println(b);
		System.out.println("sub end");
	}
	public static void test()
	{
		System.out.println("test start");
		System.out.println(program1.a);
		int d=34;
		System.out.println(StaticAndLocalVeriable.d);
		System.out.println("test end");
	}
}
