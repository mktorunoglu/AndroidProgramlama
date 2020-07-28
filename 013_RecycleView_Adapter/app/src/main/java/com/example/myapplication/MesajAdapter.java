package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MesajAdapter extends RecyclerView.Adapter<MesajAdapter.tanimla> {
    Context context;
    List<MesajModel> list;

    public MesajAdapter(Context context, List<MesajModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mesaj_layout, parent, false);
        return new tanimla(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tanimla holder, int position) {
        holder.mesaj.setText(list.get(position).getMesaj());
        holder.isim.setText(list.get(position).getIsim());
        holder.pp.setImageResource(list.get(position).getResimID());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tanimla extends RecyclerView.ViewHolder{
        ImageView pp;
        TextView isim;
        TextView mesaj;

        public tanimla(View itemView){
            super(itemView);
            pp = (ImageView) itemView.findViewById(R.id.pp);
            isim = (TextView) itemView.findViewById(R.id.isim);
            mesaj = (TextView) itemView.findViewById(R.id.mesaj);
        }
    }
}
