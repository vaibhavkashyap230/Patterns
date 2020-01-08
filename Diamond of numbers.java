/*
  1
   123
  12345
 1234567
  12345
   123
    1
*/
public class solution
{
	public static void print(int n)
    {
        int c=1;
		int m=(int)(n/2);
		for(int i=1;i<=m+1;i++)
		{
			for(int j=0;j<=m-i;j++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			c+=2;
		}
		
		c-=4;
		for(int i=m;i>0;i--)
		{
			for(int j=0;j<=m-i;j++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=c;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			c-=2;
		}
    }
}
