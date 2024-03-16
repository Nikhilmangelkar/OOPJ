package solution2.in;

public class Vehicle {
	String model;
	int year;
	String type;
	public void displayDetails(String s) {
		this.model=s;
		System.out.println("Model :"+this.model);
	}
	public void displayDetails(String s,int y) {
		this.model=s;
		this.year=y;
		System.out.println("Model : "+this.model);
		System.out.println("Year : "+this.year);
	}
	public void displayDetails(String s,int y,String t) {
		this.model=s;
		this.year=y;
		this.type=t;
		System.out.println("Model :"+this.model);
		System.out.println("Year :"+this.year);
		System.out.println("Type :"+this.type);
	}
	
	

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.displayDetails("Maruti");
		v.displayDetails("Hundai",2019);
		v.displayDetails("Tata",2021,"Auto");
	}
	}


