class StaticMethod  
  {    
   public static void display()   
	{   
		System.out.println("Static method called.");   
	}   
   public static void display(int x)   
	{   
		System.out.println("An overloaded static method called.");   
	} 
  }  
class OverloadStaticMethodExample
  {
   public static void main(String args[])   
	{   
		StaticMethod.display();   
		StaticMethod.display(160);   
	}   
  } 