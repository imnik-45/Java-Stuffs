import java.io.Serializable;

interface i1
{
   //VERIABLES BY DEFAULT public, static, final
   int x = 50;	
  
   //NO NEED ABSTRUCT KEYWORD
   //ALL METHODS BY DEFAULT PUBLIC
   void f1();
   
   static void f2()
   {
	   System.out.println("HI");
   }
   
   default void f3()
   {
	   System.out.println("HELLO");
   }
}

//FUNCTIONAL INTERFACE
interface i2
{
	void f5();
}
/*
interface K1
{}
interface K2
{}

interface k3 extends K1,K2
{}
*/
/*
class K1
{}
class K2
{}

class k3 extends K1,K2
{}
*/




class A implements i1,Serializable
{
	public void f1() 
	{
	   System.out.println("IINSIDE CLASS A");	
	}
}

public class IDemo {

	public static void main(String[] args) {
		//i1 obj = new i1();
		//i1.f2();
		
		A obj = new A();
		obj.f3();
		obj.f1();

	}

}









