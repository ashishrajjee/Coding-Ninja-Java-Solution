package patterns;
import java.util.Scanner;
public class pattern4
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();					//input
		int i = 1;								//4
		int val = 1;							//output
		while( i <= n )							//1
		{										//23
			val = i;							//345
			int j = 1;							//4567
			while( j <= i )
			{
				System.out.print(val);
				val = val + 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
