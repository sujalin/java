import java.util.Scanner;
class SecondLargSmallArr
{
    public static void main(String[] args) 
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the Elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Highest Element in array:"+a[n-2]);
        System.out.println("Second Smallest Element in array:"+a[1]);
    }
}