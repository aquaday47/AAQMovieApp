package Adapters;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.aaq.android.aaqmovieapp.R;
import java.util.ArrayList;
import java.util.LinkedList;

import Model.MyMovie;

public class MovieAdapter extends  android.support.v7.widget.RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    Context mContext;
    ArrayList<MyMovie> mMovies = new ArrayList<MyMovie>();

    public MovieAdapter(ArrayList<MyMovie> movies){
        //mContext = context;
        mMovies = movies;

    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movieView = inflater.inflate(R.layout.movies_rv_item, parent, false);

        MovieViewHolder movieViewHolder = new MovieViewHolder(movieView);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        MyMovie movie = mMovies.get(position);

        TextView title_tv = holder.title_tv;
        title_tv.setText(movie.getTitle());

        ImageView poster_iv = holder.poster_iv;
        //TODO (R) figure out how the image is actually attained
        //poster_iv.setImageResource(movie.getImageUrl());
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        TextView title_tv;
        ImageView poster_iv;

        public MovieViewHolder(View itemView) {
            super(itemView);
        }
    }
}
