package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmp {
	private ArrayList<EmpInfo> emplist=UserInfoReadWriteFromFile.readObjectFromFile();
	private Scanner sc=new Scanner(System.in);
	
	public void Search()
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
}
