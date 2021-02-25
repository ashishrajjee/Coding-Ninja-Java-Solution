package assignment;
public class Sort012
{
	public static void sort012(int[] arr)
    {
        int a=0,b=0,c=0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 2)
                a++;
            else if(arr[i] == 1)
                b++;
            else
                c++;
        }
		for(int i = 0; i< c;i++)
            arr[i] = 0;
        for(int i = c; i<c+b; i++)
            arr[i] = 1;
        for(int i = b+c; i<a+b+c;i++)
            arr[i] = 2;
    }

	public static void main(String[] args)
	{
		int arr[] = {0,1,2,2,0,1,0,1};
		sort012(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
