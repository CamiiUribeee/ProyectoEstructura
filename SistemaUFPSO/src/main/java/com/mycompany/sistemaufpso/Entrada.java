
package com.mycompany.sistemaufpso;


public class Entrada {
    String nombrePelicula;
    int cantVendidas;
    
    public Entrada(String nombrePelicula) {
        this.nombrePelicula=nombrePelicula;
        this.cantVendidas = 0;  // cero porque aun no se han vendido entradas
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getCantVendidas() {
        return cantVendidas;
    }

    public void setCantVendidas(int cantVendidas) {
        this.cantVendidas = cantVendidas;
    }
    
    //PARA VENDER LA ENTRADA A LA PELICULA:
    public void venderEntrada() {
        cantVendidas++;
    }
}
