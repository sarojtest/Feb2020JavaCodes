package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10:
		//1. while:
		int i = 1;//initilization
		while(i<=10){//conditional
			System.out.println(i); //1 2 3 .... 10
			i++; //incremental/decremental
		}
		
		//10 to 1:
		
//		int j = 10;
//		while(j>1){
//			System.out.println(j);//10 11
//			j++;
//		}
		
//		while(true){
//			System.out.println("Bye!!");
//		}
		System.out.println("-----");
		//2. for loop: 1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k); //1 2 3 4 5 6 7 8 9 10
		}
		
//		for(; ;){
//			System.out.println("Hey!!");
//		}
		System.out.println("--even numbers---");

		//even numbers b/w 1 to 10: 2 4 6 8 10
		for(int e=2; e<=10; e=e+2){
			System.out.println(e);//2 4 6 8 10
		}
		
		System.out.println("--odd numbers---");
		//odd numbers b/w 1 to 10 : 1 3 5 7 9
		for(int odd = 1; odd<=10; odd=odd+2){
			System.out.println(odd); //1 3 5 7 9
		}
		
		System.out.println("--for if---");

		//for with if:
		for(int m=1; m<=10; m++){
			if(m % 2 == 0){
				System.out.println(m); //2 4 6
			}
		}
		
		System.out.println("--for if - 2nd ex---");

		for(int d=1; d<=100; d++){
			System.out.println(d);
			if(d % 5 ==0){
				System.out.println("hey this divisble by 5");
				break;
			}
		}
		
		
		
		
		
		System.out.println("-----");

		//do-while: 10 to 1
		int p = 10;
		do{
			System.out.println(p);//10 9 8
			p--;
		}
		while(p>=1);
		
	}

}
