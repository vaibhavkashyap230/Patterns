/*
           1
         232
       34543
     4567654
   567898765
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
        int s=1,m=1,e=(2*n)-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<e;j++)
			{
				System.out.print(' ');
			}
			for(int j=s;j<=m;j++)
			{
				System.out.print(j);
			}
			for(int j=m-1;j>=s;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			s+=1;
			m+=2;
			e-=2;
		}
	}
}
