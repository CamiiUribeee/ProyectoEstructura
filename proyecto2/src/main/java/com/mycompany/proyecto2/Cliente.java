
package com.mycompany.proyecto2;


public class Cliente {
   private String documento;
   private String tipoCliente;
   private String nombre;
   private String correo;
   private String telefono;
   private String saldo;

    public Cliente(String documento, String tipoCliente, String nombre, String correo, String telefono, String saldo) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }


   
   
}
