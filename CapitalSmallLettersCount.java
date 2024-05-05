package stringsprogramms;

public class CapitalSmallLettersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ThisIsJAVAProgramme";
		int cap=0,small=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				cap++;
			}
			else if(Character.isLowerCase(c))
			{
				small++;
			}
		}
		System.out.println("captital count"+cap);
		System.out.println("smallletterscount"+small);

	}

}
