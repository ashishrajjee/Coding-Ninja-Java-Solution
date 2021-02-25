package if_else;
import java.util.Scanner;
public class Find_Character_Case
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		char ch	= s.next().charAt(0);
		if('A' <= ch && ch <= 'Z')
		{
			System.out.println("1");
		}
		else if('a' <= ch && ch <= 'z')
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("-1");
		}
	}
}
