class Number
{ 
  public void asending()
  {
   int i;
   System.out.println("Ascending Order");
   for(i=1;i<=10;i++)
    {
     System.out.println(i);
    }
  }
  public void descending()
  {
   int j;
   System.out.println("descending Order");
   for(j=10;j>=1;j--)
    {
     System.out.println(j);
    }
   }
}
class AscDscNumber
{
 public static void main(String[] args)
 {
  Number n=new Number();
  n.asending();
  n.descending();
 }
}
