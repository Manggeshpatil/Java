class methodcallstatement 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		anjali();
		System.out.println("main end");
	}
	public static void anjali()
	{
		System.out.println("anjali like rahul");
		rahul();
	}
	public static void rahul() 
	{
		System.out.println("rahul like tina");
		tina();
	}
	public static void tina() 
	{
		System.out.println("dead");
	}
}
