//write a java program to cheak whether the given number palindrom// 
class  palindrom
{
	public static void main(String[] args) 
	{
		int num = 1321;
		int sum = num;
		int rem = 0;
		int rev = 0;
		while (num!=0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		if (sum==rev)
		{
			System.out.println("no is palindrom : "+rev);
		}
		else 
		{
			System.out.println("no is not palindrom : "+rev);
		}
	}
}
