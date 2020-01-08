/*
   *
  ***
 *****
*******
 *****
  ***
   *
*/
public class Solution
{
	public static void diamondOfStars(int n)
    {   
        int c=1;
        while(c<=n)
        {
        	for(int j=0;j<(n-c)/2;j++)
        		System.out.print(' ');
        	for(int j=0;j<c;j++)
        		System.out.print('*');
        	c+=2;
        	System.out.println();
        }
        c=n-2;
        while(c>0)
        {
        	for(int j=0;j<(n-c)/2;j++)
        		System.out.print(' ');
        	for(int j=0;j<c;j++)
        		System.out.print('*');
        	c-=2;
        	System.out.println();
        }
	}
}
