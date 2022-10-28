package com.example.advance_android_project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advance_android_project.R;
import com.example.advance_android_project.modle.Place;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>{

    Context context;
    private ArrayList<Place> mPlaceList;
    public PlaceAdapter(Context context, ArrayList<Place> mPlaceList) {
        this.context = context;
        this.mPlaceList = mPlaceList;
    }


    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = mPlaceList.get(position);
        holder.img_place.setImageResource(place.getImgPlace());
        holder.tv_nameplace.setText(place.getNamePlace());
        holder.tv_namecountry.setText(place.getCountry());
        holder.tv_rating.setText(place.getRating());
    }

    @Override
    public int getItemCount() {
        return mPlaceList.size();
    }

    public static class PlaceViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_nameplace, tv_namecountry, tv_rating;
        private ImageView img_place;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nameplace = itemView.findViewById(R.id.tv_nameplace);
            tv_namecountry = itemView.findViewById(R.id.tv_namecountry);
            img_place = itemView.findViewById(R.id.tv_rating);
            tv_rating = itemView.findViewById(R.id.tv_rating);
        }
    }
}
