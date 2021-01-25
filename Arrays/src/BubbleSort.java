import java.util.*;

class bubble
{
	private int a[],i,j,temp;
	private Scanner sc=new Scanner(System.in);
	int size;
	
	public bubble()                  //CONSTRUCTOR
	{
		i=0;
		j=0;
	}
	
	void arraycreation()
	{
		System.out.println("enter the array size=");
		size=sc.nextInt();
		a=new int[size];
	}
	
	void arrayinput()
	{
		System.out.println("enter the array elements=");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	
	void bubblelogic()   //bubble sort logic
	{
		
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
	void display()
	{
		System.out.println("the sorted array is=");
		for(i=0;i<a.length;i++)
		System.out.println(" "+a[i]);
	}
}
public class BubbleSort {

	public static void main(String[] args) {

		
		bubble obj=new bubble();
		
		obj.arraycreation();
		obj.arrayinput();
		obj.bubblelogic();
		obj.display();

	}

}
