import java.util.StringTokenizer;
class StringTokenizerExa
    {
       public static void main(String[] args )
	  {
                String s="Hii This is StringTokenizer Program";
		StringTokenizer st= new StringTokenizer(s);
		while (st.hasMoreElements())
		 {
		     System.out.println(st.nextToken());
                     
		 }
                System.out.println("Length of the String is: "+s.length());
                System.out.println("Upper case of the String is: "+s.toUpperCase());
                System.out.println("Lower case of the String is: "+s.toLowerCase());
                System.out.println("Character at 5th position in String: "+s.charAt(5));
                System.out.println("Index value of String: "+s.indexOf('S'));

	  }
     }
