import java.util.Scanner;

public class ExceptionTest
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		int i1,i2,result;
		System.out.println("Enter the first number=");
		s1=sc.next();
		System.out.println("Enter the second number=");
		s2=sc.next();
		try
		{
			i1=Integer.parseInt(s1);
			i2=Integer.parseInt(s2);
			result=(i1)/(i2);
			System.out.println("result is ="+result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("format mismatch");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("invalid division");
		}
		catch(Exception e)
		{
			System.out.println("Exception encountered");
		}



		

	}

}
