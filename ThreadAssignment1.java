package Thread;

public class ThreadAssignment1 extends Thread {
	 public void run(){  
		  for(int i=1;i<=3;i++){  
		    try{
		    		Thread.sleep(4000);  // 4 sec
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getState()+ "   State of this Thread  : Running"+ i);  
		    System.out.println(Thread.currentThread().getName()+ "   Name of this Thread  :  "+ i); 
			System.out.println("Check the thread is alive or not? :  "+ Thread.currentThread().getName()+ "---" + Thread.currentThread().isAlive());  
			System.out.println("Check the thread is Daemon or not? :  "+ Thread.currentThread().getName()+ " ---" + Thread.currentThread().isDaemon()); 
			System.out.println("Print the Thread Priority :  "+ Thread.currentThread().getPriority()+ " ---" +Thread.currentThread()); 
		   
		  }  
		 }  
		 
		 public static void main(String args[]){  
		  ThreadAssignment1 t1=new ThreadAssignment1();  
		  t1.setName("Thread1");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  ThreadAssignment1 t2=new ThreadAssignment1();  
		  t2.setName("Thread2");
		  t2.setPriority(NORM_PRIORITY); 
		  
		  ThreadAssignment1 t3=new ThreadAssignment1(); 
		  t2.setPriority(NORM_PRIORITY);
		  
		  t3.setDaemon(true); 
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		 
		 
		 }  
		}  


