
package com.mycompany.proyecto2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class Bancoo {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Queue<Cliente> colaPrioridades = new LinkedList<>();  //para el inciso 3: las colas 
    private Queue<Cliente> colaNuevosClientes = new LinkedList<>();

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
                            datos[5].trim()
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
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    
    //COLAS:
    // Métodos para agregar a las colas
    public void agregarAColaPrioridad(Cliente cliente) {
        colaPrioridades.add(cliente);
    }

    public void agregarAColaNuevosClientes(Cliente cliente) {
        colaNuevosClientes.add(cliente);
    }

    // Métodos para mostrar las colas
    public Queue<Cliente> getColaPrioridades() {
        return colaPrioridades;
    }

    public Queue<Cliente> getColaNuevosClientes() {
        return colaNuevosClientes;
    }
    
    //Metodos para ver el cliente al frente de la cola y el segundo 
    public void verColaprioridad(){
        if(colaPrioridades.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No hay turnos en la cola");
        } else {
            JOptionPane.showMessageDialog(null, "Se esta atendiendo a: "+colaPrioridades.peek().getNombre() + ", de documento: "+colaPrioridades.peek().getDocumento());
            if (colaPrioridades.size() >= 2) {
                Cliente segundoElemento = ((LinkedList<Cliente>) colaPrioridades).get(1);
                JOptionPane.showMessageDialog(null, "El segundo turno a atender es: "+segundoElemento.getNombre() + ", de documento: "+segundoElemento.getDocumento());
            } else {
                JOptionPane.showMessageDialog(null, "Solamente hay un cliente en la lista, asi que el segundo no se puede ver");
            }
        }
    }
    
    public void verColanopreferencial(){
        if(colaNuevosClientes.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No hay turnos en la cola");
        } else {
            JOptionPane.showMessageDialog(null, "Se esta atendiendo a: "+colaNuevosClientes.peek().getNombre() + ", de documento: "+colaNuevosClientes.peek().getDocumento());
            if (colaNuevosClientes.size() >= 2) {
                Cliente segundoElemento = ((LinkedList<Cliente>) colaNuevosClientes).get(1);
                JOptionPane.showMessageDialog(null, "El segundo turno a atender es: "+segundoElemento.getNombre() + ", de documento: "+segundoElemento.getDocumento());
            } else {
                JOptionPane.showMessageDialog(null, "Solamente hay un cliente en la lista, asi que el segundo no se puede ver");
            }
        }
    }
    
    //Metodos para atender a las colas
    public void atenderPreferencial(){
        if(colaPrioridades.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No hay turnos en la cola");
        } else {
            Cliente firstElement = colaPrioridades.poll();
            JOptionPane.showMessageDialog(null, "Cliente atendido: "+firstElement.getNombre());
        }
    }
    
    public void atenderNopreferencial(){
        if(colaNuevosClientes.isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No hay turnos en la cola");
        } else {
            Cliente firstElement = colaNuevosClientes.poll();
            JOptionPane.showMessageDialog(null, "Cliente atendido: "+firstElement.getNombre());
        }
    }
}
