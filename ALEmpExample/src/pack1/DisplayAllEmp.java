package pack1;

import java.util.ArrayList;

public class DisplayAllEmp 
{
	public void displayAll()
	{
		ArrayList<EmpInfo> emplist = 
                UserInfoReadWriteFromFile.readObjectsFromFile();
	  	  
		System.out.println("DISPLAY EMP");
	    
		for(EmpInfo eobj : emplist)
	    {
	       System.out.println
	         (eobj.getEname() +"   "+eobj.getEemail()+"  "+eobj.getEmobile());
	    }
	}
}