import java.util.ArrayList;

public class TrimToSize {
    public static void main(String[] args) {
      
        // Creating an ArrayList of Strings
        ArrayList<String> n = new ArrayList<>(10);

        // Adding elements to the ArrayList
        n.add("Ram");
        n.add("Shyam");
        n.add("Hari");

        // print the size and 
        // capacity before trimming
        System.out.println("Size before trim: " + n.size());
        System.out.println("Capacity before trim: Excess capacity exists");

        // Trimming to the size 
        // of the ArrayList
        n.trimToSize();

        // Printing the size after trimming
        System.out.println("Size after trim: " + n.size());
    }
}
