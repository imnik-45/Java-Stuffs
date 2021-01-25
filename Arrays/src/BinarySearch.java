// implement binary search in java

import java.util.*;

class binary
{
	private Scanner sc=new Scanner(System.in);
	private int size,mid,first,last,a[],key;
	private boolean flag=false;

	public void ArrayCreation()
	{
		System.out.println("Enter the array size=");
		size=sc.nextInt();
		a=new int[size];
	}
	
	public void ArrayInput()
	{
		System.out.println("Enter the sorted array elements=");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	
	public void keyinput()
	{
		System.out.println("Enter the key=");
	    key=sc.nextInt();
	}

	public void binarylogic()
	{
		first=0;
		last=size-1;
		mid=(first+last)/2;
		
		while(first<=last)
		{
			if(a[mid]<key)
				first=mid+1;
			else if(a[mid]==key)
	    {	    flag=true;
			    break;
		}
			else
				last=mid-1;
			
			mid=(first+last)/2;
		}
	}
	
	public void display()
	{
	if(flag)
	System.out.println("key found");
	else
	System.out.println("key is not found");
	}
	
}

class BinarySearch
{
	public static void main(String args[])
	{
		
		binary obj=new binary();
		
		obj.ArrayCreation();
		obj.ArrayInput();
		obj.keyinput();
		obj.binarylogic();
		obj.display();
		
		
	}
}