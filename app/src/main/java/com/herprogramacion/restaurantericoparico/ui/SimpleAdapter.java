package com.herprogramacion.restaurantericoparico.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.herprogramacion.restaurantericoparico.R;
import com.herprogramacion.restaurantericoparico.modelo.Comida;

import java.util.List;



public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>
        implements ItemClickListener {
    private final Context context;
    private final List<Comida> items;


    public static class SimpleViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        // Campos respectivos de un item
        public TextView nombre;
        public TextView precio;
        public ImageView imagen;
        public ItemClickListener listener;

        public SimpleViewHolder(View v, ItemClickListener listener) {
            super(v);

            nombre = (TextView) v.findViewById(R.id.nombre_comida);
            precio = (TextView) v.findViewById(R.id.precio_comida);
            imagen = (ImageView) v.findViewById(R.id.miniatura_comida);
            this.listener = listener;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }

    public SimpleAdapter(Context context, List<Comida> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_lista_inicio, viewGroup, false);
        return new SimpleViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder viewHolder, int i) {
        Comida currentItem = items.get(i);
        Glide.with(viewHolder.itemView.getContext())
                .load(items.get(i).getIdDrawable())
                .centerCrop()
                .into(viewHolder.imagen);
        viewHolder.precio.setText("$55");
        viewHolder.nombre.setText(items.get(i).getNombre());



    }

    /**
     * Sobrescritura del método de la interfaz {@link ItemClickListener}
     *
     * @param view     item actual
     * @param position posición del item actual
     */
    @Override
    public void onItemClick(View view, int position) {
        DetailActivity.createInstance(
                (Activity) context, items.get(position))
        ;

    }

}

interface ItemClickListener {
    void onItemClick(View view, int position);
}