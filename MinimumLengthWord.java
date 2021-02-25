package test2;
public class MinimumLengthWord
{
	public static String minLengthWord(String input)
	{
		int space = 0;
		int startIndex = 0;
		int endIndex = 0;
		int minLength = Integer.MAX_VALUE;
		for(int i = 0; i <= input.length(); i++)
		{
			if(i == input.length() || input.charAt(i) == ' ')
			{
				int length = i - space;
				if(minLength > length)
				{
					minLength = length;
					startIndex = space;
					endIndex = i;
				}
				space = i + 1;
			}
			
			
		}
		return input.substring(startIndex, endIndex);
	}
	public static void main(String[] args)
	{
		String str = "This is a test String";
		System.out.println(minLengthWord(str));
	}
}
