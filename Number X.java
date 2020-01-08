/*
1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1
*/
public class solution
{
	public static void print(int n)
    {
        int s=(2*(n-1))-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(' ');
			}
			System.out.print(i+1);
			for(int j=0;j<s;j++)
			{
				System.out.print(' ');
			}
			if(i!=n-1)
			{System.out.print(i+1);}
			System.out.println();
			s-=2;
		}
		s=1;
		for(int i=n-2;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(' ');
			}
			System.out.print(i+1);
			for(int j=0;j<s;j++)
			{
				System.out.print(' ');
			}
			System.out.println(i+1);
			s+=2;
		}
	}
}
