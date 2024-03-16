package solution.in;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollno;
	private int marks;
	  
	public void acceptDetails() {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.print("Name : ");
			this.name=sc.nextLine();
			System.out.print("RollNo : ");
			this.rollno=sc.nextInt();
			System.out.print("Marks : ");
			this.marks=sc.nextInt();
			
		}
	}
	public void printDetails() {
		System.out.println(this.name+ " "+this.rollno+" "+this.marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.acceptDetails();
		s1.printDetails();
		

	}

}
