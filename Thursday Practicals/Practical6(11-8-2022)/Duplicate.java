package firstprogram;

import java.util.Arrays;
import java.util.HashMap;

public class Duplicate {
	static void removeDuplicate(int[] a,int n)
	{
		HashMap<Integer,Boolean>mp=new HashMap<>();
        for(int i=0;i<n;++i)
        {
        	if(mp.get(a[i])==null)
        	{
        		System.out.print(a[i] + " ");
        		mp.put(a[i], true);
        	}	
        }
	}
	public static void main(String[] args) {
		
		int[] arr= {1,4,9,5,9,3,5,3,9,7,1,5};
		int n=arr.length;
		System.out.println("Before removing duplicate elements:" +Arrays.toString(arr));
		System.out.println("After removing duplicate elements:" );
		removeDuplicate(arr,n);
        
	}
	

}
