package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try{
			int i = 9/3;
			System.out.println("ABC");
			int p[] = new int[2];
			p[0]=10;
			p[1]=20;
			p[2]=30;
		}
		catch(ArithmeticException e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
		catch(NullPointerException e){
			
		}
		
		
		
		
		System.out.println("A");
		System.out.println("A");

		
		
		
		
	}

}
