package assignment;
public class CompresstheString
{
	public static String getCompressedString(String input)
	{
		String str = input.substring(0, 1);
		int count = 1;
		for(int i = 1; i < input.length(); i++)
		{
			if(input.charAt(i - 1) == input.charAt(i))
			{
				count++;
			}
			else
			{
				if(count > 1)
				{
					str += count;
					count = 1;
				}
				str += input.charAt(i);
			}
		}
		if(count > 1)
		{
			str += count;
			count = 1;
		}
		return str;
	}
	public static void main(String[] args)
	{
		String s = "aaabbcddeeeee";
		String str = getCompressedString(s);
		System.out.print(str);
	}
}
