package JavaSessions;

public class BasicOperators {

	public static void main(String[] args) {

		
		int x = 0/9;
		System.out.println(x);
		
		// 9/0 -- Arithmatic Exception
		
		int p = 100;
		int q = p % 2;
		System.out.println(q);
		
		int num = 10;
		if(num % 2 == 0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
		
		if(num > 0){
			System.out.println("+ve number");
		}
		else if(num <0){
			System.out.println("-ve number");
		}
		else{
			System.out.println("num is 0");
		}
		
		//Ternary Operator: ? :
		int z = 12;
		String s = (z>10) ? "hi" : "bye";
		System.out.println(s);
		
		int n1 = 15;
		int n2 = 10;
		int max;
		max = (n1>n2) ? n1 : n2;
		System.out.println("max number is :" + max);
		
		String browser = "ff";
		
		String s1 = (browser.equals("chrome")) ? "launch chrome" : "launch ff";
		System.out.println(s1);
		
		//dead code:
		boolean flag = false;
		if(false){
			System.out.println("This is true");
		}
		else{
			System.out.println("bye!!!");
		}
		
		boolean flag1 = true;
		if(! flag1){
			System.out.println("this is java");
		}
		else{
			System.out.println("bye!");
		}
		
		String name = "";
		
		if(! name.equals("")){
			System.out.println("name is : " + name);
		}
		else{
			System.out.println("value is blank");
		}
		
		
	}

}
