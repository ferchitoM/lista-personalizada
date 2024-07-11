package com.example.lista_personalizada;

public class EstadisticaModel extends MaterialReciclable{
    String mes;
    double peso;
    int precio;

    public EstadisticaModel(String mes, enumMaterial material, double peso, int precio) {
        super(material);
        this.mes = mes;
        this.peso = peso;
        this.precio = precio;
    }
}
