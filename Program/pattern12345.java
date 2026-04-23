class patte12345 
{
	public static void main(String[] args) 
	{
		int k = 1;
		for (int i = 1; i<=5; i++)
		{
			for (int a = 1; a<=5; a++ )
			{
				System.out.print(k);
				k++;
				if (k>5)
				{
					k=1;
				}
			}
				System.out.println();
		}
	}
}
