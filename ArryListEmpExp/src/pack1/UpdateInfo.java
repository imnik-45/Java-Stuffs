package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateInfo
{
	private ArrayList<EmpInfo> emplist=UserInfoReadWriteFromFile.readObjectFromFile();
	private Scanner sc=new Scanner(System.in);
public void update()
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
		empobj2.setEmpid(sc.next());
		*/
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
		UserInfoReadWriteFromFile.writeObjecttoFile(emplist);
	}
}
}
