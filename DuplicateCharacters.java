package stringsprogramms;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="thiisjavaprogramme";
            for(int i=0;i<s.length();i++)
            {int count=1;
            if(s.charAt(i)!='#')
            {
            	for(int j=i+1;j<s.length();j++)
            	{
            		if(s.charAt(i)==s.charAt(j))
            		{
            			count=count+1;
            		}
            	}
            	}
            	if(count>1)
            	{
            		System.out.println(s.charAt(i)+"------>"+count);
            	}
            
            
            s=s.replace(s.charAt(i),'#');
            }    	
            

	}

}
