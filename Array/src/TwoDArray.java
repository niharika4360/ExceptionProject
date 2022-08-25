import java.util.Arrays;

class TwoDArray
{
    static void joinArr(String str[],int arr[])
    {
       System.out.println("name\tvalue\n");
       for(int i=0;i<str.length;i++)
       {
          System.out.println(str[i]+"\t"+arr[i]);
 	  }
    }
    //main method 
	public static void main(String args[])
	{
       String str[]= {"peter","amy","john","boyd","cathy"};
       //sort the string array
       Arrays.sort(str);
       int[] value= {15,9,14,10,20};
       //sort the integer array
       Arrays.sort(value);
       joinArr(str,value);

	}
}
