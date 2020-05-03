package ExceptionHandling;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();

		obj.launchBrowser();

	}

	public void launchBrowser() {
		System.out.println("LB");
		checkVerison();
	}

	public void checkVerison() {
		System.out.println("CV");
		try {
			checkPlugin();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void checkPlugin() throws ArithmeticException, NullPointerException, FileNotFoundException {
		System.out.println("CP");

		int i = 9 / 3;
		
		ThrowsKeyword o1 = null;
		o1.checkPlugin();
	}

}
