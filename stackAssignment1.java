package Assignment;

import java.util.Stack;

public class stackAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack1 = new Stack();
		
		stack1.push("Apple");
		stack1.push("Grapes");
		stack1.push("Mango");
		stack1.push("Orange");
		stack1.push("Papaya");
		
		stack1.push("Delhi");
		stack1.push("Chennai");
		stack1.push("Hyderabad");
		stack1.push("Mumabi");
		
		stack1.push(4);
		stack1.push(5);
		stack1.push(100);
		stack1.push(45);
		
		stack1.push("W");
		stack1.push("M");
		
		System.out.println("Print the Stack elements before operations:" + stack1);
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		
		stack1.peek();
		stack1.peek();
		
		stack1.remove(3);
		stack1.remove(4);
		
	
		System.out.println("The top of the stack" + stack1.peek());
		System.out.println("The index of Apple and Delhi" + stack1.indexOf("Apple")+" and " + stack1.indexOf("Delhi"));

}
}