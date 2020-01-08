/*
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
*/
 import java.util.Scanner;
public class Solution
{

	public static void main(String[] args) 
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        s.close();
        
        int c=64;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print((char)(c+i));
        	}
        	System.out.println();
        }
    }
}
