package firstprogram;

import java.util.ArrayList;

public class ArralistExample {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Before adding elements"+a1);
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Krishna");
		a1.add("Laxman");
		a1.add("Balram");
		System.out.println("After adding elements"+a1);
		a1.remove("Laxman");
		System.out.println("After removing elements "+a1);
		System.out.println("The element at 3rd index is:" +a1.get(3));
	}

}
