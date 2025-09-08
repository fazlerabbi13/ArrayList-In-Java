import java.util.*;

class Operations {
    public static void main(String args[]){
      
        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // 1. Adding elements to ArrayList at the end
        al.add("Hello");
        al.add("World");

      	System.out.println("Original List : "+al);
      	
      	// Adding Elements at the specific index
        // al.add(1, "Fazle");

      	// System.out.println("After Adding element at index 1 : "+ al);
      	
      	// 2. Removing Element using index
      	// al.remove(0);
      
      	// System.out.println("Element removed from index 0 : "+ al);
      	
      	// Removing Element using the value
      	// al.remove("Hello");
      
      	// System.out.println("Element Hello removed : "+ al);
      	
      	// 3. Updating value at index 0
      	// al.set(0, "Rabbi");
      
        // System.out.println("List after updation of value : "+al);
    }
}