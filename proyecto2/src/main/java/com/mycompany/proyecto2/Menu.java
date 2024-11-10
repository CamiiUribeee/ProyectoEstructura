package com.mycompany.proyecto2;

import java.util.LinkedList;
import java.util.Queue;
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
        colaPreferencial = new javax.swing.JButton();
        colaNopreferencial = new javax.swing.JButton();
        atenderPreferencial = new javax.swing.JButton();
        atenderNopreferencial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imprimirPreferencial = new javax.swing.JButton();
        ImprimirNopreferencial = new javax.swing.JButton();
        turnosPreferencial = new javax.swing.JButton();
        turnosNopreferencial = new javax.swing.JButton();

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

        colaPreferencial.setText("Turno en Cola preferencial");
        colaPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaPreferencialActionPerformed(evt);
            }
        });

        colaNopreferencial.setText("Turno en Cola no preferencial");
        colaNopreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaNopreferencialActionPerformed(evt);
            }
        });

        atenderPreferencial.setText("Atender Cola preferencial");
        atenderPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderPreferencialActionPerformed(evt);
            }
        });

        atenderNopreferencial.setText("Atender Cola no preferencial");
        atenderNopreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderNopreferencialActionPerformed(evt);
            }
        });

        jLabel1.setText("Cola preferencial");

        jLabel2.setText("Cola No preferencial");

        imprimirPreferencial.setText("Imprimir Cola preferencial");
        imprimirPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirPreferencialActionPerformed(evt);
            }
        });

        ImprimirNopreferencial.setText("Imprimir Cola No preferencial");
        ImprimirNopreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirNopreferencialActionPerformed(evt);
            }
        });

        turnosPreferencial.setText("Turnos para ser atendidos");
        turnosPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnosPreferencialActionPerformed(evt);
            }
        });

        turnosNopreferencial.setText("Turnos para ser atendidos");
        turnosNopreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnosNopreferencialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoadClients)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel1)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(solicitarTurno)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(turnosPreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colaPreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(atenderPreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imprimirPreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(colaNopreferencial)
                                    .addComponent(ImprimirNopreferencial)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(turnosNopreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(atenderNopreferencial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(tittle)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadClients)
                    .addComponent(solicitarTurno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colaPreferencial)
                    .addComponent(colaNopreferencial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnosPreferencial)
                            .addComponent(turnosNopreferencial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atenderPreferencial))
                    .addComponent(atenderNopreferencial, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImprimirNopreferencial)
                    .addComponent(imprimirPreferencial))
                .addGap(19, 19, 19))
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

            if (validarTelefono(telefono)) {
                int telefonov = validateIntInput(telefono);
                JOptionPane.showMessageDialog(null, "Teléfono válido");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de teléfono válido.");
            }

            String saldo = (JOptionPane.showInputDialog("Ingrese el saldo del cliente:"));

            if (validarSaldo(saldo)) {
            double saldov = validateDoubleInput(saldo); 
            JOptionPane.showMessageDialog(null, "Saldo válido");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un saldo válido.");
        }

            // Creamos el cliente nuevo 
            Cliente nuevoCliente = new Cliente(documento, "nuevo", nombre, correo, telefono, saldo);

            // cuando creamos el nuevo cliente, se agrega a la cola 
            banco.agregarAColaNuevosClientes(nuevoCliente);

            // y también se agrega al arreglo de clientes
            banco.getClientes().add(nuevoCliente);

            JOptionPane.showMessageDialog(null, "Nuevo cliente registrado y agregado a la cola de nuevos clientes.");
        }


    }//GEN-LAST:event_solicitarTurnoActionPerformed

    private void colaPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaPreferencialActionPerformed
        // TODO add your handling code here:
        banco.verColaprioridad();
    }//GEN-LAST:event_colaPreferencialActionPerformed

    private void colaNopreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaNopreferencialActionPerformed
        // TODO add your handling code here:
        banco.verColanopreferencial();
    }//GEN-LAST:event_colaNopreferencialActionPerformed

    private void atenderPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderPreferencialActionPerformed
        // TODO add your handling code here:
        banco.atenderPreferencial();
    }//GEN-LAST:event_atenderPreferencialActionPerformed

    private void atenderNopreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderNopreferencialActionPerformed
        // TODO add your handling code here:
        banco.atenderNopreferencial();
    }//GEN-LAST:event_atenderNopreferencialActionPerformed

    private void imprimirPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirPreferencialActionPerformed
        // TODO add your handling code here:
        Queue<Cliente> colaPrioridades = new LinkedList<>();
        colaPrioridades = banco.getColaPrioridades();

        if (!colaPrioridades.isEmpty()) {
            StringBuilder mensaje = new StringBuilder();
            for (Cliente cliente : colaPrioridades) {
                mensaje.append("Documento: ").append(cliente.getDocumento()).append("\n")
                        .append("Tipo Cliente: ").append(cliente.getTipoCliente()).append("\n")
                        .append("Nombre: ").append(cliente.getNombre()).append("\n")
                        .append("Correo: ").append(cliente.getCorreo()).append("\n")
                        .append("Teléfono: ").append(cliente.getTelefono()).append("\n")
                        .append("Saldo: ").append(cliente.getSaldo()).append("\n")
                        .append("------------------------\n");
            }
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }//GEN-LAST:event_imprimirPreferencialActionPerformed

    private void ImprimirNopreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirNopreferencialActionPerformed
        // TODO add your handling code here:
        Queue<Cliente> colaNuevosClientes = new LinkedList<>();
        colaNuevosClientes = banco.getColaNuevosClientes();

        if (!colaNuevosClientes.isEmpty()) {
            StringBuilder mensaje = new StringBuilder();
            for (Cliente cliente : colaNuevosClientes) {
                mensaje.append("Documento: ").append(cliente.getDocumento()).append("\n")
                        .append("Tipo Cliente: ").append(cliente.getTipoCliente()).append("\n")
                        .append("Nombre: ").append(cliente.getNombre()).append("\n")
                        .append("Correo: ").append(cliente.getCorreo()).append("\n")
                        .append("Teléfono: ").append(cliente.getTelefono()).append("\n")
                        .append("Saldo: ").append(cliente.getSaldo()).append("\n")
                        .append("------------------------\n");
            }
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }//GEN-LAST:event_ImprimirNopreferencialActionPerformed

    private void turnosPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnosPreferencialActionPerformed
        // TODO add your handling code here:
        Queue<Cliente> colaPrioridades = new LinkedList<>();
        colaPrioridades = banco.getColaPrioridades();
        int documento = validateIntInput(JOptionPane.showInputDialog(null, "Ingrese su documento para saber cuantos turnos faltan para que lo atiendan"));
        int contador = 0;
        boolean encontrado = false;

        if (!colaPrioridades.isEmpty()) {
            for (Cliente cliente : colaPrioridades) {
                if (validateIntInput(cliente.getDocumento()) == documento) {
                    encontrado = true;
                    break;
                }
                contador++;
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Faltan " + contador + " turnos para que lo atiendan.");
            } else {
                JOptionPane.showMessageDialog(null, "El documento ingresado no se encuentra en la cola.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }//GEN-LAST:event_turnosPreferencialActionPerformed

    private void turnosNopreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnosNopreferencialActionPerformed
        // TODO add your handling code here:
        Queue<Cliente> colaNuevosClientes = new LinkedList<>();
        colaNuevosClientes = banco.getColaNuevosClientes();
        int documento = validateIntInput(JOptionPane.showInputDialog(null, "Ingrese su documento para saber cuantos turnos faltan para que lo atiendan"));
        int contador = 0;
        boolean encontrado = false;

        if (!colaNuevosClientes.isEmpty()) {
            for (Cliente cliente : colaNuevosClientes) {
                if (validateIntInput(cliente.getDocumento()) == documento) {
                    encontrado = true;
                    break;
                }
                contador++;
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Faltan " + contador + " turnos para que lo atiendan.");
            } else {
                JOptionPane.showMessageDialog(null, "El documento ingresado no se encuentra en la cola.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
    }//GEN-LAST:event_turnosNopreferencialActionPerformed

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
            JOptionPane.showInputDialog("Ingrese un número de teléfono valido: ");
            return false;
        }
    }

    // Validación para el saldo
    public boolean validarSaldo(String saldo) {
        try {
            double saldoValido = validateDoubleInput(saldo);
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

    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }

    public double validateDoubleInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Double.parseDouble(str);
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImprimirNopreferencial;
    private javax.swing.JButton LoadClients;
    private javax.swing.JButton atenderNopreferencial;
    private javax.swing.JButton atenderPreferencial;
    private javax.swing.JButton colaNopreferencial;
    private javax.swing.JButton colaPreferencial;
    private javax.swing.JButton imprimirPreferencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton solicitarTurno;
    private javax.swing.JLabel tittle;
    private javax.swing.JButton turnosNopreferencial;
    private javax.swing.JButton turnosPreferencial;
    // End of variables declaration//GEN-END:variables
}
