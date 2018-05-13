package Adapters;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.aaq.android.aaqmovieapp.R;
import java.util.ArrayList;
import java.util.LinkedList;

import Model.MyMovie;

public class MovieAdapter extends  android.support.v7.widget.RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private Context mContext;
    private ArrayList<MyMovie> mMovies = new ArrayList<MyMovie>();
    private LayoutInflater mInflater;
    private AdapterView.OnItemClickListener mOnClickListener;

    public MovieAdapter(Context context, ArrayList<MyMovie> movies){
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mMovies = movies;

    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View movieView = mInflater.inflate(R.layout.movies_rv_item, parent, false);

        MovieViewHolder movieViewHolder = new MovieViewHolder(movieView);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        MyMovie movie = mMovies.get(position);

        TextView title_tv = holder.title_tv;
        title_tv.setText(movie.getTitle());

        ImageView poster_iv = holder.poster_iv;
        //TODO(T) temporarily this is set to an int -- not sure how I will want to store it
        //or how picasso handles converting it to a system resource

        //TODO (R) figure out how the image is actually attained
        poster_iv.setImageResource(movie.getImageUrl());
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{


        public TextView title_tv;
        public ImageView poster_iv;

        public MovieViewHolder(View itemView) {
            super(itemView);

            title_tv = (TextView) itemView.findViewById(R.id.movie_name);
            poster_iv = (ImageView) itemView.findViewById(R.id.iv_movie_poster);
           //itemView.setOnClickListener(this);
        }
    }
}
