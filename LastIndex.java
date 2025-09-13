// Java program to demonstrate the use of 
// lastIndexOf() method with custom Objects
import java.util.ArrayList;

public class LastIndex {
    String n;
    int a;

    // Constructor to initialize Person object
    public LastIndex(String n, int a) {
        this.n = n;
        this.a = a;
    }

    // Overriding equals() to compare Person 
    // objects based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) 
          return true;
        if (o == null || getClass() != o.getClass()) 
          return false;
        LastIndex p = (LastIndex) o;
        return a == p.a && n.equals(p.n);
    }



    public static void main(String[] args) {
      
        // Creating an ArrayList of Person objects
        ArrayList<LastIndex> p = new ArrayList<>();

        // Adding elements to the ArrayList
        p.add(new LastIndex("Sweta", 24));
        p.add(new LastIndex("Amiya", 27));
        p.add(new LastIndex("Gudly", 23));

        // Using lastIndexOf() to find the 
        // last index of a Person object
        // LastIndex personToFind = new LastIndex("Sweta", 24);
        // int i = p.lastIndexOf(personToFind);

        System.out.println("The last index of Sweta is: " + i);
 }

}