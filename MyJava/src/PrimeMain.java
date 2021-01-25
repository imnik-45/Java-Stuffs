import java.util.*;

class PrimeLogic
{
	 private int num; 
	 boolean flag;
	 private Scanner sc=new Scanner(System.in);
	  
	 public PrimeLogic()    //constructor   
	 {
		 num=0;
		 flag=true;
	 }
	
	 public void userInput()
	  {
	  System.out.println("Enter the number=");
	  num=sc.nextInt();
	  }
	  
	  public void Calculations()
	  {
		 for(int i=2;i<=num/2;i++)
		 {
			 if(num%i==0)
			 {
				 flag=false;
				 break;
			 }
		 }
	  }
	  
	  public void IsPrime()
	  {
		  if(flag==true)
			  System.out.println("number is prime");
		  else
			  System.out.println("number is not prime");
	  }
}
public class PrimeMain {

	public static void main(String[] args) {
		
		PrimeLogic obj=new PrimeLogic();
			
			obj.userInput();
			obj.Calculations();
			obj.IsPrime();
	}

}
