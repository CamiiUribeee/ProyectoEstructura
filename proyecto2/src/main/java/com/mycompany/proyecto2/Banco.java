import com.mycompany.proyecto2.Cliente;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    // Método para cargar clientes desde un archivo
    public void cargarClientesDesdeArchivo() {
        String nombreArchivo = JOptionPane.showInputDialog(null, "Ingrese la ruta del archivo TXT:", 
                                                           "Cargar Archivo", JOptionPane.PLAIN_MESSAGE);
        
        // Validar si el usuario ingresó un archivo
        if (nombreArchivo == null || nombreArchivo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó un archivo válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) { 
                    Cliente cliente = new Cliente(
                        datos[0].trim(),
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        Integer.parseInt(datos[4].trim()),
                        Double.parseDouble(datos[5].trim())
                    );
                    clientes.add(cliente);
                }
            }
            JOptionPane.showMessageDialog(null, "Clientes cargados exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + nombreArchivo, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}


