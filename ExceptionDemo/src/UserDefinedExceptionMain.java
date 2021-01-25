class UserExceptionClass extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg=" ";
	UserExceptionClass(String msg)
	{
		this.msg=msg;
	}
	String getmsg()
	{
		return msg;
	}
}


class otherclass
{
	void f1() throws UserExceptionClass
	{
		System.out.println("inside f1");
		throw new UserExceptionClass("Exception Created");
		//System.out.println("After Exception");
	}
}
public class UserDefinedExceptionMain {

	public static void main(String[] args) {
		
		
		try
		{
			otherclass obj=new otherclass();
			obj.f1();
			System.out.println("inside try");
		}catch(UserExceptionClass e)
		{
			System.out.println(e.getmsg());
		}

	}

}
