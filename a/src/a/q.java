package a;


interface i1
{
	public void display();
}
interface i2 extends i1
{

}
interface i3 extends i1
{
	
}
interface i4 extends i1
{
	
}

class m implements i1,i2,i3,i4
{
	public void display()
	{
		System.out.println("multiple inheritance");
	}
}
public class q {
	public static void main(String a[])
	{
m m1=new m();
m1.display();

}
}
