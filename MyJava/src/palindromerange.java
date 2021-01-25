import java.util.*;

class palindrome
{
	private Scanner sc=new Scanner(System.in);
	int r1,r2,rem,i,temp;
	
	void input()
	{
		System.out.println("enter the range of numbers=");
		r1=sc.nextInt();
		r2=sc.nextInt();
		System.out.println();
	}
	
	
	void logic()
	{
		for(i=r1;i<=r2;i++)
		{
			temp=i;
			int sum=0;
			while(temp>0)
			{
			rem=temp%10;
			sum=(sum*10)+rem;
			temp/=10;
			}
			if(i==sum)
				System.out.println(i);
		}
	}
}
public class palindromerange {
	public static void main(String[] args) {
		
		palindrome obj=new palindrome();
		
		obj.input();
		obj.logic();
}
}
