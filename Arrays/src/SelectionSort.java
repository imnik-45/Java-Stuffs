import java.util.Scanner;
// import java.util.Arrays; 


class Selection
{
	private int a[],swap,i,j,pos;
	private Scanner sc=new Scanner(System.in);
	
	public Selection()
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
	
	void SelectionLogic() // selection sort logic
	{
		// Arrays.sort(a);

		for (i = 0; i < a.length - 1; i++) {
			pos = i;
			for (j = i + 1; j < a.length; j++) {
				
				/*
				 * if(a[pos]>a[j]) //this also works pos=j; }
				 * 
				 * if(pos!=i) { swap=a[i]; a[i]=a[pos]; a[pos]=swap;
				 */

			if (a[j] < a[pos])
					pos = j;
			}
			swap = a[i];
			a[i] = a[pos];
			a[pos] = swap;
		}

	}
	
	void display()
	{
		System.out.println("the sorted array is :");
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
public class SelectionSort {

	public static void main(String[] args) {
		
		Selection obj=new Selection();
		obj.Arraycreation();
		obj.Arrayinput();
		obj.SelectionLogic();
		obj.display();
		

	}

}
