import java.text.ParseException;     //to parse a String to a Date Object
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. 
//It allows for formatting (date to text), parsing (text to date), and normalization.


class dates
{         
				SimpleDateFormat format=new SimpleDateFormat("dd MM yyy"); //formatter in simpledateformat
				Date dt=new Date();   //object of Date class
				
				private Scanner sc=new Scanner(System.in);	
				private String userdate;
				private long difference;
				
public void UserInput()    //user input for the required date
{
	System.out.println("enter the date in the following way -> dd MM yyyy=");
	userdate=sc.nextLine();
	
}

public void setsysdate()   //display the system date
{
System.out.println("System date is= "+format.format(dt));
}


//date difference logic to implement this program

public void datedifflogic() throws ParseException      //ParseException - if the beginning of the specified string cannot be parsed.             
{
	
	Date date1 = format.parse(format.format(dt));                            //parse the required format
	Date date2 = format.parse(userdate);
	difference = date2.getTime() - date1.getTime();

//since this code IllegalArgumentException - if the given pattern is invalid or format cannot format the given object
//we have to parse the exception e.
	
}

public void display() throws ParseException    //display the difference of system date and user date
{
	System.out.println("No of Days are="+(Math.abs(difference/ (24 * 60 * 60 * 1000)))+" Days"); //to convert milliseconds into days
}

}
public class DateDiff
{

	public static void main(String[] args) throws ParseException
	{
		
	dates obj=new dates();   //object of dates class to access the above class

	
//objects to invoke the methods of class dates
 
   obj.UserInput();
   obj.setsysdate();
   obj.datedifflogic();
   obj.display();
	}

}
