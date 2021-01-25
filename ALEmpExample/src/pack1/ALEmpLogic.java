package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class ALEmpLogic 
{
	
   private ArrayList<EmpInfo> emplist = new ArrayList<EmpInfo>();
   private Scanner sc = new Scanner(System.in);
     
   public void userInput()
   {
	   String s="";
  	   do
  	   {
  		 EmpInfo empobj = new EmpInfo();
  		 
  		 System.out.println("ENter Emp Name");
  		 String ename = sc.next();
  		 empobj.setEname(ename);
  		 
  		 System.out.println("ENter Emp Email");
 		 empobj.setEemail(sc.next());
  		 
 		 System.out.println("ENter Emp MOBILE");
		 empobj.setEmobile(sc.next());
 		 
		 System.out.println("ENter Emp PASSWORD");
		 empobj.setEpassword(sc.next());
 		 
  		 //ADD EMP OBJECT IN ARRAYLIST
		 emplist.add(empobj);
  		 
  		 System.out.println("Want to Add Another Y/N");
  		 s = sc.next();
     	 }while(s.equalsIgnoreCase("y"));
    }
   
   public void display()
   {
  	  System.out.println("DISPLAY EMP");
      for(EmpInfo eobj : emplist)
      {
         System.out.println
           (eobj.getEname() +"   "+eobj.getEemail()+"  "+eobj.getEmobile());
      }
   }
   
   public void searchEmp()
   {
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