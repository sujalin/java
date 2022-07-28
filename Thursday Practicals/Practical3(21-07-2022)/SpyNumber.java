import java.util.Scanner;  
class SpyNumber   
  {  
   public static void main(String args[])  
     {   
       int num,product=1,sum=0,lastdigit;  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the number: " );  
       num=s.nextInt();  
       while(num>0)  
         {  
           lastdigit=num%10;  
           sum=sum+lastdigit; 
           product=product*lastdigit;  
           num=num/10;  
         }  
       if(sum==product) 
         {  
           System.out.println("The given number is a spy number.");
         }  
       else  
         { 
           System.out.println("The given number is not a spy number."); 
         } 
    }  
 } 