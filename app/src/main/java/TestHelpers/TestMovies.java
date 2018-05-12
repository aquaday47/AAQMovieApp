package TestHelpers;

import com.aaq.android.aaqmovieapp.R;

import java.util.ArrayList;
import Model.MyMovie;

public class TestMovies {

    public static ArrayList<MyMovie> createTestMovies(){
        ArrayList<MyMovie> testMovies = new ArrayList<MyMovie>();
        testMovies.add(new MyMovie("Blister", R.drawable.ic_launcher_foreground));
        testMovies.add(new MyMovie("Fuzzy", R.drawable.ic_launcher_foreground));
        testMovies.add(new MyMovie("Blizzards, Man's greatest fear", R.drawable.ic_launcher_foreground));

        return testMovies;
    }
}
