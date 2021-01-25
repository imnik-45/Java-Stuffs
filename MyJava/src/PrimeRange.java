import java.util.*;

class primer
{
	int r1,r2,flag=0,i,x;
	private Scanner sc=new Scanner(System.in);
	
	void input()
	{
	System.out.println("enter the range=");
	r1=sc.nextInt();
	r2=sc.nextInt();
	}
	
	
	void primecalc()
	{
		for(x=r1+1;x<=r2-1;x++)
	{
		for( i=2;i<x;i++)
			if(x%i==0)
				break;
		 if(i==x)
		display();
	}
	}
		
		void display()
		{
			System.out.println(" "+x);
		}
	
	
}
public class PrimeRange {

	public static void main(String[] args) {
	
		
		primer obj=new primer();
		
		obj.input();
		obj.primecalc();

	}

}
