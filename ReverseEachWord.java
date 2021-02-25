package assignment;
public class ReverseEachWord
{
	public static String reverseEachWord(String input)
	{
		input = input + ' ';
		String str = "";
		int beginIndex = 0;
		String revWord = "";
		for(int i = 0; i < input.length(); i++)
		{
			revWord = "";
			if(input.charAt(i) == ' ')
			{
				for(int j = i - 1; j >= beginIndex; j--)
					revWord += input.charAt(j);
				if(str == "")
				{
					str += revWord;
				}
				else
				{
					str += " " + revWord;
				}
				beginIndex = i + 1;
			}
		}
		return str;
	}
	public static void main(String[] args)
	{
		String s = "Ashish Raj Kushwaha";
		String str = reverseEachWord(s);
		System.out.print(str);
	}
}
