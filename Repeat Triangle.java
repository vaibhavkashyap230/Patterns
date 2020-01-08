/*
ABCDDCBA
 ABCCBA
  ABBA
   AA
*/
public class solution
{
	public static void print(int n)
    {
        int c=65;
		for(int i=0;i<n;i++)
		{
            for(int j=0;j<i;j++)
			{
				System.out.print(' ');
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print((char)(c+j));
			}
			for(int j=n-i-1;j>=0;j--)
			{
				System.out.print((char)(c+j));
			}
			System.out.println();
		}
    }
}
