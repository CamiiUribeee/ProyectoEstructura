
package com.mycompany.proyecto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Bancoo {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cargarClientesDesdeArchivo() {
        
        String nombreArchivo = "clientes.txt"; 
    
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    String[] datos = linea.split(",");
                    if (datos.length == 6) { 
                        
                        Cliente cliente = new Cliente(
                            datos[0].trim(),
                            datos[1].trim(),
                            datos[2].trim(),
                            datos[3].trim(),
                            datos[4].trim(), // Teléfono como String
                            Double.parseDouble(datos[5].trim())
                        );
                        clientes.add(cliente);
                        
                        // para imprimir los clientes en consola
                        System.out.println("Cliente cargado: " + cliente.getNombre() + ", " + cliente.getDocumento());
                    } else {
                        JOptionPane.showMessageDialog(null, "Formato incorrecto: " + linea, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Formato incorrecto en la línea: " + linea, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            JOptionPane.showMessageDialog(null, "Clientes cargados exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + nombreArchivo, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
