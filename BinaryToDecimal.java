package functions;
import java.util.Scanner;
public class BinaryToDecimal
{
	public static int binarytodecimal(int binary)
	{
		int rem = 0, decimal = 0, i = 1;
		while(binary != 0)
		{
			rem = binary % 10;
			decimal = decimal + (rem * i);
			i = i * 2;
			binary = binary / 10;
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int decimal = binarytodecimal(binary);
		System.out.println(decimal);
	}
}
