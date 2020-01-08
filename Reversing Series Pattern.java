/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
21 20 19 18 17 16
22 23 24 25 26 27 28
*/
public class solution
{
	public static void print(int n)
    {	
		int c=0,f=0;
		for(int i=0;i<n;i++)
		{
			int s=c+1,e=s+i;
			if(f==0)
			{
				for(int j=s;j<=e;j++)
				{
					System.out.print(j);
					System.out.print(' ');
				}
				System.out.println();
				f=1;
			}
			else
			{
				for(int j=e;j>=s;j--)
				{
					System.out.print(j);
					System.out.print(' ');
				}
				System.out.println();
				f=0;
			}
			c=e;
		}
    }
}
