import java.util.Arrays;
class ArraySort
{
	public static void main(String[] args)
	{
		int[] a={6,10,9,12,8};
		String[] s= {"I", "U", "A","E","O"};
		Arrays.sort(a);
		Arrays.sort(s);
 		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));	
	}
}