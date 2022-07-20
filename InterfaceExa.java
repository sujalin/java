interface boy
{
   final int b=6;
   public void display1();
}
interface girl
{
   final int c=9;
   public void display2();
}
class Values implements boy,girl
{
  public void display1()
    {
        System.out.println("Boys value is b= "+b);
    }
  public void display2()
    {
        System.out.println("Girls value is c= "+c);  
    }
}
class InterfaceExa
 {
   public static void main(String[] args)
     {
        Values v=new Values();
        v.display1();
        v.display2();
     }
  }


