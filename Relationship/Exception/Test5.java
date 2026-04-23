package Exception;

public class Test5 {
	public static void main (String[]args)
	{
	  div ();
	}
	public static void div() throws RuntimeException
	{
	int a = 3;
	int b =0;
	int r =a/b;
	System.out.println(r);
	}
}
