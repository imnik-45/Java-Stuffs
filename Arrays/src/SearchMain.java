import java.util.*;

class Searchlogic
{
	private int a[],i;                                //int a[]=new a[size];
	private int key;
	private boolean flag;
	private Scanner sc=new Scanner(System.in);
	
	public Searchlogic()                       //constructor
	{
		// i=0;
		flag=false;                                                                                                                                                  
	}
	
	public void arraycreation()
	{
		System.out.println("Enter the array size=");
		int size=sc.nextInt();
		a=new int[size];
	}
	
	public void arrayinput()
	{
		System.out.println("Enter the Array Elements=");
		for( i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	
	public void searchkey()
	{
		System.out.println("enter the key to search=");
		 key=sc.nextInt();
	}
	
	public void searchinglogic()
	{
		
		 
		//for(i=0;i<a.length;i++)           //use for-each:
		for(int n:a)
		{
			//if(a[i]==key)                       
			if(n==key)
			{
				flag=true;
				break;
			}
		}
		
	}
	
	public void display()
	{
		if(flag)
			System.out.println("element found ");
		else
			System.out.println("element is not found");
	}
	
}
public class SearchMain {

	public static void main(String[] args)
	{
		Searchlogic obj=new Searchlogic();
		
		obj.arraycreation();
		obj.arrayinput();
	    obj.searchkey();
		obj.searchinglogic();
		obj.display();
	
	}

}
