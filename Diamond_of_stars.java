package patterns;
import java.util.Scanner;
public class Diamond_of_stars
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int mid = (n+1)/2;
		int i = 1;
		while(i <= mid)
		{
			int space = 1;
			while(space <= mid - i)
			{
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while(j <= (i*2)-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i = 1;
		while(i <= mid - 1)
		{
			int space = 1;
			while(space <= i)
			{
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while(j <= (2*(mid-i))-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}

