public class ArtAlbum extends Book {

    private final String paperQuality;

    //Constructor
    public ArtAlbum(String title, Integer noPages, String paperQuality) {
        super(title, noPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public String toString() {
       return "Art Album (Title " + getTitle() +
               "/ no. pages: " + getNoPages() +
                " / paper quality: " + getPaperQuality() + ")";
    }
}