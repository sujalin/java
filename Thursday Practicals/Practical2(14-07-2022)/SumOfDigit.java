import java.util.Scanner;
class Number 
{
 public void sumdigit()
 {
  int sum=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Number");
  int n=s.nextInt();
  while(n!=0)
  {
   sum=sum+n%10;
   n=n/10;
  }
  System.out.println("Sum of digits are :"+sum);
 }
}
class SumOfDigit
{
 public static void main(String[] args)
 {
  Number n=new Number();
  n.sumdigit();
 }
}