package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmp 
{
	public void searchEmployee()
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<EmpInfo> emplist = 
                UserInfoReadWriteFromFile.readObjectsFromFile();
	  	
		int foundpos = -1;
		EmpInfo eobj = null;
	  	  
		System.out.println("Enter Emp Emailid");
	  	String email = sc.next();
	  	  
	  	for(int i = 0;i< emplist.size();i++)
	  	{
	  	    eobj = emplist.get(i);
	  		if(email.equals(eobj.getEemail()))
	  		{
	  			 foundpos = i;
	  			 break;
	  		 }
	  	}
	      
	  	if(foundpos == -1)
	  		  System.out.println("INVALID EMAIL ID - NOT FOUND");
	  	  else
	  		System.out.println(eobj.getEname() +"   "+eobj.getEemail()+"  "+eobj.getEmobile());
     }

}
