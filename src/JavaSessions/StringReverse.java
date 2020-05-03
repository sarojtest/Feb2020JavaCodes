package JavaSessions;

public class StringReverse {

	// WAP to reverse a String:
	public static String reverseString(String str) {
		int len = str.length();
		if(len==1) return str;
		if(len==0) return "-1";
		
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i); // T
		}

		return rev;

	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("test"));
		System.out.println(reverseString("1234"));
		System.out.println(reverseString("  "));
		System.out.println(reverseString("T"));
		System.out.println(reverseString("TTT"));
		
		System.out.println(reverseString(""));//-1




	}

}
