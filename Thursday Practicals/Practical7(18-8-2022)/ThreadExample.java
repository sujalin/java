import java.util.*;
class EvenNum implements Runnable
{
	public int a;
	public EvenNum(int a)
	{
		this.a=a;
	}
	public void run()
	{
		
		System.out.println("The thread "+a+"is Even and Sqare of "+a+"is: "+a*a);
	}
}
class OddNum implements Runnable
{
	public int a;
	public OddNum(int a)
	{
		this.a=a;
	}
	public void run()
	{
		
		System.out.println("The thread "+a+"is Odd and Cube of "+a+"is: "+a*a*a);
	}
}
class RandomNumGen extends Thread
{
	public void run()
	{
		int n=0;
		Random r=new Random();
		try {
		for(int i=0;i<10;i++)
		{
			n=r.nextInt(15);
			System.out.println("Generated number is: "+n);
			if(n%2==0)
			{
				Thread t1=new Thread(new EvenNum(n));
				t1.start();
			}
			else
			{
				Thread t2=new Thread(new OddNum(n));
				t2.start();
			}
			Thread.sleep(1000);
		
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		}
}
public class ThreadExample {
	public static void main(String[] args) {
		RandomNumGen r1=new RandomNumGen();
		r1.start();

	}
}