class patte10101 
{
	public static void main(String[] args) 
	{
		int k = 1;
		for (int i = 1; i<=5; i++)
		{
			for (int a = 1; a<=5; a++ )
			{
				System.out.print(k);
				if (k==1)
				{
					k--;
				}
			else 
				{
				k++;
				}
			}
				System.out.println();
		}
	}
}
