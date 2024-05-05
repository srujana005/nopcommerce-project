package stringsprogramms;

public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="thisisjavaseleniumjkaaa";
		char [] ch= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			
			for(int j=0;j<ch.length;j++)
			{
			if(s.charAt(i)==s.charAt(j))
			{
			
				count=count+1;
			}
		}
			}
		System.out.println("vowels count"+count);
		int ccount=s.length()-count;
		System.out.println("consonants count"+ccount);

	}

 }
