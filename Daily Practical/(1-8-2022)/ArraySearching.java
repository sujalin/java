import java.util.Scanner;
class ArraySearching
{
	public static void main(String a[])
	{
		int [] arr=new int[5];
		boolean status=false;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 no's:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search value:");
		int searchvalue =sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i]==searchvalue)
			{
				status=true;
				
					
			}
		}
 		if(status==true)
		{
			System.out.println("Search value Found: "+searchvalue);
		}
		else
		{
			System.out.println("Search value Not Found: "+searchvalue);
		}	
		
 	}
}