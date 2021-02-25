package assignment;
import java.util.*;
public class CheckPermutation2
{
	public static boolean isPermutation(String str1, String str2)
    {
		int n=str1.length();
		int p=str2.length();
		if(n!=p)
		{
			return false;
		}
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < n;  i++)
			if (ch1[i] != ch2[i])
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		String input1 = "aba";
		String input2 = "baa";
		boolean b = isPermutation(input1, input2);
		input1 = "abb";
		input2 = "aab";
		boolean b1 = isPermutation(input1, input2);
		System.out.println(b);
		System.out.print(b1);
	}
}
