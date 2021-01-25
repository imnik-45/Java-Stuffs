import java.util.*;

class FibonacciLogic
{
	private int num,a,b,c;
	private Scanner sc=new Scanner(System.in);
	
  FibonacciLogic()  //constructor
	{
		
		num=0;
		a=0;
		b=0;
		c=1;
		
	}
	
	public  void userInput()
	{
	System.out.println("enter the limit of the series=");
	num=sc.nextInt();
   
	}
	
	public void fib() 
    {
	for(int i = 1; i <= num; i++)
    {
		 
        a = b;
        b = c;
        c = a + b;
       display();
    }
    }
	
	public void display()
	{
		 System.out.println(a+" ");    
	}
	
	
}

public class FibonacciMain {

	public static void main(String[] args) {
		
		FibonacciLogic obj=new FibonacciLogic();
		
		obj.userInput();
        obj.fib();
	
	}
}
