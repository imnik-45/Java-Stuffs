import java.util.ArrayList;
import java.util.Scanner;

class ArraylistLogic
{
	ArrayList<Integer> obj=new ArrayList<Integer>();  //creating array list in java
	Scanner sc=new Scanner(System.in);
	
	public void addvalue()
	{
		String s="";
		do
		{
			System.out.println("enter the element");
			int y=sc.nextInt();
			
			//add value in array list
			obj.add(y);
			
			System.out.println("want to add more (y/n)=");
			s=sc.next();
		}while(s.equalsIgnoreCase("y"));
	}
	
	public void  insertatposition()
	{
	System.out.println("enter the index number for inserting=");
	int index=sc.nextInt();
	
	System.out.println("enter the value of  element");
	int val=sc.nextInt();
	
	obj.add(index,val);
	}
	
	public void update()
	{
		System.out.println("enter the index number for updating=");
		int index=sc.nextInt();
		
		System.out.println("enter the updated  element");
		int val=sc.nextInt();
		
		obj.set(index, val);    //used for updating
	}
	
	public void delete()
	{
		System.out.println("enter the index number to delete=");
		int index=sc.nextInt();
	    System.out.println("new list");
		obj.remove(index);
	}
	public void display()
	{
		for(Integer i:obj)
			System.out.println("elements are= "+i);
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {

		ArraylistLogic a=new ArraylistLogic();
		
		a.addvalue();
		a.display();
		//a.insertatposition();
		//a.update();
		a.delete();
		a.display();
	}
}
