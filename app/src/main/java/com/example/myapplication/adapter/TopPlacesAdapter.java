package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.chaotha.DetailsActivity;
import com.example.myapplication.model.TopPlacesData;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopplacesViewHolder> {

    Context context;
    List<TopPlacesData> topPlacesDataList;

    public TopPlacesAdapter(Context context, List<TopPlacesData> topPlacesDataList) {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }

    @NonNull
    @Override
    public TopplacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item, parent, false);



        return new TopplacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopplacesViewHolder holder, int position) {

        holder.countryName.setText(topPlacesDataList.get(position).getCountryName());
        holder.plaeName.setText(topPlacesDataList.get(position).getPlaceName());
        holder.price.setText(topPlacesDataList.get(position).getPrice());
        holder.placeImage.setImageResource(topPlacesDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(context, DetailsActivity.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }


    public static final class TopplacesViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView plaeName, countryName, price;



        public TopplacesViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            plaeName= itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);

        }
    }




}
