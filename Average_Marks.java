import java.util.Scanner;
public class Average_Marks
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char c = str.charAt(0);
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int m = (m1+m2+m3)/3;
		System.out.println(c);
		System.out.print(m);
	}
}
