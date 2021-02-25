package While_Loop;
import java.util.Scanner;
public class while_loop3 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int sum = 0;
		while(i <= n)
		{
			sum = sum + i;
			i = i + 2;
		}
		System.out.print(sum);
	}

}


