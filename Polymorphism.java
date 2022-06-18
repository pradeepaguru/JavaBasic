package FromClass;

class Person {

	public void work() {
		System.out.println("Person is Working");
	}

	public void eat() {
		System.out.println("Person is Eating");
	}

	public void sleep() {
		System.out.println("Person is Sleeping");
	}
}

class Employee extends Person {

	public void work() {
		System.out.println("Employee is Working");
	}

	public void eat() {
		System.out.println("Employee is Eating");
	}

	public void sleep() {
		System.out.println("Employee is Sleeping");
	}
}

class Teacher extends Person{

	public void work() {
		System.out.println("Employee is Working");
	}

	public void eat() {
		System.out.println("Employee is Eating");
	}

	public void sleep() {
		System.out.println("Employee is Sleeping");
	}
}

class Otherrole extends Person{

	public void work() {
		System.out.println("Others are Working");
	}

	public void eat() {
		System.out.println("Others are Eating");
	}

	public void sleep() {
		System.out.println("Others are Sleeping");
	}
}

public class Polymorphism {
	
	public static void main(String[] args) {
		Person E = new Employee();
		E.eat();
		E.work();
		
		Person S = new Employee();
		S.sleep();
		
		Person T = new Teacher();
		T.eat();
		T.sleep();
		T.work();
		
		
		Person R = new Otherrole();
		R.work();
	}
	
	
	

}
