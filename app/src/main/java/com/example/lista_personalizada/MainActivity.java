package com.example.lista_personalizada;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    EstadisticaAdapter adapter;
    ArrayList<EstadisticaModel> arrayEstadisticas = new ArrayList<EstadisticaModel>();
    MaterialReciclable.enumMaterial material;

//    enum NombreMaterial {
//        CARTON("Cartón", "carton_icon"),
//        PAPEL("Papel", "papel_icon"),
//        VIDRIO("Vidrio", "vidrio_icon"),
//        METAL("Metal", "metal_icon");
//
//        private final String nombre; //Nombre a mostrar
//        private final String recurso; //Nombre del recurso
//
//        NombreMaterial(String nombre, String recurso) {
//            this.nombre = nombre;
//            this.recurso = recurso;
//        }
//
//        public String getNombre() {
//            return this.nombre;
//        }
//
//        public String getRecurso() {
//            return this.recurso;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        llenarLista();

    }

//    private void llenarLista() {
//
//        arrayEstadisticas = new ArrayList<EstadisticaModel>();
//
//        arrayEstadisticas.add(new EstadisticaModel("Enero", NombreMaterial.CARTON.getRecurso(), NombreMaterial.CARTON.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Enero", NombreMaterial.VIDRIO.getRecurso(), NombreMaterial.VIDRIO.getNombre(), 0.5, 2000));
//        arrayEstadisticas.add(new EstadisticaModel("Febrero", NombreMaterial.METAL.getRecurso(), NombreMaterial.METAL.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Marzo", NombreMaterial.PAPEL.getRecurso(), NombreMaterial.PAPEL.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Marzo", NombreMaterial.CARTON.getRecurso(), NombreMaterial.CARTON.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Marzo", NombreMaterial.VIDRIO.getRecurso(), NombreMaterial.VIDRIO.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Abril", NombreMaterial.METAL.getRecurso(), NombreMaterial.METAL.getNombre(), 1.5, 5000));
//        arrayEstadisticas.add(new EstadisticaModel("Mayo", NombreMaterial.PAPEL.getRecurso(), NombreMaterial.PAPEL.getNombre(), 1.5, 5000));
//
//        lista.setAdapter(new EstadisticaAdapter(this, arrayEstadisticas));
//    }

    private void llenarLista() {

        arrayEstadisticas.add(new EstadisticaModel("Enero", material.CARTON, 1.5, 15000));
        arrayEstadisticas.add(new EstadisticaModel("Enero", material.METAL, 0.5, 5000));
        arrayEstadisticas.add(new EstadisticaModel("Enero", material.VIDRIO, 0.5, 5000));
        arrayEstadisticas.add(new EstadisticaModel("Enero", material.PAPEL, 0.5, 5000));
        arrayEstadisticas.add(new EstadisticaModel("Enero", material.METAL, 0.5, 5000));
        arrayEstadisticas.add(new EstadisticaModel("Enero", material.CARTON, 0.5, 5000));


        adapter = new EstadisticaAdapter(this, arrayEstadisticas);
        lista.setAdapter(adapter);

        //Ejemplos de for y forEach
        arrayEstadisticas.forEach(item -> { Log.e("forEach", item.nombre); });

        for(int i=0; i <arrayEstadisticas.size(); i++){
            Log.e("for", arrayEstadisticas.get(i).nombre);
        }

    }
}