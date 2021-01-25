// Simple Inheritance Example 2/7/19  concepts of super() , overriding and others


class parent
{
	int x=10;
	parent()
	{
		System.out.println("inside parent constructor");
	}
	public void f1()
	{
		System.out.println("INSIDE PARENT CLASS F1 METHOD");
	}
	
	public void f3()
	{
		System.out.println("inside parent f3 method");
	}
}

class child extends parent
{
	int x=20;
	child()
	{
		 super();  //compiler by default adds the super keyword in child class constructor calls immediate parent class 
		
		//System.out.println(x+"  "+super.x);
		System.out.println("inside child constructor");
	}
	public void f2()
	{
		System.out.println("INSIDE CHILD CLASS F2 METHOD");
	}
	// Override method
	public void f3()
	{
		super.f3(); // explicit call parent class method from override method
		System.out.println("inside child f3 method");
	}
}
public class InheritenceMain {

	public static void main(String[] args) {
		
	
parent pobj=new parent();


//cobj.f1();
//cobj.f2();
pobj.f3();
child cobj=new child();
cobj.f3();
//pobj.f1();
	}

}
