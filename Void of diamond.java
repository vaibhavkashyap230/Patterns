/*
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********
*/
public class solution
{
	public static void print(int n)
    {
        for(int i=0;i<n;i++)
		{
			System.out.print('*');
		}
		System.out.println();
		int l=1;
		for(int i=n/2;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			}
			for(int j=0;j<l;j++)
			{
				System.out.print(' ');
			}
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
			l+=2;
		}
		l-=4;
		for(int i=2;i<=n/2;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			}
			for(int j=0;j<l;j++)
			{
				System.out.print(' ');
			}
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
			l-=2;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print('*');
		}
		System.out.println();
    }
}
