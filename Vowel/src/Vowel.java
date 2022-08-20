import java.util.Scanner;
public class Vowel
{
    static public int countVowel()
    {
    	String s;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String=");
    	s=sc.nextLine();
    	char ca[]=s.toCharArray();
    	int counter=0;
    	for(int i=0;i<ca.length;i++)
    	{
    		switch(ca[i])
    		{
    		case 'a','e','i','o','u'->counter++;
    		case 'x'->
    		{
    			try
    			{
    				throw new Exception();
    			}
    			catch(Exception e)
    			{
    				System.out.println(e);
    			}
    		}
    		default->System.out.println();
    		}
    	}
    	// return vowel
    	return counter;
    }
    
	public static void main(String[] args) 
	{
		System.out.println("number of vowel="+countVowel());
	}

}
