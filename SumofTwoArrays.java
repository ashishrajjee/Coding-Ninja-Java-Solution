package assignment;
public class SumofTwoArrays
{
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[])
    {
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1 ;
        int k = output.length - 1;
        while(k >= 0)
        {
            while(i >=0 && j >=0)
        	{
        		output[k] = arr1[i] + arr2[j] + carry;
                carry = output[k] / 10;
                output[k] = output[k] % 10;
                k--;
                i--;
                j--;
        	}
            while(i != -1)
        	{
        		output[k] = arr1[i] + carry;
        		carry = output[k] / 10;
        		output[k] = output[k] % 10;
        		k--;
        		i--;
        	}
        	while(j != -1)
        	{
        		output[k] = arr2[j] + carry;
        		carry = output[k] / 10;
        		output[k] = output[k] % 10;
        		k--;
        		j--;
        	}
        	output[0] = carry;
            k--;
        }
    }
	public static void main(String[] args)
	{
		int arr1[] = {9,7,3,4};
		int arr2[] = {3,5,3,4};
		int output[] = new int[5];
		sumOfTwoArrays(arr1, arr2, output);
		for(int i = 0; i < output.length; i++)
			System.out.print(output[i]);
	}
}