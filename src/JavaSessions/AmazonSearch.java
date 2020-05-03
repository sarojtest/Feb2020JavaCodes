package JavaSessions;

public class AmazonSearch {

	// Method Overloading: within the class
	// same method name
	// different params
	// diff types of params
	// diff sequence of params

	// public void search() {
	// System.out.println("0 param");
	// }
	//
	// public void search(int a) {
	// System.out.println("1 param " + a);
	// }
	//
	// public void search(String test){
	// System.out.println("1 param " + test);
	// }
	//
	// public void search(int a, int b) {
	//
	// }
	//
	// public void search(int c, String d) {
	//
	// }
	//
	// public void search(String d, int c) {
	//
	// }

	// search overloading:
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {
		
	}

	public static void main(String[] args) {
		AmazonSearch as = new AmazonSearch();
		as.search();
		as.search("apple macbook", 1000, "silver");
	}

}
