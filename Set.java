// Handling IndexOutOfBoundsException
import java.util.ArrayList;

public class Set {
    public static void main(String[] args) {
        try {
          
            // Create an ArrayList and add elements
            ArrayList<Integer> n = new ArrayList<>();
            n.add(1);
            n.add(2);
            n.add(3);
            n.add(4);
            n.add(5);

            // Print the original ArrayList
            System.out.println("Before operation: " + n);

            // Attempt to replace an element at an invalid index
            n.set(7, 9);
        } catch (IndexOutOfBoundsException e) {
          
            // Handle the exception
            System.out.println("Exception: " + e);
        }
    }
}
