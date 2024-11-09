
package com.mycompany.proyecto2;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Menu extends javax.swing.JFrame {
    
    Bancoo banco = new Bancoo(); 
    private JTable table;  //PARA LA TABLA 
    private DefaultTableModel tableModel; //PARA LA TABLA
    
    public Menu() {
        initComponents();
        initializeTable();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        LoadClients = new javax.swing.JButton();
        solicitarTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Caso de estudio");

        LoadClients.setText("Cargar clientes desde el archivo");
        LoadClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadClientsActionPerformed(evt);
            }
        });

        solicitarTurno.setText("Solicitar turno");
        solicitarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LoadClients)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tittle)
                    .addComponent(solicitarTurno))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadClients)
                    .addComponent(solicitarTurno))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadClientsActionPerformed
        // TODO add your handling code here:
        banco.cargarClientesDesdeArchivo();
        
        
        // Llenar la tabla con los datos del arreglo
        for (Cliente cliente : banco.getClientes()) {
            Object[] rowData = {
                cliente.getDocumento(),
                cliente.getTipoCliente(),
                cliente.getNombre(),
                cliente.getCorreo(),
                cliente.getTelefono(),
                cliente.getSaldo()
            };
            tableModel.addRow(rowData);
        }

        JOptionPane.showMessageDialog(this, "Datos cargados en la tabla.");
        
    }//GEN-LAST:event_LoadClientsActionPerformed

    private void solicitarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarTurnoActionPerformed
        
        String documento = JOptionPane.showInputDialog(null, "Ingrese el número de documento:", "Solicitar Turno", JOptionPane.PLAIN_MESSAGE);
    
        
        //VALIDACIONES DE TODO ACÁ:
        
        // Validar documento
        if (documento == null || documento.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El documento no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validar que el documento sea un número
        if (!documento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El documento debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        Cliente cliente = buscarClientePorDocumento(documento);
    
        if (cliente != null) {
            
            banco.agregarAColaPrioridad(cliente);
            JOptionPane.showMessageDialog(null, "Cliente con documento " + documento + " agregado a la cola de prioridades.");
        
        } else {
            
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String correo = JOptionPane.showInputDialog("Ingrese el correo del cliente:");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo del cliente:"));
        
            // Creamos el cliente nuevo 
            Cliente nuevoCliente = new Cliente(documento, "nuevo", nombre, correo, telefono, saldo);
        
            // cuando creamos el nuevo cliente, se agrega a la cola 
            banco.agregarAColaNuevosClientes(nuevoCliente);
        
            // y también se agrega al arreglo de clientes
            banco.getClientes().add(nuevoCliente);
        
            JOptionPane.showMessageDialog(null, "Nuevo cliente registrado y agregado a la cola de nuevos clientes.");
        }
          
        
    }//GEN-LAST:event_solicitarTurnoActionPerformed

    public Cliente buscarClientePorDocumento(String documento) {
    
        for (Cliente cliente : banco.getClientes()) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente; 
            }
        }
        return null; 
    }

    
    private void initializeTable() {
        // Definir columnas de la tabla
        String[] columnNames = {"Documento", "Tipo de Cliente", "Nombre", "Correo", "Teléfono", "Saldo"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        
        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);
        
        // Ajustar el layout para que la tabla se vea correctamente
        scrollPane.setBounds(30, 100, 500, 200);
        this.setSize(600, 400);
        this.setLayout(null);
    }
    
    
    // MÉTODOS PARA VALIDAR MÁS:
    
    // Validación para teléfono (10 dígitos)
    public boolean validarTelefono(String telefono) {
        if (telefono.matches("\\d{10}")) {
            return true; // El teléfono tiene 10 dígitos
        } else {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe tener 10 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Validación para el saldo
    public boolean validarSaldo(String saldo) {
        try {
            double saldoValido = Double.parseDouble(saldo);
            if (saldoValido < 0) {
                JOptionPane.showMessageDialog(null, "El saldo no puede ser negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El saldo debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    
    


    
    
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadClients;
    private javax.swing.JButton solicitarTurno;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
