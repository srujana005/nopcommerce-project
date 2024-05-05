package stringsprogramms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" madam and mom are good friends";
		String[] s1=s.split(" ");
		String rev=" ";
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				rev=rev+s1[i].charAt(j);
	
			}
		
		
		System.out.println(rev);
		if(s1[i]==rev)
			
		{
			System.out.println("palindrome");
		}
		
		}
	}

}
