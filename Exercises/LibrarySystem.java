
import java.util.ArrayList;

class Book{
    private String title;
    private String author;
    private int availableCopy;

    public Book(String title,String author, int availableCopy){
        this.title=title;
        this.author=author;
        this.availableCopy=availableCopy;
    }

    public Book() {
    }

    public String getTitle(){
        return title;
    }

    public int getAvailableCopy(){
        return availableCopy;
    }

    public void decreaseCopy(){
        if(availableCopy>0){
            availableCopy--;
        }else{
            System.out.println("no copies available for: " +title);
        }
    }

    public void increaseCopy(){
        availableCopy++;
    }

    public String toString(){
        return title + " by " + author + "(Available:" + availableCopy +")";
    }
}

class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
        System.out.println(b.getTitle() + "add to library.");
    }

    public void borrowBook(String title){
        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                if(b.getAvailableCopy() > 0){
                    b.decreaseCopy();
                    System.out.println("you borrowed book: " + title);
                }else{
                    System.out.println("sorry " + title  + "is not available now");
                }
                return;
            }
        }
        System.out.println("book not found in library: " + title);
    }

    public void returnBook(String title){
        for(Book b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                b.increaseCopy();
                System.out.println("you returned: " + title);
                return;
            }
        }
        System.out.println("Book not found in librar: " + title);
    }

    public void showAvailablebooks(){
        System.out.println("availableBooks");
        for(Book b : books){
            System.out.println(b);
        }
    }

}





public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Java", "James Gosling", 3);
        Book b2 = new Book("Python", "Guido van Rossum", 2);
        Book b3 = new Book("C++", "Bjarne Stroustrup", 1);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.showAvailablebooks();

        library.borrowBook("Java");
        library.borrowBook("C++");
        library.borrowBook("Python");

        library.showAvailablebooks();

        library.returnBook("C++");
        library.showAvailablebooks();
    }
}
