package com.example.worldskills.turisapp.entidad;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.worldskills.turisapp.R;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HotelesViewHolder>{

    Context context;
    List<ListaLugares> lugaresList;
    int modo = 0;
    View v;


    //constructor para el recycler
    public Adaptador(Context context, List<ListaLugares> lugaresList, int modo) {
        this.context = context;
        this.lugaresList = lugaresList;
        this.modo = modo;
    }

    @NonNull
    @Override

    //desiciones para el el cambio de gridlayout
    public HotelesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//iniciaba la vista en modo lista
        if (modo==1){

            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uno, parent, false);
//iniciaba la vista en modo de dos columnas
        }else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dos, parent, false);

        }

        HotelesViewHolder hotelesViewHolder = new HotelesViewHolder(v);
       return hotelesViewHolder;

    }


    //metodo donde iba el json
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
