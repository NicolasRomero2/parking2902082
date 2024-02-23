package org.ficha2902082.maven.parking.vn.entities;

public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;

    //contructor por defecto

    public Cupo() {
    }

        
    //constructor por parametros

    public Cupo(char letra, Double largo, Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

    

}
