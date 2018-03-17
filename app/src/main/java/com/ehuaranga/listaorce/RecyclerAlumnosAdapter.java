package com.ehuaranga.listaorce;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ehuaranga.listaorce.Model.AlumnoUNI;

import java.util.ArrayList;

/**
 * Created by edhuar on 17.03.18.
 */

public class RecyclerAlumnosAdapter extends RecyclerView.Adapter<RecyclerAlumnosAdapter.AlumnoViewHolder> {
    Context context;
    ArrayList<AlumnoUNI> alumnosUNI;


    @Override
    public RecyclerAlumnosAdapter.AlumnoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerAlumnosAdapter.AlumnoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return alumnosUNI.size();
    }

    public class AlumnoViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenOrce;
        TextView textViewNombre;
        TextView textViewFacultad;

        public AlumnoViewHolder(View itemView) {
            super(itemView);
        }
    }
}
