
import java.util.ArrayList;

public class AverageMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(85);
        marks.add(65);
        marks.add(72);
        marks.add(70);

        int sum = 0;

        for(int mark:marks){
            sum +=mark;
        }
        double average = (double)sum / marks.size();

        System.out.println(average);
    }
}
