package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class AlEmpLogic {

	private ArrayList<EmpInfo> emplist=new ArrayList<EmpInfo>();
	private Scanner sc=new Scanner(System.in);

	public void addvalue()
	{
		String s="";
		do
		{
			EmpInfo empobj=new EmpInfo();
			System.out.println("enter the employee Id=");
			empobj.setEmpid(sc.next());
			
			System.out.println("enter the Employee name");
			String name=sc.next();
			empobj.setEmpname(name);
			
			System.out.println("enter the employee mobile number=");
			empobj.setEmpmob(sc.next());
			
			System.out.println("enter the employee email=");
			empobj.setEmpemail(sc.next());
			
			System.out.println("enter the employee password=");
			empobj.setEmppass(sc.next());
			
	
			emplist.add(empobj);  //adding value in array list
			
			System.out.println("want to add more (y/n)=");
			s=sc.next();
		
			
		}while(s.equalsIgnoreCase("y"));

	}
	
	public void SearchEmp()
	{
	int found=-1;
	EmpInfo empobj=null;
	
	System.out.println("enter the employee Id to search");
	String ids=sc.next();
	
	for(int i=0;i<emplist.size();i++)   //to get the number of elements  of the array list
	{
		 empobj=emplist.get(i);       //returns the element at the specified index
		
		if(ids.equals(empobj.getEmpid()))
		{
			found=i;
			break;
		}
		
	}
	if(found==-1)
		System.out.println("invalid Employee id");
	else
		System.out.println
	(empobj.getEmpid()+" "+empobj.getEmpname()+" "+empobj.getEmpmob()+" "+empobj.getEmpemail()+" "+empobj.getEmppass());
		
}
	
	public void deletebyid()
	{
		int found=-1;
		EmpInfo empobj=null;
		
		System.out.println("enter the employee Id to delete ");
		String ids=sc.next();
		
		for(int i=0;i<emplist.size();i++)   //to get the number of elements  of the array list
		{
			 empobj=emplist.get(i);       //returns the element at the specified index
			
			if(ids.equals(empobj.getEmpid()))
			{
				found=i;
				break;
			}
			
		}
		if(found==-1)
			System.out.println("invalid Employee id");
		else
		{
			emplist.remove(empobj);
		}	
	}
	
	public void updatebyid()
	{
		int found=-1;
		EmpInfo empobj=null;
		
		System.out.println("enter the id to update=");
		String id=sc.next();
		
		for(int i=0;i<emplist.size();i++)
		{
            empobj=emplist.get(i);       //returns the element at the specified index
			
			if(id.equals(empobj.getEmpid()))
			{
				found=i;
				break;
			}
			
		}
		if(found==-1)
			System.out.println("invalid Employee id");
		else
		{
			System.out.println("please enter the new details\n");
			EmpInfo empobj2=new EmpInfo();
		/*	System.out.println("enter the employee Id=");
			empobj2.setEmpid(sc.next());   */
			
			System.out.println("enter the Employee name");
			String name=sc.next();
			empobj2.setEmpname(name);
			
			System.out.println("enter the employee mobile number=");
			empobj2.setEmpmob(sc.next());
			
			System.out.println("enter the employee email=");
			empobj2.setEmpemail(sc.next());
			
			System.out.println("enter the employee password=");
			empobj2.setEmppass(sc.next());
			
		    empobj2.setEmpid(empobj.getEmpid());
			emplist.add(empobj2);
			emplist.remove(empobj);
		}
	}
		
	public void displayall()
	{
	
	System.out.println("Employee details");
	for(EmpInfo empobj:emplist)
		{
	System.out.println
	(empobj.getEmpid()+" "+empobj.getEmpname()+" "+empobj.getEmpmob()+" "+empobj.getEmpemail()+" "+empobj.getEmppass());
		}
	}
	
}
