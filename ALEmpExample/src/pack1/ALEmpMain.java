package pack1;

public class ALEmpMain {

	public static void main(String[] args) {
		
		//ALEmpLogic obj = new ALEmpLogic();
		//obj.userInput();
		//obj.display();
		//obj.searchEmp();

		UserReg obj = new UserReg();
		obj.userRegistration();
		
		
		DisplayAllEmp obj1 = new DisplayAllEmp();
		obj1.displayAll();
		/*
		SearchEmp obj2 = new SearchEmp();
		obj2.searchEmployee();
		*/
		
		DeleteEmp obj3 = new DeleteEmp();
		obj3.delEmployee();
                                  DisplayAllEmp obj2 = new DisplayAllEmp();
		obj2.displayAll();
	}

}
