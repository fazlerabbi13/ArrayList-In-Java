package Exercises;

import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Math");
        books.add("physics");
        books.add("biology");
        books.add("chemistry");

        int index = books.indexOf("Math");
        if(index != -1){
            books.set(index, "English");
        }

        System.out.println(books);
    }
}
