import java.util.Scanner;
class Number
{
 public void check()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Number");
  int n=s.nextInt();
  if(n>0)
  {
   System.out.println("The number is Positive");
  }
  else 
  {
   System.out.println("The number is Negative");
  }
 }
}
class PosNegNumber
{
 public static void main(String[] args)
 {
  Number n=new Number();
  n.check();
 }
} 