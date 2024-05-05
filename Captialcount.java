package stringsprogramms;

public class Captialcount {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	String [] s= {"thIS","Is","JaVa"};
	int cap=0;
	int small=0;
	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<s[i].length();j++)
		{
			char c=s[i].charAt(j);
			if(Character.isUpperCase(c))
			{
				cap++;
			}
		}

		
	}
	System.out.println(cap);

	}

}
