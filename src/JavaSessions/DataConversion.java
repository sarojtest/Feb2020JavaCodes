package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int:
		String x = "100";
		System.out.println(x+20);
		
		//120
		
		//wrapper classes:
		int i = Integer.parseInt(x); //100
		System.out.println(i+20);
		
		String total = "1000A";
		System.out.println(total+50);
		
//		int totalVal = Integer.parseInt(total);//NumberFormatException: For input string: "1000A"
//		System.out.println(totalVal + 50);
		
		//String to double:
		String y = "122.44";
		System.out.println(y+20); 
		double d = Double.parseDouble(y) + 20;
		System.out.println(d);
		
		
		//int to String:
		int p = 200;
		System.out.println(p+20);
		String str = String.valueOf(p); //"200"
		System.out.println(str+20);
		
		String test = String.valueOf(true) + " hello";
		System.out.println(test);
		
	}

}
