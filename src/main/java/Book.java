

public class Book {
    private final String title;
    private final Integer noPages;

    //Constructor
    public Book(String title, Integer noPages) {
        this.title = title;
        this.noPages = noPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNoPages() {
        return noPages;
    }

    public String toString() {
       return "Novel (Title " + getTitle() + ", no.pages " + getNoPages() + ")";

    }

 }






