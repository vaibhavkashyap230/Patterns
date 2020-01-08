/*
55555
45555
34555
23455
12345
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

		int c=n;
		for(int i=0;i<n;i++)
		{
			int s=c;
			for(int j=0;j<i;j++)
			{
				System.out.print(s);
				s+=1;
			}
			c-=1;
			for(int j=0;j<n-i;j++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
