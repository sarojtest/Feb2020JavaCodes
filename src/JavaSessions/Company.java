package JavaSessions;

import java.util.ArrayList;

public class Company {
	
	String name;
	String ceo;
	String product;
	long revenue;
	int empCount;
	static int holidayCount = 20;
	
	ArrayList<String> branchList;
	
	//constructor of class:
	//name : class Name
	//can not return any value
	//dont write any return type
	//it looks like a function but its not a function
	public Company(){
		System.out.println("default const...");
	}
	
	public Company(int a){
		System.out.println("one param const..." + a);
	}
	
	//create the const with all the class variables:
	public Company(String name, String ceo, String product, long revenue, int empCount) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.empCount = empCount;
	}
	
	public Company(String name, String ceo, String product, long revenue, int empCount, ArrayList<String> branchList) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.empCount = empCount;
		this.branchList = branchList;
	}

	public Company(String name, String ceo, String product) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
	}
	
	public Company(String name, String ceo) {
		this.name = name;
		this.ceo = ceo;
	}

	public static void main(String[] args) {
		
		Company c1 = new Company(10);
		Company c2 = new Company("Google", "Sundar Pichai", "Google Cloud", 10000, 100000);
		System.out.println(Company.holidayCount);
		
		Company c3 = new Company("MS", "Nadella", "MS Azure", 11000, 20000);
		Company c4 = new Company("ABC Comp", "Tom", "Apple", 1000, 2000);
		Company c5 = new Company("XYZ Comp", "Steve", "Samsung");

		System.out.println(c2.name);
		System.out.println(c2.ceo);
		System.out.println(c2.product);
		System.out.println(c2.revenue);
		System.out.println(c2.empCount);
		
		System.out.println(c4.name + " " + c4.ceo);
		
		System.out.println(c5.name + " " + c5.product + " " + c5.empCount);
		
		ArrayList<String> branches = new ArrayList<String>();
		branches.add("CA");
		branches.add("HYD");
		branches.add("London");
		Company comp1 = new Company("Google", "Sundar", "Chrome", 10000, 100000, branches);

		System.out.println(comp1.name + " " + comp1.branchList);
		
	}

}
