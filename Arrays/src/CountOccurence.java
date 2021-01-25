//count occurrences of the search key

import java.util.Scanner;

class Search
{
	private int a[],i;                                //int a[]=new a[size];
	private int key;
	
	private Scanner sc=new Scanner(System.in);
	private int count=0;
	
	public Search()                       //constructor
	{
		i=0;
		                                                                                                                                                
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
		
		 
		for(i=0;i<a.length;i++)           //use for-each:
	
		{
			if(a[i]==key)                       
			
			{
				count++;
				
			}
		}
		
	}
	
	public void display()
	{
		if(count>0)
			System.out.println("element found and occurences are="+count);
		else
			System.out.println("element is not found");
	}
	
}
public class CountOccurence 
{
public static void main(String[] args)
{
	
	
	Search obj=new Search();
	
	obj.arraycreation();
	obj.arrayinput();
    obj.searchkey();
	obj.searchinglogic();
	obj.display();
	
	
}
}
