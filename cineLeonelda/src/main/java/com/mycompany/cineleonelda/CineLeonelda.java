package com.mycompany.cineleonelda;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CineLeonelda {

    private String peliculaCartelera;
    private boolean esParaAdultos;
    private final int capacidadSala = 500;
    private int boletasVendidas = 0;
    private final List<Persona> compradores = new ArrayList<>();
    private final ArbolBinario arbolCompradores = new ArbolBinario();

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

        while (boletasVendidas < capacidadSala) {
            Persona persona = obtenerDatosPersona();
            if (persona == null) {
                JOptionPane.showMessageDialog(null, "Se canceló el ingreso de datos. Proceso terminado.");
                return;
            }

            if (isDocumentoDuplicado(persona)) {
                JOptionPane.showMessageDialog(null, "El documento ya tiene una compra registrada. Intente con otra persona.");
                continue;
            }

            int cantidadBoletas = validateIntInput(JOptionPane.showInputDialog("Ingrese la cantidad de boletas que desea comprar (máximo 5):"));
            if (cantidadBoletas < 1 || cantidadBoletas > 5) {
                JOptionPane.showMessageDialog(null, "Cantidad inválida. Máximo 5 boletas por persona.");
                continue;
            }

            if (boletasVendidas + cantidadBoletas > capacidadSala) {
                JOptionPane.showMessageDialog(null, "No hay suficientes boletas disponibles.");
                continue;
            }

            persona.setBoletasCompradas(cantidadBoletas);
            compradores.add(persona);
            arbolCompradores.insertar(persona);
            boletasVendidas += cantidadBoletas;

            JOptionPane.showMessageDialog(null, "¡Compra registrada exitosamente! " + persona.getNombre() + " ha comprado " + cantidadBoletas + " boletas.");

            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea registrar otra compra?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Venta de boletas finalizada. Boletas totales vendidas: " + boletasVendidas);
    }

    // Método para verificar si el documento ya está registrado
    private boolean isDocumentoDuplicado(Persona persona) {
        for (Persona comprador : compradores) {
            if (comprador.getDocumento() == persona.getDocumento()) {
                return true;
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

        } catch (HeadlessException e) {
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

        StringBuilder menores = new StringBuilder("Menores de edad:\n");
        StringBuilder adultos = new StringBuilder("Adultos:\n");
        int cantidadMenores = 0;
        int cantidadAdultos = 0;

        for (Persona comprador : compradores) {
            int edad = comprador.calcularEdad();

            // Separar según la edad
            if (edad < 18) {
                cantidadMenores++;
                menores.append("Nombre: ").append(comprador.getNombre()).append("\n")
                        .append("Documento: ").append(comprador.getDocumento()).append("\n")
                        .append("Edad: ").append(edad).append(" años\n")
                        .append("-------------------------\n");
            } else {
                cantidadAdultos++;
                adultos.append("Nombre: ").append(comprador.getNombre()).append("\n")
                        .append("Documento: ").append(comprador.getDocumento()).append("\n")
                        .append("Edad: ").append(edad).append(" años\n")
                        .append("-------------------------\n");
            }
        }

        if (cantidadMenores == 0) {
            menores.append("No hay menores de edad registrados.\n");
        }
        if (cantidadAdultos == 0) {
            adultos.append("No hay adultos registrados.\n");
        }
        StringBuilder mensajeFinal = new StringBuilder();
        mensajeFinal.append("Total de compradores: ").append(compradores.size()).append("\n")
                .append("Cantidad de menores de edad: ").append(cantidadMenores).append("\n")
                .append("Cantidad de adultos: ").append(cantidadAdultos).append("\n")
                .append("\n").append(menores)
                .append("\n").append(adultos);

        JOptionPane.showMessageDialog(null, mensajeFinal.toString());
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
