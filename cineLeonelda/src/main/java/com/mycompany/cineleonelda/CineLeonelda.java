package com.mycompany.cineleonelda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CineLeonelda {

    private String peliculaCartelera;
    private boolean esParaAdultos;
    private final int capacidadSala = 500;
    private int boletasVendidas = 0;
    private List<Persona> compradores = new ArrayList<>();
    private Nodo raiz;

    public void venderBoletas() {
        if (boletasVendidas >= capacidadSala) {
            JOptionPane.showMessageDialog(null, "No hay boletas disponibles.");
            return;
        }

        int cantidadStr = validateIntInput(JOptionPane.showInputDialog("Ingrese la cantidad de boletas a comprar (máximo 5):"));

        if (cantidadStr < 1 || cantidadStr > 5) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida. Máximo 5 boletas por persona.");
            return;
        }

        if (boletasVendidas + cantidadStr > capacidadSala) {
            JOptionPane.showMessageDialog(null, "No hay suficientes boletas disponibles.");
            return;
        }

        for (int i = 0; i < cantidadStr; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
            int documento = validateIntInput(JOptionPane.showInputDialog("Ingrese el documento de la persona:"));

            String fechaNacimiento = null;
            int edad = -1;
            
            boolean edadValida = false;
            while (true) { 
                fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/MM/yyyy):");

                try {
                    Persona tempPersona = new Persona(nombre, documento, fechaNacimiento);
                    edad = tempPersona.calcularEdad();

                    if (edad == -1) {
                        JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use el formato dd/MM/yyyy.");
                    } else if (esParaAdultos && edad < 14) {
                        JOptionPane.showMessageDialog(null, "No se permite la entrada a menores de 14 años.");
                        return;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error procesando la fecha. Verifique el formato (dd/MM/yyyy).");
                }
            }

            boletasVendidas += cantidadStr;
            JOptionPane.showMessageDialog(null, "Boletas vendidas exitosamente.");
        }
    }

    public void mostrarBoletasDisponibles() {
        int disponibles = capacidadSala - boletasVendidas;
        JOptionPane.showMessageDialog(null, "Boletas disponibles: " + disponibles);
    }

    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
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
}
