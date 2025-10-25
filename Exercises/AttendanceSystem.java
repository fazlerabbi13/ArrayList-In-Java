import java.util.ArrayList;

public class AttendanceSystem {
    
    public static void main(String[] args) {
        ArrayList<String> attendance = new ArrayList<>();

        attendance.add("mohammad");
        attendance.add("ali");
        attendance.add("khan");

        if(!attendance.contains("sabbir")){
            attendance.add("sabbir");
        }

        System.out.println(attendance);
    }

}
