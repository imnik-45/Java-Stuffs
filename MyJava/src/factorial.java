//import java.util.*;
class factorial_logic 
{
	//private  Scanner sc=new Scanner (System.in);
	java.util.Scanner sc=new java.util.Scanner(System.in);  // without using import we can write java code
	private int no, result;
	
	
	public factorial_logic()      //non-parameterized constructor
	{
		no=0;
		result=1;
	}
	
	public void userinput()
	 {
		 System.out.println("enter a number=");
		 no=sc.nextInt();
	 }
	 
	public  void calculation()
	 {
		 for(int i=1;i<=no;i++)
			 result*=i;
	 }
	 
	 public void display()
	 {
		 System.out.println("the factorial is="+result);
	 }
}
public class factorial {

	public static void main(String[] args)
	{
		factorial_logic obj=new factorial_logic();
		
		obj.userinput();
		obj.calculation();
		obj.display();
		
	}
}
