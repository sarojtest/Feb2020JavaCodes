package JavaSessions;

public class StaticMethodOverloading {

	public static void getName() {

	}

	public static void getName(int a) {

	}

	public static void main(String a[]) {
		System.out.println("main method");
		StaticMethodOverloading.main(10);
		
		StaticMethodOverloading.main(10, 20);
	}

	public static void main(int a) {
		System.out.println("main method " + a);
	}

	public static void main(int a, int b) {
		System.out.println("main method " + a + b);

	}

}
