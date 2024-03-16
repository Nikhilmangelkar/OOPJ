package solution3.in;

public class Student2 {
private String name;
private int rollno;
private double marks;
public void studentDetails(String name,int rollno,double marks) {
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;
	System.out.println("Name : "+name);
	System.out.println("Rollno : "+rollno);
	System.out.println("Marks : "+marks);
	}
public void studentDetails(String name,double marks) {
	this.name=name;
	this.marks=marks;
	System.out.println("Name : "+name);
	System.out.println("Marks : "+marks);
}
	public static void main(String[] args) {
		Student2 s=new Student2();
		s.studentDetails("Nikhil",28,66.58);
		s.studentDetails("Rahul",98.58);
		
		
	}
	}


