class VoweisAndCons
{
	public static void main(String[] args)
	{
		String s="Hi it's vowel and consonants program";
		int vowelCount=0;
		int consonantCount=0;
		System.out.println(s.toLowerCase());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowelCount++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				consonantCount++;
			}
		}
		System.out.println("Total Number of Vowels:"+vowelCount);
		System.out.println("Total Number of Consonants:"+consonantCount);
	}
}