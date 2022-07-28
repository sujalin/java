class Emp
 {
   private String name,address;
   private int year;
   public Emp(String n,int y,String add)
     {
        name=n;
        year=y;
        address=add;
       
     }
   public String getName()
     {
        return name;
     }
   public int getYear()
     {
        return year;
     }
   public String getAddress()
     {
        return address;
     }
 }

class Employee
 {
   public static void main(String[] args)
     {
        Emp e1=new Emp("Robert",1994,"64C-WallsStreat");
        Emp e2=new Emp("Sam",2000,"68D-WallsStreat");
        Emp e3=new Emp("John",1999,"26B-WallsStreat");
        System.out.println("Name \tYear of joining \tAddress");
        System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());
        System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress());
        System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());
     }
 }      