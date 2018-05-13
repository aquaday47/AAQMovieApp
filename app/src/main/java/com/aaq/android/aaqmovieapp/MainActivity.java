package com.aaq.android.aaqmovieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

import Adapters.MovieAdapter;
import Model.MyMovie;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyMovie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvMovies = (RecyclerView) findViewById(R.id.rvMovies);

        //rvMovies.setLayoutManager(new GridLayoutManager(this,2));
        //TODO (I) fetch movies via API
        //Test data for movies
        movies = TestHelpers.TestMovies.createTestMovies();


        MovieAdapter movieAdapter = new MovieAdapter(this,  movies);
        if (movieAdapter!= null){
            rvMovies.setAdapter(movieAdapter);
        }
        rvMovies.setLayoutManager(new GridLayoutManager(this,2));
        //rvMovies.setLayoutManager(new LinearLayoutManager(this));
    }
}
