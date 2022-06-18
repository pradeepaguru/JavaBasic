package Assignment;

abstract class Vehicle {
	abstract void run();

	abstract void stop();

	public void fuel(int a, int b) {
		System.out.println("This is Int method with" + " Speed =" + a + "LongDist=" + b);
	}

	public void fuel(float a, String b) {

		System.out.println("This is Float and String method with " + " Speed=" + a + "LongDist=" + b);
	}

	public void fuel(int a, char b) {

		System.out.println("This is Int and char method with " + " speed=" + a + "LongDist" + b);
	}

	int speed = 100;
	int longDistance = 100;

	Vehicle() {
		System.out.println("Deafult Constructor of Parent Class");
	}

	Vehicle(int speed, int longDistance) {
		System.out.println("Parameterized Constructor of Parent Class");
	}

	void display() {

	}
}

class TwoWheeler extends Vehicle {

	@Override
	void run() {

		// TODO Auto-generated method stub
		System.out.println("Run method from two Wheeler Class");

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop method from two Wheeler Class");
	}

	int speed = 20;
	int longDistance = 50;
	int nos_of_tyre = 2;

	void display() {

		System.out.println("This Variables belongs to TwoWheeler class:" + "Speed =" + this.speed + "LongDistance ="
				+ this.longDistance + "Number of Tyres=" + this.nos_of_tyre);

		System.out.println("This Variables belongs to Vehicle Class:" + "Speed =" + super.speed + "LongDistance ="
				+ super.longDistance);

	}

	TwoWheeler() {
		super();
		System.out.println("Two Wheeler Default Constructor");
	}

}

class ThreeWheeler extends Vehicle {

	@Override
	void run() {

		// TODO Auto-generated method stub
		System.out.println("Run method from three Wheeler Class");

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop method from three Wheeler Class");
	}

	int speed = 50;
	int longDistance = 75;
	int nos_of_tyre = 3;

	void display() {

		System.out.println("This Variables belongs to ThreeWheeler class:" + "Speed =" + this.speed + "LongDistance ="
				+ this.longDistance + "Number of Tyres=" + this.nos_of_tyre);

		System.out.println("This Variables belongs to Vehicle Class:" + "Speed =" + super.speed + "LongDistance ="
				+ super.longDistance);

	}

	ThreeWheeler() {
		super();
		System.out.println("Three Wheeler Default Constructor");
	}

}

class FourWheeler extends Vehicle {

	@Override
	void run() {

		// TODO Auto-generated method stub
		System.out.println("Run method from Four Wheeler Class");

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop method from Four Wheeler Class");
	}

	int speed = 40;
	int longDistance = 100;
	int nos_of_tyre = 4;

	void display() {

		System.out.println("This Variables belongs to FourWheeler class:" + "Speed =" + this.speed + "LongDistance ="
				+ this.longDistance + "Number of Tyres=" + this.nos_of_tyre);

		System.out.println("This Variables belongs to Vehicle Class:" + "Speed =" + super.speed + "LongDistance ="
				+ super.longDistance);

	}

	FourWheeler() {
		super();
		System.out.println("Four Wheeler Default Constructor");
	}

}

class EightWheeler extends Vehicle {

	@Override
	void run() {
		
		// TODO Auto-generated method stub
		System.out.println("Run method from Eight Wheeler Class");

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop method from Eight Wheeler Class");
	}

	int speed = 100;
	int longDistance = 150;
	int nos_of_tyre = 8;

	void display() {

		System.out.println("This Variables belongs to EightWheeler class:" + "Speed =" + this.speed + "LongDistance ="
				+ this.longDistance + "Number of Tyres=" + this.nos_of_tyre);

		System.out.println("This Variables belongs to Vehicle Class:" + "Speed =" + super.speed + "LongDistance ="
				+ super.longDistance);

	}

	EightWheeler() {
		super();
		System.out.println("Eight Wheeler Default Constructor");
	}

}

public class Phase1Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*********************Two Wheeler *************************************");
		Vehicle twowheeler = new TwoWheeler(); // call all the methods using dynamic/runtime polymorphism here
		twowheeler.display();

		// Call the methods of all the child classes.
		twowheeler.run();
		twowheeler.stop();

		// call all the methods of the fuel of Vehicle class
		twowheeler.fuel(50, 100);
		twowheeler.fuel(50, '2');
		twowheeler.fuel(0.22f, "Two Wheeler");

		System.out.println("*********************Three Wheeler *************************************");
		Vehicle threewheeler = new ThreeWheeler(); // call all the methods using dynamic/runtime polymorphism here
		threewheeler.display();

		// Call the methods of all the child classes.
		threewheeler.run();
		threewheeler.stop();

		// call all the methods of the fuel of Vehicle class
		threewheeler.fuel(70, 110);
		threewheeler.fuel(67, '3');
		threewheeler.fuel(0.33f, "Three Wheeler");
		
		System.out.println("*********************Four Wheeler *************************************");
		Vehicle fourwheeler = new FourWheeler(); // call all the methods using dynamic/runtime polymorphism here
		fourwheeler.display();

		// Call the methods of all the child classes.
		fourwheeler.run();
		fourwheeler.stop();

		// call all the methods of the fuel of Vehicle class
		fourwheeler.fuel(70, 110);
		fourwheeler.fuel(67, '3');
		fourwheeler.fuel(0.33f, "Three Wheeler");
		
		System.out.println("*********************Eight Wheeler *************************************");
		Vehicle eightwheeler = new EightWheeler(); // call all the methods using dynamic/runtime polymorphism here
		eightwheeler.display();

		// Call the methods of all the child classes.
		eightwheeler.run();
		eightwheeler.stop();

		// call all the methods of the fuel of Vehicle class
		eightwheeler.fuel(70, 110);
		eightwheeler.fuel(67, '3');
		eightwheeler.fuel(0.33f, "Three Wheeler");
	}

}
