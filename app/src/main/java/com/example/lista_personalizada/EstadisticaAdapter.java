package com.example.lista_personalizada;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EstadisticaAdapter extends ArrayAdapter<EstadisticaModel> {

    LayoutInflater inflater;
    Context context;

    public EstadisticaAdapter(Context context, ArrayList<EstadisticaModel> estadisticasList) {
        super(context, 0, estadisticasList);

        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.activity_lista_estadistica_reciclaje, null);
        TextView mes = (TextView) convertView.findViewById(R.id.mes);
        ImageView imagenMaterial = (ImageView) convertView.findViewById(R.id.imagenMaterial);
        TextView material = (TextView) convertView.findViewById(R.id.material);
        TextView peso = (TextView) convertView.findViewById(R.id.peso);
        TextView precio = (TextView) convertView.findViewById(R.id.precio);

        EstadisticaModel item = getItem(position);

        mes.setText(item.mes);
        imagenMaterial.setImageResource(getIdRecurso(item.recurso));
        material.setText(item.nombre);
        peso.setText(item.peso + " Kg");
        precio.setText("$ " + item.precio);

        //Log.d("item", position + ": " + item.recurso);

        return convertView;
    }

    public int getIdRecurso(String nombreMaterial){
        int idRecurso = context.getResources().getIdentifier(nombreMaterial, "mipmap", context.getPackageName());
        return idRecurso;
    }
}
