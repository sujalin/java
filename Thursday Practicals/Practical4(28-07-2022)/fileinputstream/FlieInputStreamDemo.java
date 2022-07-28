import java.io.*;
class FlieInputStreamDemo
{
 public static void main(String[] args)
   { 
      try
         {
           FileInputStream fn = new FileInputStream("data.txt");
  	   int a;
	   while((a=fn.read())!=-1)
              {
	          System.out.print((char)a);
              }
           fn.close();
          }
          catch(Exception ex)
               {
 		  System.out.println(ex); 
	       }
   }
}