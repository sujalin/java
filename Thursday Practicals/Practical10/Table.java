
public class Table {

	public static void main(String[] args) {
		
		int i=1;//initialize the variable
		System.out.printf("N\t10*N\t100*N\t1000*N\n\n",i, i*10,i*100,i*1000);//Print the header
		for(i=1;i<=5;i++)
		{ 
			// loop five times, 1 to 5
			System.out.printf("%d\t%d\t%d\t%d\n", i, i*10, i*100,i*1000);//Print the output table values
		}

	}

}
