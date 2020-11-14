

public class Novel extends Book {
    private final String novelType;

    //Constructor
    public Novel(String title, Integer noPages, String novelType) {
        super(title, noPages);
        this.novelType = novelType;
    }

    public String getNovelType() {
        return novelType;
    }

    public String toString() {
        return "Novel (Title " + getTitle() + "/ no. pages: " + getNoPages() + " / type: " + getNovelType() + ")";

    }

}