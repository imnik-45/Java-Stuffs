package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserInfoReadWriteFromFile 
{
	public static ArrayList<EmpInfo> readObjectsFromFile()
	{
		ArrayList<EmpInfo> userlistfromfile;
		try
		{
		   FileInputStream fin=new FileInputStream("UserRegiInfo.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   userlistfromfile=(ArrayList<EmpInfo>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			userlistfromfile=new ArrayList<EmpInfo>();
		 }
		 
		return userlistfromfile;
	}
	
	public static void writeObjectstoFile(ArrayList<EmpInfo> ulist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("UserRegiInfo.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(ulist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}

}








