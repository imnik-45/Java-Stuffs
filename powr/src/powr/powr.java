package powr;

import java.util.*;
class Powr
{
   public static void main(String arg[])
	
   {
	
       long n,p,r=1;
	
       @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
 
       System.out.println("enter number and powr=");
	  
       n=sc.nextLong();
 
       
	  
       p=sc.nextLong();
 
       if(n>=0&&p==0)
       {   
          r =1;
       }
       else if(n==0&&p>=1)
	{   
            r=0;
	} 
       else
	{ 
              for(int i=1;i<=p;i++)
	       { 
                   r=r *n;
 	 	}    
  	 }    
 
    	  System.out.println(n+"^"+p+"="+r);
 
    }
 
}
