class Test 
{
	public static void main(String[] args) 
	{
		add();
		add(2,5);
		add(3,2,1)
	}
	public void add(int a, int b)
	{
		int res = a+b;
			System.out.println(res);	
	}
	public void add (int a, int b, int c)
	{
		int res = a+b+c;
			System.out.println(res);
	}
	public void add ()
	{
			System.out.println("use for addition ");
	}
}
