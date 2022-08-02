import java.util.Arrays;
class ArraySort
{
	public static void main(String[] args)
	{
		int[] a={8,4,3,5,6};
		String[] s= {"C", "O", "I","P","U",};
		Arrays.sort(a);
		Arrays.sort(s);
		System.out.println("Arrays sort in ascending order of Example1");
 		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(s));
		int[] arr={10, 7, 9, 13, 17};
		String[] str= {"E", "H", "G","A","C",};
		Arrays.sort(arr);
		Arrays.sort(str);
		System.out.println("Arrays sort in ascending order of Example2");
 		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));	
	}
}