package JavaSessions;

public class DataTypes {
	
	//this is my first java code
	/**
	 * this is data types concept
	 * we are going to cover data types in java
	 * 
	 */

	public static void main(String[] args) {

		//data types:
		//1. primitive data types: 
			//a. boolean : true / false
			//b. Numeric Type: IntegerFamily: 
					//Integer:  byte short int long
					//Floating: float double
		
		//2. Non Primitive Data Types: String Array 
		
		//1. byte:
		//size: 8 bits = 1 byte
		//Range: -128 to 127
		byte b = 10;
		 b = 20;
		byte b1 = 0;
		byte b2 = -1;
		
		System.out.println(b);
		System.out.println(b2+b);
		System.out.println(2+2);
		
		//2. short:
		//size: 16 bits = 2 bytes
		//Range: -32768 to 32767
		short sh = 100;
		short sh1 = -90;
		System.out.println(sh+sh1);
		
		//3. int:
		//size: 32 bits = 4 bytes
		//Range: -2147483648 to 2147483647
		int i = 1000;
		int k = -900;
		int l = 0;
		System.out.println((i+k)*l);
		
		//4. long: 
		//size: 64 bits = 8 bytes
		long l1 = 100000000;
		
		//5. float:
		//size: 32 bits = 4 bytes
		//Range: upto 7 decimal digits
		float f1 = 12.33f;
		float f2 = (float)34.44;
		float f3 = 100; //100.00
		
		System.out.println(f3);
		
		//6. double:
		//Range: upto 16 decimal digits
		//size: 64 bits = 8 bytes
		double d1 = 12.333;
		
		System.out.println(f1+i);
		
		//boolean: true or false
		//size: ~1 bit
		boolean flag1 = true;
		boolean flag2 = false;
		
		//char:
		//size: 16 bits = 2 bytes
		char c1 = 'a'; //97
		char c11 = 'b'; //98
		char c2 = '5';
		char c3 = '$';
		//a-z ==> 97 to 122
		//A-Z ==> 65 to 90
		//0-9 ==> 48 to 57
		
		System.out.println(c1+c11); // 97+98 = 195
		
		//String:
		String str = "hello world";
		System.out.println(str);
		
		String st1 = "1000";
		System.out.println(st1+20);
		
		String str2 = "hey this is my first java code";
		System.out.println(str2 + " " + str);
		
		
	}

}
