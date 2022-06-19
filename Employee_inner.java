package FromClass;


class Employee1 { // outer class

	int salary = 50000; // outer class variable

	class PermEmployee {

		String code = "PE01";
		float hike = .45f;

		void new_salary() {
			
			System.out.println("The New Salary is" + (salary + (int) (salary * this.hike)));
		}

		void display() {
			System.out.println("The New salary , code and hike of PermEmployee is:" + "New Salary after the Hike ="+(salary + (int) (salary * this.hike)) + " Old Salary ="+salary
					+" Hike="+this.hike + " Code of the EMP "+code);
		}

		// 1st inner class of Employee_inner

	}

	class TempEmployee { // 2nd inner class of Employee_inner

		String code = "TE01";
		float hike = .30f;

		void new_salary() {
			//salary = salary + (int) (salary * this.hike);
			System.out.println("The New Salary is" + (salary + (int) (salary * this.hike)));
		}

		void display() {
			System.out.println("New Salary after the Hike ="+(salary + (int) (salary * this.hike)) + " Old Salary ="+salary
					+" Hike="+this.hike + " Code of the EMP "+code);
		}

	}

	void role() { // Outer class method

		class contractEmployee // inner class from method
		{
			String code = "CE01";
			float hike = .30f;

			void new_salary() {
				System.out.println("The New Salary is" + (salary + (int) (salary * this.hike)));
			}

			void display() {
				System.out.println( "New Salary after the Hike ="+(salary + (int) (salary * this.hike)) + " Old Salary ="+salary
						+" Hike="+this.hike + " Code of the EMP "+this.code);
			}

		}
		contractEmployee CE = new contractEmployee();
		CE.new_salary();
		CE.display();

	}

}

public class Employee_inner {

	public static void main(String[] args) {

		// create object of Outer class CPU
		CPU cpu = new CPU();

		Employee1 emp = new Employee1();

		Employee1.PermEmployee PE = emp.new PermEmployee();

		Employee1.TempEmployee TE = emp.new TempEmployee();

		PE.new_salary();
		PE.display();

		TE.new_salary();
		TE.display();
		emp.role();
	}

}
