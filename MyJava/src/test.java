//Concepts of static , anonymous (iib) , static blocks and others  

class a
{
	
	private int x=10;
	private static int y=20;
	 
	
	static  
	{
	 System.out.println("STATIC BLOCK"); 	
		
	}
	
	a()
	{
		
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Anonymous Block");
	}
	
	public static void f()
	{
		System.out.println(y); // no memory is allocated for non-static variable as object is not created
        // non static method cannot be called bc memory is ot allocated
	}
	
	public void f2()
	{
		System.out.println(x+ " "+y); 
	
		// normal methods can call static methods
	}
}


public class test
{
	public  static void main(String[] args) {
		
		a.f();  // static methods can be accessed without creating objects
	//	a obj=new a();
	//	a obj1=new a();
		 System.out.println(2+2+"AB"+5+3);
	}
}