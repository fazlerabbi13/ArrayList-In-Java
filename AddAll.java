
import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
      
        // Creating an ArrayList and 
        // adding initial elements
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("C++");

        // Creating another ArrayList 
        // with elements to be added
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("C");

        // Adding all elements 
        // from l2 to l1
        l1.addAll(l2);
        System.out.println("" + l1);
    }
}
