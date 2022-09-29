
public class MoveNegitiveElements {
	static void Elements(int arr[],int n)
	{
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				temp[j++]=arr[i];
			}
			if(j==n || j==0)
			{
				return; // retuns if array coatain all positive or all negative
			}	
		}
		//store negative elements in temp array
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				temp[j++]=arr[i];
			}
		}
		//copy contents of temp arrary to arr[]
		for (int i = 0; i < n; i++)
            arr[i] = temp[i];
		
	}
	//main method
	public static void main(String[] args) {
		int arr[]= {1, -1, 3, 2, -7, -5, 11, 6 };
		int n=arr.length;
		Elements(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
