class BinarySearchDemo
{
	public static void main(String[] args)
	{
		int a[]={30,40,50,60,70};
		int first=0;
 		int last=a.length-1;
		int searchvalue=50;
		binarySearch(a,first,last,searchvalue);
	}
	public static void binarySearch(int a[],int first,int last,int searchvalue)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid]<searchvalue)
			{
				first=mid+1;
			}
			else if(a[mid]==searchvalue)
			{
				System.out.println("Element Found At Index: "+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element Not Found !");	
		}


	}
}