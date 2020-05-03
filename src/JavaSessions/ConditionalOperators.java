package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 30;
		int b = 30;
		
		if(b>=a){
			System.out.println("b is greater than or equal to a");
		}
		else{
			System.out.println("a is greater than b");
		}
		
		// < > <= >= == !=
		
		int total = 100;
		int tax = 50;
		int finalAmount = total+tax; //150
		
		int pendingAmount = 160;
		
		if(finalAmount == pendingAmount){
			System.out.println("bill is paid");
		}
		else{
			System.out.println("please pay the pending amount....");
		}
		
		//String comparison:
		String s1 = "This is Java";
		String s2 = "This is java";
		
		if(s1.equals(s2)){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("both are equal");
		}
		else{
			System.out.println("both are not equal");
		}
		
		//cross browser with selenium:
		//if - else if
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("launch chrome");
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			System.out.println("launch Firefox");
		}
		
		else if(browser.equalsIgnoreCase("IE")){
			System.out.println("launch IE");
		}
		
		else{
			System.out.println("Plz pass the correct browser name" + browser);
		}
		
		
		//marks
		String studentName = "Bibek";
		int marks = -1;
		
		if(studentName.equals("Nadia")){
			 marks = 100;
			System.out.println(studentName + " --- "+ marks);
		}
		
		else if(studentName.equals("Ramesh")){
			 marks = 90;
			System.out.println(studentName + " --- "+ marks);
		}
		
		else if(studentName.equals("Bibek")){
			 marks = 50;
			System.out.println(studentName + " --- "+ marks);
		}
		
		else{
			System.out.println("This student is not available "+ studentName + " ---  " + marks);
		}
		
		
		//if - if - if
		int amount = 200;
		if(amount >= 100){
			if(amount <=150){
				System.out.println("Bill is paid");
			}
			else{
				System.out.println("bill is overpaid with tip");
			}
		}
		else{
			System.out.println("Bill is not paid");
		}
		
		//WAP to print the highest number among three numbers
		int x = 500;
		int y = 700;
		int z = 300;
		
		if(x>y && x>z){ //false && true = false
			System.out.println("x is the highest");
		}
		else if(y>z){ //true
			System.out.println("y is the highest");
		}
		else{
			System.out.println("z is the highest");
		}
		
		
		
	}

}
