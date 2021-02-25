package stringsAnd2DArrays;
public class CountWords
{
	public static int countWords(String str)
	{
		int c = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
            	c++;
        }
        return c;
	}
	public static void main(String[] args)
	{
		String s = "I am Ashish Raj Kushwaha";
		int c = countWords(s);
		System.out.print(c);
	}
}
