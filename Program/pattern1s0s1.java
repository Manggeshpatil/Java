class pattern1s0s1
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<5; i++)
		{
			for (int a =0; a<5; a++ )
			{
				if (a%2==1)
				{
					System.out.print("*");
				}
				else if (a==2)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
				System.out.println();
		}
	}
}
