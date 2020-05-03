package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//limitations of array:
		//1. static array: size of array is fixed...
		//2. it can store only similar types of data--
		//to solve these limitations -- we use ArrayList (Dynamic Array)

		//1. int array
		int i[] = new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;
		
		System.out.println(i[1]);
		System.out.println(i[0]+i[1]);
	//	System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println("LI =" + 0);
		//hi = length - 1 ==> 4-1 = 3
		System.out.println(i.length);
		int len = i.length; //4
		int HI = len -1 ;//3
		System.out.println(HI); //3
		
		//to print all values of array: for loop
		for(int k=0; k < i.length; k++){
			System.out.println(i[k]); // 10 20 30 40
		}
		
		int p[] = new int[10];
		p[0]=100;
		p[1]=200;
		p[2]=300;
		p[9]=900;
		System.out.println(p[9]);
		
		
		//2. double array:
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=100;
		System.out.println(d[2]);
		
		//char array:
		char c[] = new char[2];
		System.out.println(c[0]+c[1]);
		
		//boolean array:
		boolean b[] = new boolean[2];
		System.out.println(b[0]);
		
		//String array:
		String str[] = new String[4];
		str[0] = "Java";
		str[1] = "Python";
		str[2] = "Ruby";
		
		System.out.println(str[0]);
		System.out.println(str[3]);//null
		
		for(int z=0; z < str.length; z++){
			System.out.println(str[z]);
		}

		
		//Object Array: 
		Object ob[] = new Object[5];
		ob[0] = "Steve";
		ob[1]= 25;
		ob[2] = 12.33;
		ob[3] = true;
		ob[4] = 'm';
		
		for(int v=0; v < ob.length; v++){
			System.out.println(ob[v]);
		}
		
	}

}
