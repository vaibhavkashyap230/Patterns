/*
 *****
  ****
   ***     
    **
     *
*/
public class solution
{
	public static void print(int n)
    {
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(' ');
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
    }
}
