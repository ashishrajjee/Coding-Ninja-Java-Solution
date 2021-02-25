package While_Loop;
import java.util.Scanner;
public class Fahrenheit_to_Celsius_Table
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int s = a.nextInt();
		int e = a.nextInt();
		int w = a.nextInt();
//		if ( 0 <= s && s <= 80 && s <= e && e <=  900 && 0 <= w && w <= 40 )
//		{
//			while( s <= e)
//			{
//				System.out.println(s + "\t" + ((5 * ( s - 32 ))/9));
//				s = s + w;
//			}
//		}
// 										>>OR<<
		while( s <= e)
		{
			System.out.println(s + "\t" + ((5 * ( s - 32 ))/9));
			s = s + w;
		}
	}
}
