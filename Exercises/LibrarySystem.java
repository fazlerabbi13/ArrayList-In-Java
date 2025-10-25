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
            System.out.println("no copies available for: " +m);
        }
    }

    public void increaseCopy(){
        availableCopy++;
    }

    public String toString(){
        return title + " by " + author + "(Available:" + availableCopy +")";
    }
}





public class LibrarySystem {
    
}
