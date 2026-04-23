class pattern123 
{
	public static void main(String[] args) 
	{
		
		for (int i = 0; i<5; i++)
		{
			int k=1;
			for (int a =0; a<5; a++ )
			{
				if (a%2==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(k);
					k++;
				}
			}
				System.out.println();
		}
	}
}
