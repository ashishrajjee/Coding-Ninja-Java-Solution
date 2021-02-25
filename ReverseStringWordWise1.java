package stringsAnd2DArrays;

public class ReverseStringWordWise1
{
	public static String reverseWordWise(String str)
	{
		String revStr = "";
		String revWord = "";
		int beginIndex = 0;
		for(int i =0; i < str.length(); i++)
		{
			revWord = "";
			if(str.charAt(i) == ' ')
			{
				for(int j = i-1; j >= beginIndex; j--)
				{
					revWord += str.charAt(j);
				}
				revStr = revStr + revWord + " ";
				beginIndex = i + 1;
			}
		}
		for(int i = str.length() - 1; i >= beginIndex; i--)
			revWord = revWord + str.charAt(i);
		revStr = revStr + revWord;
		String str1 = "";
		for(int i = revStr.length() - 1; i >=0; i--)
			str1 += revStr.charAt(i);
		return str1;
	}
	public static void main(String[] args)
	{
		String s = "Ashish Raj Kushwaha";
		String str = reverseWordWise(s);
		System.out.print(str);
	}
}
