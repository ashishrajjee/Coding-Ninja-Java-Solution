package assignment;
import java.util.Scanner;
public class Find_power_of_a_number
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();
		int k = ((int)(Math.pow(n, p)));
		System.out.print(k);
	}
}
