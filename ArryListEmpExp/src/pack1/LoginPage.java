package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {

	private ArrayList<EmpInfo> emplist=UserInfoReadWriteFromFile.readObjectFromFile();
	private Scanner sc=new Scanner(System.in);
	
	public void login()
	{
		System.out.println("enter the email id");
		String lemail=sc.next();
		
		System.out.println("enter the password");
		String lpass=sc.next();
		
		boolean found = false;
		EmpInfo empobj = null;
	  	  
		
	  	  
	  	for(int i = 0;i< emplist.size();i++)
	  	{
	  	    empobj = emplist.get(i);
	  		if(lemail.equals(empobj.getEmpemail())&&lpass.equals(empobj.getEmppass()))
	  		{
	  			 
	  			 found = true;
	  			 break;
	  		 }
	  	}
	      
	  	if(found)
	  		  System.out.println("Welcome");
	  	  else
	  	System.err.println("Invalid email or password");
	 }
	}

