package p1;

import java.util.Scanner;

public class EmpLogic {

	private Scanner sc = new Scanner(System.in);
	private EmpInfo emparr[] = new EmpInfo[2];

	public void userInput() {
		for (int i = 0; i < emparr.length; i++) {
			emparr[i] = new EmpInfo();

			System.out.println("Enter the Emp Id =");
			int x = sc.nextInt();
			emparr[i].setEmpid(x);

			System.out.println("Enter the Emp name=");

			emparr[i].setEmpname(sc.next());

			System.out.println("Enter the Emp Email=");

			emparr[i].setEmpemail(sc.next());

			System.out.println("Enter the Emp Mobile=");

			emparr[i].setEmpmobile(sc.next());
		}
	}

	public void display() {
		System.out.println("\n\n");

		for (EmpInfo obj : emparr) // for(int i=0;i<emparr.length;i++) EmpInfo
									// obj=emparr[i];
		{
			System.out.println("Employee Id =" + obj.getEmpid());
			System.out.println("Employee name =" + obj.getEmpname());
			System.out.println("Employee email =" + obj.getEmpemail());
			System.out.println("Employee mobile =" + obj.getEmpmobile());
			System.out.println("\n\n");
		}
	}

	public void search()

	{
		System.out.println("\n Enter the id=");
		int key = sc.nextInt();

		System.out.println("\n The employee Details Are ");

		for (EmpInfo obj : emparr) {

			if (obj.getEmpid() == key) {

				System.out.println("Id =" + obj.getEmpid());
				System.out.println("name =" + obj.getEmpname());
				System.out.println("email =" + obj.getEmpemail());
				System.out.println("mobile =" + obj.getEmpmobile());
			}
		}

	}
}
