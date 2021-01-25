// main method can be overloaded 04/07/2019


public class MainOverload {

	public static void main(String[] args) {
	System.out.println("this is main main");
	main(20);
	}
public static void main(int k)
{
	System.out.println("this is overloaded main"+k);
}
}
