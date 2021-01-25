package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmp 
{
	public void delEmployee()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<EmpInfo> emplist = 
                UserInfoReadWriteFromFile.readObjectsFromFile();
	  	
		boolean found = false;
		EmpInfo eobj = null;
	  	  
		System.out.println("Enter Emp Emailid");
	  	String email = sc.next();
	  	  
	  	for(int i = 0;i< emplist.size();i++)
	  	{
	  	    eobj = emplist.get(i);
	  		if(email.equals(eobj.getEemail()))
	  		{
	  			 emplist.remove(i);
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