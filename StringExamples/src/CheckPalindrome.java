import java.util.*;


class palindrome
{
private Scanner sc=new Scanner(System.in);
private String str="";


public void userInput()
{
System.out.println("enter the string");
str=sc.next();
str.trim();
}
//hard coding takes less time  than user input because time is taken to call scanner and memory allocations
// Optimized logic to reduce execution time

	public boolean PalindromeLogic() 
	{
		    int start = 0;
	        int end = str.length() - 1;
	        int half = end/2;
	         
	        for(int i = 0; i < half; i++, start++, end-- )
	        {
	            if(str.charAt(start) != str.charAt(end))
				return false;
		    }
		   return true;
	}

public void IsPalindrome()
{
	
	if(PalindromeLogic())
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	
}

}
public class CheckPalindrome
{

	public static void main(String[] args)
	{
		
		palindrome obj=new palindrome();
		obj.userInput();
		
		long start=System.nanoTime();   //to check the time for execution
	
		obj.PalindromeLogic();
		obj.IsPalindrome();
		
		
        long end=System.nanoTime();
        long res=end-start;
        System.out.println("execution time is="+res);
	}

}
