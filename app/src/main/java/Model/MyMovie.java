package Model;

public class MyMovie {

    //Movie details layout contains title, release date, movie poster, vote average, and plot synopsis.
    private int id;
    private String title;
    private int imageUrlResource;

    private String releaseDate;

    public MyMovie(){}

    public MyMovie(String myTitle, int myImageUrl){
        title = myTitle;
        imageUrlResource = myImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUrl() {
        return imageUrlResource;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrlResource = imageUrl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
