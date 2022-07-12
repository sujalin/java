import java.util.Scanner;
class Operater
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the value of a=");
  int a=s.nextInt();
  System.out.println("Enter the value of b=");
  int b=s.nextInt();
  System.out.println("a+b :"+(a+b));
  System.out.println("a-b :"+(a-b));
  System.out.println("a*b :"+(a*b));
  System.out.println("a/b :"+(a/b));
  }
}