package assignment;
import java.util.Scanner;
public class TermsofAP
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i <= n ;i++)
		{
			int j = (3 * i) + 2;
			if(j % 4 == 0)
			{
				n = n + 1;
				continue;
			}
			System.out.print(j + " ");
		}
	}
}
