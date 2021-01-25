package pack1;

import java.util.ArrayList;

public class displayallEmp{
	public void displayall()
	{
		ArrayList<EmpInfo> emplist=UserInfoReadWriteFromFile.readObjectFromFile();
	
	System.out.println("Employee details");
	for(EmpInfo empobj:emplist)
		{
	System.out.println
	(empobj.getEmpid()+" "+empobj.getEmpname()+" "+empobj.getEmpmob()+" "+empobj.getEmpemail()+" "+empobj.getEmppass());
		}
	}
}
