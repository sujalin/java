abstract class Marks
 {
   abstract double getPercentage();
 }
class A extends Marks
 {
   public float subject1,subject2,subject3;
   public A(float s1,float s2,float s3)
     {
       subject1=s1;
       subject2=s2;
       subject3=s3;
     }
   double getPercentage()
     {
       return(subject1+subject2+subject3)/300*100;
     }
 }

class B extends Marks
 {
   private float subject1,subject2,subject3,subject4;
   public B(float s1,float s2,float s3,float s4)
     {
       subject1=s1;
       subject2=s2;
       subject3=s3;
       subject4=s4;
     }
   double getPercentage()
     {
       return(subject1+subject2+subject3+subject4)/400*100;
     }
 }

class Abstract
 {
   public static void main(String[] args)
    {
       A a=new A(70,80,90);
       B b=new B(50,60,75,95);
       double p1=a.getPercentage();
       double p2=b.getPercentage();
       System.out.println("The percentage of student A is: "+p1);
       System.out.println("The percentage of student B is: "+p2);
    }
 }
 