package FromClass;


	class Product
	{
	    int id = 70;
	    String name = "Amul";
	    public void display()
	    {
	        System.out.println("name and ID"+this.id+" "+this.name);
	    }
	}
	class A extends Product
	{
	    int count = 50;
	    String category="butter";
	    public void diplay()
	    {
	        super.display();
	        System.out.println("Count and Category"+this.count+" "+this.category);
	    }
	}
	class B extends Product
	{
	    int count = 50;
	    String category="butter";
	    public void display()
	    {
	        super.display();
	        System.out.println("Count and Category"+this.count+" "+this.category);
	    }    
	}
	class C extends Product
	{
	    int count = 50;
	    String category="butter";
	    public void display()
	    {
	        super.display();
	        System.out.println("Count and Category"+this.count+" "+this.category);
	    }    
	}
	class SubA extends A
	{
	    int price = 30;
	    
	    public void display()
	    
	    {
	    	 super.display();
	        int totalprice = this.price*super.count;
	        System.out.println("Total Price"+totalprice);
	        System.out.println("ID"+super.id+"name"+super.name);
	    }    
	}
	
	class SubB extends B
	{
	    int price = 10;
	    
	    public void display()
	    
	    {
	    	 super.display();
	        int totalprice = this.price*super.count;
	        System.out.println("Total Price"+totalprice);
	        System.out.println("ID"+super.id+"name"+super.name);
	    }    
	}
	
	
	public class Inheritance {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

     SubA a = new SubA();
     a.display();
     SubB b = new SubB();
     b.display();
		
			
		}

	

	
}
