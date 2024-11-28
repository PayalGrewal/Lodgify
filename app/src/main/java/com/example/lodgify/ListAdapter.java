package com.example.lodgify;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    private final List<HotelData> itemList;

    public ListAdapter(List<HotelData> itemList) {
        this.itemList = itemList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView na, loc, prc, ra;

        public MyViewHolder(View itemView) {
            super(itemView);
            na = itemView.findViewById(R.id.textView7);
            loc = itemView.findViewById(R.id.textView8);
            ra = itemView.findViewById(R.id.textView11);
            prc = itemView.findViewById(R.id.textView12);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listsample, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HotelData item = itemList.get(position);
        holder.na.setText(item.getName());
        holder.loc.setText(item.getLocation());
        holder.ra.setText(item.getRate());
        holder.prc.setText(item.getPrice());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(),review.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("location",item.getLocation());
            intent.putExtra("ID",item.getId());
            v.getContext().startActivity(intent);
        } );
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

