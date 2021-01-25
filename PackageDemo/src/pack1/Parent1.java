package pack1;

public class Parent1
{

	private int x=50;  //scope only within the same class
	int y=60; //default access specifier
	
	protected int z=70;
	public int k=80;
	public void fi()
	{
		System.out.println(x);
	}

}
