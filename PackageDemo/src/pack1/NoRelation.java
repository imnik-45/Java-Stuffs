package pack1;

public class NoRelation {

	
	
	public void f3()
	{
		Parent1 obj=new Parent1();
		//System.out.println("can access default variable by object="+obj.y);
		//System.out.println("Can't access parent private variable even by using objects"+obj.x);
		//System.out.println("can access the protected of parents="+obj.z);
		System.out.println("can access the public of parent"+obj.k);
	}

}
 