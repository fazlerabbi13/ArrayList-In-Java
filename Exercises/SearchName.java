
import java.util.ArrayList;


public class SearchName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("ali");
        students.add("saif");
        students.add("khan");
        students.add("mahi");
        students.add("riyad");

        if(students.contains("mahi")){
            System.out.println("mahi is present");
        }else{
            System.out.println("mahi is not present");
        }

    }
}
