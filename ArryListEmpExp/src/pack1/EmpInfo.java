package pack1;

import java.io.Serializable;

//model class

public class EmpInfo implements Serializable
{
private String empid;
private String empname;
private String empemail;
private String empmob;
private String emppass;

public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.empemail = empemail;
}
public String getEmpmob() {
	return empmob;
}
public void setEmpmob(String empmob) {
	this.empmob = empmob;
}
public String getEmppass() {
	return emppass;
}
public void setEmppass(String emppass) {
	this.emppass = emppass;
}

}
