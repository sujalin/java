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
  System.out.println("Addition of two no :"+(a+b));
  System.out.println("Substraction of two no :"+(a-b));
  System.out.println("Multiplication of two no :"+(a*b));
  System.out.println("Division of two no :"+(a/b));
  }
}