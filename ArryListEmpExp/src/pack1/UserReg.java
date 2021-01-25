package pack1;

import java.util.ArrayList;
import java.util.Scanner;


public class UserReg {
	
	private Scanner sc=new Scanner(System.in);
	
	public void UserRegistration()
	{
		
		EmpInfo empobj=new EmpInfo();
		
		System.out.println("enter the employee Id=");
		empobj.setEmpid(sc.next());
		
		System.out.println("enter the Employee name");
		empobj.setEmpname(sc.next());
		
		System.out.println("enter the employee mobile number=");
		empobj.setEmpmob(sc.next());
		
		System.out.println("enter the employee email=");
		empobj.setEmpemail(sc.next());
		
		System.out.println("enter the employee password=");
		empobj.setEmppass(sc.next());
		
		ArrayList<EmpInfo> emplist=UserInfoReadWriteFromFile.readObjectFromFile();
		emplist.add(empobj);  //adding value in array list
		
		UserInfoReadWriteFromFile.writeObjecttoFile(emplist);
	}
}
