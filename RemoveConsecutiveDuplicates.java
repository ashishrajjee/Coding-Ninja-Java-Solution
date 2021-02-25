package assignment;

public class RemoveConsecutiveDuplicates
{
	public static String removeConsecutiveDuplicates(String input)
	{
		int j = 0;
		String orignal = input.substring(0, 1);
		for(int i = 0; i < input.length(); i++)
		{
			if(orignal.charAt(j) != input.charAt(i))
			{
				orignal += input.charAt(i);
				j++;
			}	
		}
		return orignal;
	}
	public static void main(String[] args)
	{
		String input = "aabbccdde";
		String b = removeConsecutiveDuplicates(input);
		input = "aaaaababccaba";
		String b1 = removeConsecutiveDuplicates(input);
		System.out.println(b);
		System.out.print(b1);
	}
}
