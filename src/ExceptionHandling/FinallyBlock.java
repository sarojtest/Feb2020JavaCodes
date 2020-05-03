package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println(div(10, 0));
	}

	public static int div(int a, int b) {
		int d = 0;

		try {
			d = a / b;
			System.out.println("Hii");
			System.out.println("Hello");
			return d;
		} catch (Exception e) {
			System.out.println("some exception is coming....");
			return d;
		}
		
		finally{
			System.out.println("im inside finally block...");
			return -1;
		}

	}

}
