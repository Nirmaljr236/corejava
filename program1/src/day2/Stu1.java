package day2;

public class Stu1 {
	private int sid;
	private String sname;
	private String dept;
	private int Graduation_year;
	private long  contactno;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGraduation_year() {
		return Graduation_year;
	}
	public void setGraduation_year(int graduation_year) {
		Graduation_year = graduation_year;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "System.out.println(\"enter the user data\"); [sid=" + sid + ", sname=" + sname + ", dept=" + dept + ", Graduation_year=" + Graduation_year
				+ ", Contactno =" + contactno + "]";
	}
	
	
}
