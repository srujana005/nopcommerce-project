package stringsprogramms;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is java programm";
		System.out.println(s);
		System.out.println(s.length());
		String[] s1=s.split(" ");
		int spaces=s1.length-1;
		System.out.println(spaces);
		split();
		
		

	}
	public static void split()
	{
		String s="this is java program";
		char [] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		
		if(c[i]==' ')
		{
			count =count+1;
		}
	}

		System.out.println("space"+count);
		
	}

}