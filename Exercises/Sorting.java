
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("sylhet");
        cities.add("dhaka");
        cities.add("Rajshahi");
        cities.add("rangpur");

        Collections.sort(cities);

        System.out.println(cities);
    }
}
