package com.adiputra.cardviewtugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMaha extends RecyclerView.Adapter<AdapterMaha.ViewHolder> {

    private ArrayList<ClubModel> clubModel;

    public AdapterMaha(ArrayList<ClubModel> clubModel) {
        this.clubModel = clubModel;
    }

    @NonNull
    @Override
    public AdapterMaha.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMaha.ViewHolder holder, int position) {
        holder.nama_maha.setText(clubModel.get(position).getMahas());
        holder.logo_maha.setImageResource(clubModel.get(position).getLogo());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nama_maha;
        ImageView logo_maha;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_maha = itemView.findViewById(R.id.nmaha);
            logo_maha = itemView.findViewById(R.id.lmaha);
        }
    }
}
