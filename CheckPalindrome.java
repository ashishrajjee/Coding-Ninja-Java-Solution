package stringsAnd2DArrays;
public class CheckPalindrome
{
	public static boolean checkPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;
        while (i < j)
        {
        	if(str.charAt(i) != str.charAt(j))
        	{
        		return false; 
        	}
            i++; 
            j--; 
        } 
		return true;
	}
	public static void main(String[] args)
	{
		String str = "abcdcba";
		boolean b = checkPalindrome(str);
		System.out.println(b);
		String str1 = "abcd";
		boolean b1 = checkPalindrome(str1);
		System.out.print(b1);
	}
}
