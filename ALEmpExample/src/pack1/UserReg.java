package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserReg 
{
	private Scanner sc = new Scanner(System.in);
	
	public void userRegistration()
	{
	   EmpInfo empobj = new EmpInfo();
			 
	   System.out.println("ENter Emp Name");
	   empobj.setEname(sc.next());
			 
	   System.out.println("ENter Emp Email");
	   empobj.setEemail(sc.next());
			 
	   System.out.println("ENter Emp MOBILE");
	   empobj.setEmobile(sc.next());
			 
	   System.out.println("ENter Emp PASSWORD");
	   empobj.setEpassword(sc.next());
		   
		   //READ EXISTING OBJECT FROM FILE
	   ArrayList<EmpInfo> emplist = 
		                   UserInfoReadWriteFromFile.readObjectsFromFile();
	   //ADD NEW OBJECT TO ARRAYLIST
	   emplist.add(empobj);
		   
	   UserInfoReadWriteFromFile.writeObjectstoFile(emplist);
   }
}








