package com.mycompany.cineleonelda;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CineLeonelda {

    private String peliculaCartelera;
    private boolean esParaAdultos;
    private final int capacidadSala = 500;
    private int boletasVendidas = 0;
    private final List<Persona> compradores = new ArrayList<>();
    private Nodo raiz;
    private ArbolBinario arbolCompradores = new ArbolBinario();


    public void iniciarCartelera() {
        peliculaCartelera = JOptionPane.showInputDialog("Ingrese el nombre de la película en cartelera:");

        while (peliculaCartelera == null || peliculaCartelera.trim().isEmpty()) {
            peliculaCartelera = JOptionPane.showInputDialog("El nombre de la película no puede estar vacío. Ingrese nuevamente:");
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "¿La película es solo para adultos?", "Clasificación de la película", JOptionPane.YES_NO_OPTION);
        esParaAdultos = (respuesta == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Película en cartelera: " + peliculaCartelera + "\nSolo para adultos: " + (esParaAdultos ? "Sí" : "No"));
    }

    public void venderBoletas() {

    if (boletasVendidas >= capacidadSala) {
        JOptionPane.showMessageDialog(null, "No hay boletas disponibles para la película: " + peliculaCartelera);
        return;
    }

    JOptionPane.showMessageDialog(null, "Película en cartelera: " + peliculaCartelera + "\n¡Comencemos la venta de boletas!");

    int cantidadStr = validateIntInput(JOptionPane.showInputDialog("Ingrese la cantidad de boletas a comprar (máximo 5):"));
    if (cantidadStr < 1 || cantidadStr > 5) {
        JOptionPane.showMessageDialog(null, "Cantidad inválida. Máximo 5 boletas por persona.");
        return;
    }

    if (boletasVendidas + cantidadStr > capacidadSala) {
        JOptionPane.showMessageDialog(null, "No hay suficientes boletas disponibles.");
        return;
    }

    int boletosVendidosEnEstaTransaccion = 0;

    for (int i = 0; i < cantidadStr; i++) {

        Persona persona = null;
        while (persona == null) { 
            persona = obtenerDatosPersona();

            if (persona == null) {
                JOptionPane.showMessageDialog(null, "Se canceló el ingreso de datos. Proceso terminado.");
                return;
            }

            if (isDocumentoDuplicado(persona)) {
                JOptionPane.showMessageDialog(null, "El documento " + persona.getDocumento() + " ya tiene una compra registrada. Intente con otra persona.");
                persona = null; // reiniciar persona si hay duplicado
            }
        }

        compradores.add(persona);
        arbolCompradores.insertar(persona);
        boletosVendidosEnEstaTransaccion++; 
        
    }

    boletasVendidas += boletosVendidosEnEstaTransaccion;
    JOptionPane.showMessageDialog(null, "Se vendieron " + boletosVendidosEnEstaTransaccion + " boletas exitosamente.");
    
    //compradores.add(persona); // Sigue añadiendo a la lista si es necesario
     // Inserta en el árbol binario

}

    // Método para verificar si el documento ya está registrado
    private boolean isDocumentoDuplicado(Persona persona) {
        for (Persona comprador : compradores) {
            if (comprador.getDocumento() == persona.getDocumento()) {
                return true; // Documento duplicado
            }
        }
        return false;
    }

    private Persona obtenerDatosPersona() {

        String nombre = validateNombreInput();
        if (nombre == null) {
            return null;
        }

        int documento = validateDocumentInput(JOptionPane.showInputDialog("Ingrese el documento de la persona:"));
        if (documento == -1) {
            return null;
        }

        String fechaNacimiento;
        int edad;

        fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/MM/yyyy):");
        if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return null;
        }

        try {
            Persona tempPersona = new Persona(nombre, documento, fechaNacimiento);
            edad = tempPersona.calcularEdad();

            if (edad == -1) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use el formato dd/MM/yyyy.");
                return null;
            } else if (esParaAdultos && edad < 14) {
                JOptionPane.showMessageDialog(null, "No se permite la entrada a menores de 14 años.");
                return null;
            }

            return tempPersona;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error procesando la fecha. Verifique el formato (dd/MM/yyyy).");
            return null;
        }
    }

    public void mostrarBoletasDisponibles() {
        int disponibles = capacidadSala - boletasVendidas;
        JOptionPane.showMessageDialog(null, "Boletas disponibles: " + disponibles);
    }

    public void mostrarCompradores() {
        if (compradores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay compradores registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("Lista de Compradores:\n");

        for (Persona comprador : compradores) {
            sb.append("Nombre: ").append(comprador.getNombre()).append("\n")
                    .append("Documento: ").append(comprador.getDocumento()).append("\n")
                    .append("Fecha de Nacimiento: ").append(comprador.getFechaNacimiento()).append("\n")
                    .append("-------------------------\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero (0) y menor a cinco (5):");
        }
        return Integer.parseInt(str);
    }

    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private String validateNombreInput() {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return null;
            }
            if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$") || nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nombre inválido. Debe contener solo letras y no estar vacío.");
                nombre = null;
            }
        } while (nombre == null);
        return nombre.trim();
    }

    public int validateDocumentInput(String input) {
        while (input == null || !isNumber(input)) {
            input = JOptionPane.showInputDialog("Documento inválido. Ingrese un número válido mayor a cero:");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return -1;
            }
        }
        return Integer.parseInt(input);
    }
    
    public void consultarPorDocumento() {
        int documento = validateDocumentInput(JOptionPane.showInputDialog("Ingrese el documento de la persona para consultar:"));

        if (documento == -1) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return;
        }

        Persona personaEncontrada = null;
        for (Persona comprador : compradores) {
            if (comprador.getDocumento() == documento) {
                personaEncontrada = comprador;
                break;
            }
        }

        if (personaEncontrada != null) {
            JOptionPane.showMessageDialog(null, "La persona con documento " + documento + " compró 1 boleta.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna compra registrada para el documento " + documento + ".");
        }
    }

    
    public void mostrarEnOrden() {
    if (boletasVendidas == 0) {
        JOptionPane.showMessageDialog(null, "No hay personas registradas en el sistema.");
    } else {
        arbolCompradores.mostrarEnOrden();
    }
}
    
    

}
