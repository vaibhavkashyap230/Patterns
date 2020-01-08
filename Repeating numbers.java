/*
1
23 
4567
89123456
7891234567891234
*/
public class solution
{
	public static void print(int n)
    {
        int c=1,l=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(c%10==0)
				{
					c+=1;
				}
				System.out.print(c%10);
				c+=1;
			}
			l=l*2;
			System.out.println();
		}
    }
}
