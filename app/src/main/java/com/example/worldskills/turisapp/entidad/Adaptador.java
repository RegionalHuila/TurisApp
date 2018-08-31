package com.example.worldskills.turisapp.entidad;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HotelesViewHolder> {

    Context context;
    List<ListaLugares> lugaresList;
    int modo = 0;

    public Adaptador(Context context, List<ListaLugares> lugaresList, int modo) {
        this.context = context;
        this.lugaresList = lugaresList;
        this.modo = modo;
    }

    @NonNull
    @Override
    public HotelesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HotelesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HotelesViewHolder extends RecyclerView.ViewHolder {
        public HotelesViewHolder(View itemView) {
            super(itemView);
        }
    }
}
