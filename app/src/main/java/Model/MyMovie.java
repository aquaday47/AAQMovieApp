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

    //TODO (I) encode strings below in strings.xml
    public static class ParseDataKeys {

        //Two main fetch paths:
        //TODO (I) move the root of this path into a string resource:
        //BUT leave this here, as reference for movie_JSON_key
        // https://api.themoviedb.org/3/movie/top_rated?api_key=<<api_key>>&language=en-US&page=1

        public static final String movie_JSON_key = "movie";

        //THESE TWO probly belong in a Movies class that Extends Collection<MyMovie>?
        public static final String movie_fetch_by_rating_JSON_key = "top_rated";
        public static final String movie_fetch_by_popularity_JSON_Key = "popular";


        //IS this to get access to just one movie?
        public static final String movie_byId_JSON_key = "movie_id";
        //I assume that whether accessing by Id, or iterating thru list
        //these Data keys by property will be relevant.
        public static final String movie_orig_title_JSON_key = "title";
        public static final String movie_overview_JSON_key = "overview";
        public static final String movie_poster_URL_JSON_key = "poster_path";
        //I  don't know what this popularity represents Fight club was 0.5 ?
        public static final String movie_popularity_JSON_key = "popularity";
        public static final String movie_rating_JSON_key = "vote_average";
        public static final String movie_vote_count_JSON_key = "vote_count";

        //TODO (U) PLANS TO EXPAND features to use the following:
        public static final String movie_release_date_JSON_key = "release_date";
        public static final String movie_runtime_JSON_key = "runtime";
        public static final String movie_tagline_JSON_key = "tagline";
        public static final String budget_JSON_key = "budget";

        //returns an array[obj]
        public static final String genres_JSON_key = "genres";
        //genres array has name field
        //TODO (E) how does the genre storage/retrieval work?
        public static final String genre_by_id_JSON_key = "id";
        public static final String genre_by_name_JSON_Key = "name";
        //returns a boolean
        public static final String movie_video_JSON_key = "video";
        //  vids stuff  (if hasVid){ TODO(U) path -- /movie/{movie_id}/videos}
        public static final String videos_by_movie = "videos";
    }
}
