
package com.mycompany.proyecto2;


public class Cliente {
   private String documento;
   private String tipoCliente;
   private String nombre;
   private String correo;
   private int telefono;
   private double saldo;

    public Cliente(String documento, String tipoCliente, String nombre, String correo, int telefono, double saldo) {
        this.documento = documento;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
   
}
