//@Niharika
public class SumOfArray
{
    static int  sum(int[] arr,int start,int end)
    {
    int sum=0;
    //Throws the Exception
    try 
    {
    	//code that arise Exception
    	if(arr.length==0)
    		throw new IllegalArgumentException();
    	
    	if(arr==null)
    		throw new NullPointerException();
    	
    	if(start<=0||end>=arr.length||start>end)
    		throw new ArrayIndexOutOfBoundsException();
    	
    	for(int i=start;i<=end;i++)
    	{
    		sum=sum+arr[i];// loop to add start index to end index
    	}
    
    }
    // Catch block to handle the Exception
    catch(IllegalArgumentException ie)
    {
    	System.out.println("enter the value");;
    }
    catch(NullPointerException ne)
    {
    	System.out.println("Array can not be null");
    }
    catch(ArrayIndexOutOfBoundsException ae)
    {
    	System.out.println("Enter the valid of start and end");
    }
    catch(Exception e)
    {
    	System.out.println("sum cannot be zero");
    }
    // return sum
	return sum;

    }
	public static void main(String... args)
	{
       int [] x= {1,2,3,4,5,9,10,41,65,78};
       int result=sum(x,8,9);
       System.out.println("sum of element="+result);
	}

}
