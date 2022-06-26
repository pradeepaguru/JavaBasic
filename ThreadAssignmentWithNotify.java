package Thread;

class Customer1{  
int amount=10000;  
  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw the Amount from the Account...");  
	  
		if(this.amount<amount)
		{  
		System.out.println("Insufficient balance waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("completed Amount credited...the Remaining amount is"+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("going to deposit the Amount in the Account...");  
		this.amount+=amount;  
		
		System.out.println("Amount deposit completed... " + this.amount);  
		notify();  //unlocking of thread
	}  
}  
  
public class ThreadAssignmentWithNotify{  
	public static void main(String args[]){  
		Customer c=new Customer();  
		
		new Thread(){                 
		  public void run()
		  {
			c.withdraw(5000);
		  }  
		}.start();  
		new Thread(){                 
			  public void run()
			  {
				c.withdraw(4000);
			  }  
			}.start(); 
		
		
		new Thread(){  
			  public void run()
			   {
				 c.deposit(20000);
			   }  
			}.start(); 
			
			new Thread(){  
				  public void run()
				   {
					 c.withdraw(10000);
				   }  
				}.start(); 
	}}
