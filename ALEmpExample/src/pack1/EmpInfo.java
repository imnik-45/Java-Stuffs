package pack1;

import java.io.Serializable;

//MODEL CLASS
public class EmpInfo implements Serializable
{
	private String ename;
	private String eemail;
	private String emobile;
	private String epassword;

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEmobile() {
		return emobile;
	}
	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

}
