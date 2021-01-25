class a
{
	void f1()
	{
		System.out.println("before try");
		
		try
		{
		System.out.println("Before Exception");
		//int x=5;
		System.out.println("after exception");
		}catch(Throwable e)               //superclass of exception class                 
		//catch can or cannot be present
		{
			//int Y=5/0;
		System.out.println("inside catch body");
		}
		finally     //finally is optional
		{
		System.out.println("inside finally");
		}
		System.out.println("after catch/finally");
		
	}
	
	void f2()
	{
		System.out.println("inside f2");
	}
	
}
public class ExceptionMain {

	public static void main(String[] args) {
		
		
		a obj=new a();
		obj.f1();
		obj.f2();

	}

}
