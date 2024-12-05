package com.mycompany.cineleonelda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Persona {

    private String nombre;
    private int documento;
    private String fechaNacimiento;

    public Persona(String nombre, int documento, String fechaNacimiento) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
    if (fechaNacimiento == null || fechaNacimiento.isEmpty()) {
        System.out.println("La fecha de nacimiento es nula o vacía.");
        return -1; // Error si la fecha no está presente
    }

    try {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formato); // Intentar convertir la fecha
        LocalDate hoy = LocalDate.now(); // Obtener la fecha actual
        return (int) ChronoUnit.YEARS.between(fechaNac, hoy); // Calcular la edad en años
    } catch (DateTimeParseException e) {
        System.out.println("Error al parsear la fecha de nacimiento: " + fechaNacimiento);
        return -1; // Retornar -1 si hay un error en el formato
    }
}


}
