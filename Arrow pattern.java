/*

*
 * *
   * * *
     * * * *
       * * * * *
         * * * * * *
       * * * * *
     * * * *
   * * *
 * *
*

*/
import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
    {
        int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		
		int m=(int)(n/2);
		for(int i=1;i<=m+1;i++)
		{
			int f=1;
			for(int j=1;j<i;j++)
			{
				if(f==1)
				{
					System.out.print(' ');
					f=0;
				}
				else
				{
					System.out.print("   ");
				}
			}
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=m;i>0;i--)
		{
			int f=1;
			for(int j=1;j<i;j++)
			{
				if(f==1)
				{
					System.out.print(' ');
					f=0;
				}
				else
				{
					System.out.print("   ");
				}
			}
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
				System.out.print("  ");
			}
			System.out.println();
		}
    }
}
