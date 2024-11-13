package day2;
import java.util.*;
public class Studentdetails {

	public static void main(String[] args) {
		Stu1 s1 = new Stu1();
	    //Stu1 s2 = new Stu1();
		//Stu1 s3 = new Stu1();
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the user data---------------------");
		System.out.println("enter the student name :");
		s1.setSname(obj.nextLine());
		obj.nextLine();
		System.out.println("enter the student id:");
		s1.setSid(obj.nextInt());
		System.out.println("enter the student depatment:");
		s1.setDept(obj.nextLine());
		obj.nextLine();
		System.out.println("enter the graduation year:");
		s1.setGraduation_year(obj.nextInt());
		System.out.println("enter the  Contactno:");
		s1.setContactno(obj.nextInt());
		
		System.out.println(s1);
	obj.close();	 
	}
	

}
