
package com.mycompany.sistemaufpso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andre
 */
public class Nodo {
    
    // Constructor que inicializa los atributos
    public Nodo(String documento, String nombre, String fechaNacimiento, String sexo, String pelicula) {
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.película = pelicula;
        this.siguiente = null; // Al crear el nodo, el siguiente es nulo porque no está conectado aún
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the película
     */
    public String getPelícula() {
        return película;
    }

    /**
     * @param película the película to set
     */
    public void setPelícula(String película) {
        this.película = película;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    //usamos un metodo para calcular la edad, ya que no la tenemos como atributo 
    public int calcularEdad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");  //DateTimeFormatter es una clase en java que me permite tener un formato para fechas en especifico
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formato); //localDate es otra clase de java para definir una fecha. Lo que se hace es tomar la cadena de texto, que es nuestro atributo fechaNacimiento y la convierte en un objeto de la clase localDate
        LocalDate hoy = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(fechaNac, hoy); //clase para calcular la cantidad de años, retorno un int que sería la edad que tiene esa persona en la actualidad 
    }
    
    private String documento; 
    private String nombre; 
    private String fechaNacimiento; 
    private String sexo;
    private String película;
    private Nodo siguiente; 
    
    
}
