class PattenExa
{
	public static void main(String[] a)
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}