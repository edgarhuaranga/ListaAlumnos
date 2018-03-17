package com.ehuaranga.listaorce;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ehuaranga.listaorce.Model.AlumnoUNI;

import java.util.ArrayList;

/**
 * Created by edhuar on 17.03.18.
 */

public class RecyclerAlumnosAdapter extends RecyclerView.Adapter<RecyclerAlumnosAdapter.AlumnoViewHolder> {
    Context context;
    ArrayList<AlumnoUNI> alumnosUNI;

    public RecyclerAlumnosAdapter(ArrayList<AlumnoUNI> alumnosUNI, Context context){
        this.alumnosUNI = alumnosUNI;
        this.context = context;
    }

    @Override
    public RecyclerAlumnosAdapter.AlumnoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_alumno, parent, false);
        return new RecyclerAlumnosAdapter.AlumnoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerAlumnosAdapter.AlumnoViewHolder holder, int position) {

        holder.textViewCodigo.setText(alumnosUNI.get(position).getCodigo());

        Glide.with(holder.imagenOrce.getContext())
                .load("http://www.orce.uni.edu.pe/fotosuni/0060"+alumnosUNI.get(position).getCodigo()+".jpg")
                .into(holder.imagenOrce);
    }

    @Override
    public int getItemCount() {
        return alumnosUNI.size();
    }

    public class AlumnoViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenOrce;
        TextView textViewNombre;
        TextView textViewFacultad;
        TextView textViewCodigo;

        public AlumnoViewHolder(View itemView) {
            super(itemView);
            imagenOrce = itemView.findViewById(R.id.imageview_foto);
            textViewNombre = itemView.findViewById(R.id.textview_nombre);
            textViewFacultad = itemView.findViewById(R.id.textview_facultad);
            textViewCodigo = itemView.findViewById(R.id.textview_codigo);
        }
    }
}
