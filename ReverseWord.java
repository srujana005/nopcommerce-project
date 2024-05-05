package stringsprogramms;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is java program";
		String [] s1=s.split(" ");
		String rev=" ";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
			System.out.print(s1[i].charAt(j));
		
			}
			//System.out.println();
			System.out.println(s1[i].length());
		}
		
	}

}
