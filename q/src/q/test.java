package q;
//import java.util.*;
//thread programming 

class a
{
 synchronized void addnum(int i)
	{
		for(int n=1;n<=5;n++)
			System.out.println((n*i));
		try
		{
			Thread.sleep(500);
			
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}

class b extends Thread
{
	a a1;
	b(a a1)
	{
		this.a1=a1;
	}
	public void run()
	{
		a1.addnum(1);
	}
}

class c extends Thread
{
	a a1;
	c(a a1)
	{
		this.a1=a1;
	}
	public void run()
	{
		a1.addnum(2);
	}
}

public class test
{
	public static void main(String args[])
	{
		a a1=new a();
	  b a=new b(a1);
	  c b1=new c(a1);
	  
	  a.start();
	  b1.start();
	}
}  
