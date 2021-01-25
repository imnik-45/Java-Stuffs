import java.util.*;

class search
{
	private Scanner sc=new Scanner(System.in);
	private String str="";
	private int count=0;
	
	public void userInput()
	{
	System.out.println("Enter the string");
	str=sc.nextLine();
	str.trim();
	}
	
	//split() method breaks a given string around matches of the given regular expression.
	
	public void SearchLogic()
	{
		 String a[] = str.split(" ");  
		 System.out.println("enter the word to search");
		String key=sc.next();
		
		
		 for(int i=0;i<a.length;i++)
		 {
			 if(key.equals(a[i]))
				 count++;
		 }
	}
	
	public void display()
	{
		System.out.println("No. Of Occurences are="+count);
	}
}
public class SearchWordSplit {

	public static void main(String[] args) {
		
		search obj=new search();
		
		obj.userInput();
		obj.SearchLogic();
		obj.display();

	}

}
