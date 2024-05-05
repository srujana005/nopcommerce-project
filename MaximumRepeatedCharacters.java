package stringsprogramms;

public class MaximumRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="javaseleniumclasses";
		char temp=0;
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			if(s.charAt(i)!='#')
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count=count+1;
					}
				}
				if(count>1)
				{
					System.out.println(s.charAt(i)+"---------->"+count);
					
				}
				if(max<count)
				{
					max=count;
					temp=s.charAt(i);
				}
			
			
			
			s=s.replace(s.charAt(i), '#');
			}
		
		}
		System.out.println("***************************");
		System.out.println(temp+"------------>"+max);
	}
}