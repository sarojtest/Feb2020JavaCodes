package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {

		// ++ and --
		
		int x = 1;
		int y = x++; //post increment
		
		System.out.println(x);//2
		System.out.println(y);//1
		
		int p = -1;
		int q = p++; //post increment
		System.out.println(p);//0
		System.out.println(q);//-1
		
		//pre increment:
		int a = 1;
		int b = ++a; //pre increment
		System.out.println(a);//2
		System.out.println(b);//2
		
		int h = -1;
		int g = ++h;
		System.out.println(h);//0
		System.out.println(g);//0
		
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int k = -3;
		int l = --k; //pre decrement
		System.out.println(k);//-4
		System.out.println(l);//-4
	}

}
