/*
      0
     101
    21012
   3210123
  432101234
 54321012345
6543210123456
*/
public class solution
{
	public static void print(int n)
    {	
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(' ');
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.print(0);
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
