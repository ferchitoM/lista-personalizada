package com.example.lista_personalizada;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MaterialReciclable {

    String recurso; //carton, vidrio, metal, de acuerdo al nombre del recurso en el paquete recursos
    String nombre; //Nombre que se va a mostrar en el layout
    enum enumMaterial {CARTON, VIDRIO, METAL, PAPEL};

    public MaterialReciclable(enumMaterial material) {

        switch(material){
            case CARTON:
                this.recurso = "carton_icon";
                this.nombre = "Cartón";
                break;
            case VIDRIO:
                this.recurso = "vidrio_icon";
                this.nombre = "Vidrio";
                break;

            case METAL:
                this.recurso = "metal_icon";
                this.nombre = "Metal";
                break;

            case PAPEL:
                this.recurso = "papel_icon";
                this.nombre = "Papel";
                break;

            default:
                this.recurso = "";
                this.nombre = "";
        }

        Log.d("item", this.recurso + ", " + this.nombre);


    }
}
