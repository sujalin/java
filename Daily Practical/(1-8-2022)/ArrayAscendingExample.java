import java.util.Scanner;
class ArrayAscendingExample
{
	public static void main(String a[])
	{
		int [] arr=new int[5];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 no's:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Numbers after sorting in ascending order:");
                for(int i=0;i<5;i++)
          	{
			System.out.println(arr[i]);
		}
		
 	}
}