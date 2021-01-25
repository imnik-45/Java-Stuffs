import java.util.*;

class Gcdlogic
{
	private int i,num1,num2,gcd;
	private Scanner sc=new Scanner(System.in);
	
	Gcdlogic()
	{
		i=0;
		num1=0;
		num2=0;
		gcd=0;
	}
	
	public void input()
	{
		System.out.println("enter the  2 numbers=");
		num1=sc.nextInt();
		num2=sc.nextInt();	
	}
	
	public void logic()
	{
		for(i=1;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
	}
	// lcm=(num1*num2)/gcd;
	public void display()
	{
		System.out.println("the gcd is="+gcd);
	}
}

public class GcdMain {

	public static void main(String[] args) {
		
		Gcdlogic obj=new Gcdlogic();
		
		obj.input();
		obj.logic();
		obj.display();
		
	}

}
