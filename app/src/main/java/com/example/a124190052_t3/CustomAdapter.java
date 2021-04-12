package com.example.a124190052_t3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class CustomAdapter extends RecyclerView.Adapter {
    ArrayList NamaMenu;
    ArrayList FotoMenu;
    Context context;
    public CustomAdapter(Context context, ArrayList NamaMenu, ArrayList FotoMenu) {
        this.context = context;
        this.NamaMenu = NamaMenu;
        this.FotoMenu = FotoMenu;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.nama.setText(NamaMenu.get(position));
        holder.foto.setImageResource(FotoMenu.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // activity baru saat diklik
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("foto", FotoMenu.get(position));
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return NamaMenu.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nama;
        ImageView foto;
        public MyViewHolder(View itemView) {
            super(itemView);

            nama = (TextView) itemView.findViewById(R.id.nama);
            foto = (ImageView) itemView.findViewById(R.id.foto);
        }
    }
}
