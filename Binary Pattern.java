/*
11111
0000
111
00
1
*/
public class solution
{
	public static void print(int n)
    {
        int p=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(p);
			}
			System.out.println();
			if(p==1)
				p=0;
			else
				p=1;
		}
	}
}
