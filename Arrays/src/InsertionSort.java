import java.util.Scanner; 


class Insertion
{
	private int a[],swap,i,temp;
	private Scanner sc=new Scanner(System.in);
	
	public Insertion()
	{
		i=0;
	}
	
	void Arraycreation()
	{
		System.out.println("Enter the array size=");
		int size=sc.nextInt();
		a=new int[size];
	}
	
	void Arrayinput()
	{
		System.out.println("enter the array elements=");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	
	void InsertionLogic()
	{
		// Arrays.sort(a);
      
		for(i=0;i<a.length-1;i++)
		{
			temp=i;
			
			while(temp>0 && (a[temp-1]>a[temp]))
			{
				swap=a[temp];
				a[temp]=a[temp-1];
				a[temp-1]=swap;
				
				temp--;
			}
		}
	}
	
	void display()
	{
		System.out.println("the sorted array is :");
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}


public class InsertionSort {

	public static void main(String[] args) {
	    Insertion obj=new Insertion();
		obj.Arraycreation();
		obj.Arrayinput();
		obj.InsertionLogic();
		obj.display();
	}

}
