package functions;
import java.util.Scanner;
public class FahrenheitToCelsiusTable
{
	public static void printFahrenheitTable(int start, int end, int step)
	{
		while( start <= end)
		{
			System.out.println(start + "\t" + ((5 * ( start - 32 ))/9));
			start = start + step;
		}
	}
	public static void main(String[] args)
	{
		try (Scanner a = new Scanner(System.in))
		{
			int s = a.nextInt();
			int e = a.nextInt();
			int w = a.nextInt();
			printFahrenheitTable(s,e,w);
		}
	}
}