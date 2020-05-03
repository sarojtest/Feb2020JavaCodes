package OOPInheritance;

public class TestCar {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
	
		
		//Top/Up Casting
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();
		
		//reference type check
		
		//down casting:
		//BMW b1 = (BMW) new Car();
		
		//ClassCastException: OOPInheritance.Car cannot be cast to OOPInheritance.BMW
		
		//Car c2 = (Car) new Vehicle();
		//BMW b2 = (BMW) new Vehicle();

		
	}

}
