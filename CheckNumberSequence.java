package assignment;
import java.util.Scanner;
public class CheckNumberSequence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		int i = 0;
		int a = sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			int b = sc.nextInt();
			if(a<b)
			{
				a = b;
				break;
			}
			else if(a == b)
			{
				f = 1;
				break;
			}
			a = b;
		}
	        for(int j=i+1;j<n-1;j++)
	        {
	        	int b = sc.nextInt();
	            if(a>=b)
	                f=1;
	            a = b;
	        }
	        if(f==1)
	        {
	        	System.out.println("false");
	        }
	        else
	        {
	        	System.out.println("true");
	        }
	}
}
