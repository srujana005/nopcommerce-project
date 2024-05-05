package stringsprogramms;

public class RWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is java programme";
		System.out.println(s);
		String s1[]=s.split(s);
		String rev=" ";
		
		for (int i = 0; i < s1.length; i++)
		{	

			for(int j=s1[i].length()-1;j>=0;j--)
			{rev=rev+s1[i].charAt(j);
			
			
				
			}
			System.out.println(rev	);
			
		}
	
		

	}

}
