package pack1;

public class AlEmpMain 
{

	public static void main(String[] args) 
	{
		
		/*
		AlEmpLogic obj=new AlEmpLogic();
		
		obj.addvalue();
		obj.displayall();
		obj.deletebyid();
		obj.displayall();
	    obj.SearchEmp();
		obj.deletebyid();
		obj.displayall();
		obj.updatebyid();
		obj.displayall();
		*/
		UserReg obj = new UserReg();
		obj.UserRegistration();
		
		displayallEmp obj1 = new displayallEmp();
		obj1.displayall();
		
		SearchEmp obj3 = new SearchEmp();
		obj3.Search();
		
		DeleteEmp obj4 = new DeleteEmp();
		obj4.delEmployee();
		
		obj1.displayall();
		
		/*
		 LoginPage obj5=new LoginPage(); obj5.login();
		*/

		/*
		 UpdateInfo obj6=new UpdateInfo(); obj6.update(); obj1.displayall();
		*/
	}
}