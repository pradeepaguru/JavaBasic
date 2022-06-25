package Thread;
	
class Factorial extends Thread {	
   int value1;

	 Factorial(int num){  
		this.value1=num;  
	}

	synchronized  void Fact(int num) {
		int fact =1;
		 for(int i=1;i<=num;i++){  
		      fact= fact *i;  
		     
		     }  
		 System.out.println("Factorial of the number is" + fact);
	}
	 
	public void run() {
		Fact(this.value1);
	}
}
class Addition extends Thread{
	int value1;
	int value2;
	
	 Addition(int a, int b){
		this.value1=a;
		this.value2=b;
	}
	
	 synchronized void Add(int num1, int num2) {
		 try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  int sum = num1 + num2;
	      System.out.println("Sum of the numbers is =" + sum); 
	}
	 public void run() {
			Add(this.value1,value2);
		}
}
public class ThreadAssignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial t1 = new Factorial(4);
		Factorial t2 = new Factorial(6);
		Addition t3 = new Addition(4,5);
		Addition t4 = new Addition(10,20);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
