import java.util.Scanner;
class HexaToDecimal
{
    public static void main(String[] args)
    {
        // creating scanner object 
         Scanner sc = new Scanner(System.in);
        // input a  octal value as a string  through scanner class 
        System.out.println("Enter a hexadecimal  Value : ");//taking intput from user
        String input=sc.next();
        int output = Integer.parseInt(input,16);//Convert String to int
        System.out.println("Decimal equivalent is :"+output);//print the output
    }
}