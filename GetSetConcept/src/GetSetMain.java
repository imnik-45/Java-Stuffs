// concepts of Encapsulation


public class GetSetMain {

	public static void main(String[] args) {
		
		PersonClass obj=new PersonClass();
		
		
		obj.setName("bob");
		obj.setAge(22);
		obj.setColour("blue");
		
		System.out.println("name is="+obj.getName());
		System.out.println("age is="+obj.getAge());
		System.out.println("favorite colour is="+obj.getColour());

	}

}
