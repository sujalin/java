import java.util.*;
import java.util.Arrays;
class ArraySortDes
{
	public static void main(String[] args)
	{
		Integer[] numbers=new Integer[]{ 8,4,3,5,6};
		String[] str={"C","O","I","P","U"};
		Arrays.sort(numbers,Collections.reverseOrder());
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println("Arrays sort in descending order");
 		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(str));	
	}
}