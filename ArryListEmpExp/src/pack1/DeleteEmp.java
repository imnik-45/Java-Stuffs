package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmp 
{
	private Scanner sc = new Scanner(System.in);
 private	ArrayList<EmpInfo> emplist = 
            UserInfoReadWriteFromFile.readObjectFromFile();
	public void delEmployee()
	{
		
	  	
		boolean found = false;
		EmpInfo empobj = null;
	  	  
		System.out.println("Enter Emp Emailid");
	  	String email = sc.next();
	  	  
	  	for(int i = 0;i< emplist.size();i++)
	  	{
	  	    empobj = emplist.get(i);
	  		if(email.equals(empobj.getEmpemail()))
	  		{
	  			emplist.remove(i);
	  			UserInfoReadWriteFromFile.writeObjecttoFile(emplist);
	  			 
	  			 found = true;
	  			 break;
	  		 }
	  	
	  	}
	      
	  	if(found)
	  		  System.out.println("EMP DELETED");
	  	  else
	  		System.out.println("INVALID EMAIL ID - NOT FOUND");
	 }
}