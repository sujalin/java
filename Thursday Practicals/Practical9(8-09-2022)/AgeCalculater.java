import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculater {
	//the method calculates the age 
	public static int calculateAge(LocalDate dob)
	{
		//creating an instance of the LocalDate class and invoking the now() method      
		//now() method obtains the current date from the system clock in the default time zone   
		LocalDate currentDate=LocalDate.now();
		//calculates the amount of time between two dates and returns the years
		if((dob!=null)&&(currentDate!=null))
		{
			return Period.between(dob, currentDate).getYears();
		}
		else
		{
			return 0;
		}	
	}

	public static void main(String[] args) {
		//take the input from the user
		System.out.println("Enter the date of birth in YYYY-MM-DD Formate:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();//reads the date of birth from the user
		sc.close();
		//the parse() method obtains an instance of LocalDate from a text string such as 2001-09-27
		LocalDate dob=LocalDate.parse(input);
		//prints the age
		System.out.println("Your Age is "+calculateAge(dob)+" years old");

	}

}
