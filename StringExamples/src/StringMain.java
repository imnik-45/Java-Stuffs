//learning string functions 1/7/19

import java.util.Scanner;

class StringDemo
{
	private Scanner sc=new Scanner(System.in);
	private String s1="";
	
	public void userInput()
	{
		System.out.println("enter the string");
	    s1=sc.nextLine();
	    s1.trim();
	 
	}
	
	public void stringFunction()
	{
//		System.out.println("String length="+s1.length());
		
	//System.out.println("Extract character="+s1.charAt(0));
String s2="HI";
//String s3="HI";
String s4=new String("HI");

if(s2==s4) // == compares whether the objects are pointing to same memory  pool
		System.out.println("Matched");
else
	System.out.println("not matched");


if(s2.equals(s4))
		System.out.println("Matched");
else
	System.out.println("not matched");

System.out.println("Lower Case= "+s2.toLowerCase());


	}
	
	public void searchString()
	{
		System.out.println("enter the string you want to search=");
		String search=sc.next();
		
		int index=s1.indexOf(search);
		
		if(index>=0)
			System.out.println("found");
		else
			System.out.println("not found");
	}
	
	public void extractpartofstring()
	{
		System.out.println("extract part=  "+s1.substring(2, 8)); //initial index and n-1
	}
}

public class StringMain {

	public static void main(String[] args) {

		StringDemo obj=new StringDemo();
	obj.userInput();
		//obj.stringFunction();
		//obj.searchString();
		obj.extractpartofstring();
	}

}
