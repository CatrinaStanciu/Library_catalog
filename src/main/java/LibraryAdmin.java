
import java.util.*;

public class LibraryAdmin {


    public static void main(String[] args) {

        List <Book> bookList = new ArrayList<>();

        bookList.add(new ArtAlbum("'Famous paintings'", 150,"glossy"));
        bookList.add(new Novel("'Harry Potter'", 456, "Fantasy"));
        bookList.add(new Novel("'Jane Eyre'", 356, "Romance"));
        bookList.add(new ArtAlbum("'Rembrandt'",50, "matt"));

        System.out.println("------------------");
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("Books' number: " + bookList.size());

        System.out.println("------------------");

        bookList.removeIf (book -> (book.getTitle() == "'Famous paintings'"));

        for (Book book : bookList) {
            System.out.println(book);
            }
        System.out.println("Books' number: " + bookList.size());

        System.out.println();
    }
}
