
package com.mycompany.sistemaufpso;


public class Escenario {
    
    private String nombre;
    private int[] visitantesPorDia; // array que almacena el número de personas que asisten de lunes a sábado 

    //constructor 
    public Escenario(String nombre, int[] visitantesPorDia) {
        this.nombre = nombre;
        this.visitantesPorDia = visitantesPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getVisitantesPorDia() {
        return visitantesPorDia;
    }

    public void setVisitantesPorDia(int[] visitantesPorDia) {
        this.visitantesPorDia = visitantesPorDia;
    }
    
    public int getTotalVisitantes() {
        int total = 0;
        for (int visitantes : visitantesPorDia) {
            total += visitantes;
        }
        return total;
    }
    
}
