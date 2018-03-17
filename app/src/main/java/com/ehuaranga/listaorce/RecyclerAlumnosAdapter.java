package com.ehuaranga.listaorce;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
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

        AlumnoUNI alumnoUNI = alumnosUNI.get(position);
        holder.textViewCodigo.setText(alumnoUNI.getCodigo());

        Glide.with(holder.imagenOrce.getContext())
                .load("http://www.orce.uni.edu.pe/fotosuni/0060"+alumnoUNI.getCodigo()+".jpg")
                .into(holder.imagenOrce);

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        String infoAlumnoUNI = "http://www.orce.uni.edu.pe/detaalu.php?id="+alumnoUNI.getCodigo()+"&op=detalu";


        StringRequest request = new StringRequest(Request.Method.GET, infoAlumnoUNI, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // Trabajar el HTML
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //Mostrar algun error
            }
        });
        requestQueue.add(request);
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
