package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lmp = new LinkedHashMap<Integer, String>();
	        
	        lmp.put(1, new String("Apple"));
	        lmp.put(2, new String("Banana"));
	        lmp.put(3, new String("Cantaloop"));
	        lmp.put(4, new String("DrangonFruit"));
	        lmp.put(5, new String("Mango"));
	        lmp.put(6, new String("Orange"));
	        lmp.put(7, new String("Strawberry"));
	        lmp.put(8, new String("Blueberry"));
	        lmp.put(9, new String("Guava"));
	        lmp.put(10, new String("Grapes"));
	        
	
	

    System.out.println("Name of the Fruits in the LinkedHashMap : " + lmp);
    
    
    for (Integer key :lmp.keySet()) {
        System.out.println("Keys of the Linked Hash Map" + ":" + lmp.get(key));
    }
    
    
    System.out.println("LinkedHashMap Hashcode : " + lmp.hashCode());
    System.out.println("\n Linked Hash Map contains 4 as key? : " + lmp.containsKey(4));
    System.out.println("Linked Hash Map contains Apple and Banana in the list : " + lmp.containsValue("Banana") + lmp.containsValue("Apple"));
    lmp.remove(7);
    System.out.println("Remove the 7th index : " + lmp);
    lmp.remove(4, "DrangonFruit");
    System.out.println("Linked Hash Map contains 4 as key? : " + lmp.containsKey(4));
   
    lmp.clear();
    System.out.println("Content of Linked Hash Map after all operations: " + lmp);

}

}