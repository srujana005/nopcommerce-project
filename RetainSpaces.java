package stringsprogramms;

public class RetainSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is java program";
	
	
	
		String rev=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
		rev=rev+s1.charAt(i);
			}
		System.out.println(rev);
		rev=rev.replace(" ", " ");
		System.out.println(rev);
		
		 String temp=" "; 
		 int j=0; 
		 for(int i=0;i<s1.length();i++)
		 {
		  if(s1.charAt(i)==' ') 
		  {
			  temp=temp+" ";
		  } 
		  else {
		  temp=temp+rev.charAt(j); 
		  j=j+1; 
		 
		  } 
		  
		 } 
		 System.out.println(temp); 
	}
	
}
