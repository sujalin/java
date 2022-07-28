import java.util.Scanner;
class Number
{
 public void reverse()
 {
  int rev=0;
  int rem;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Number");
  int num=s.nextInt();
  while(num>0)
   {
    rem=num%10;
    rev=(rev*10)+rem;
    num=num/10;
   }
   System.out.println("Reverse of the number is:"+rev);
 }
}
class ReverseNumber
{
 public static void main(String[] args)
 {
  Number n=new Number();
  n.reverse();
 }
}