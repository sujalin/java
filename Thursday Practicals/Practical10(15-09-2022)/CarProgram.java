import java.util.Scanner;

class Car//Parent class
{
	//initializing the variables
	int Speed;
	double Price;
	String Color;
	Car()//parent class constructor
	{
		this.Speed = Speed;
		this.Price=Price;
		this.Color=Color;
	}
	public double getSalePrice()
	{
		return Price;
	}
}
class Sedan extends Car//sub class extends the parent class
{
	int length;
	Sedan ()//sub class constructor
	{
		super ();
		this.length = length;
	}
	public double getSalePrice() {
		if (length > 20) //condition checking
		{
			super.getSalePrice(); 
			System.out.println("Congragulation! you got 5% discounts");//Print the statement
		    return 0.05 * super.getSalePrice();
		}
		else 
		{
			super.getSalePrice(); 
			System.out.println("Congragulation! you got 10% discounts");//Print the statement
		    return 0.1 * super.getSalePrice();
		}
}

public class CarProgram {
	
	public static void main(String[] args) {
		Sedan s=new Sedan();//sub class object created
		Scanner sc=new Scanner(System.in);//taking input from the user
		System.out.println("Enter the Speed of the Car");
		int Speed=sc.nextInt();
		System.out.println("Enter the Price of the Car");
		double Price=sc.nextDouble();
		System.out.println("Enter the Color of the Car");
		String Color=sc.next();
		System.out.println("Enter the length of the Car");
		int length=sc.nextInt();
		s.getSalePrice();//calling sub class method
		
		
		
	}
		

	}

}
