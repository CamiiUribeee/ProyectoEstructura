
package com.mycompany.sistemaufpso;

import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {

    Funcionalidades objfunciones = new Funcionalidades();
    
    
    public Sistema (){
        initComponents();
        objfunciones.crearEscenario();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        escenariomasVisitado = new javax.swing.JButton();
        masvisitadoRestaurant = new javax.swing.JButton();
        escenariomenosVisitado = new javax.swing.JButton();
        totalPersonas = new javax.swing.JButton();
        promedioVisitantes = new javax.swing.JButton();
        masmenosescenarioVisitado = new javax.swing.JButton();
        diamasymenosVisitado = new javax.swing.JButton();
        randommasymenosVisitado = new javax.swing.JButton();
        llenarTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mostrarCartelera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comprarEntrada = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        cantidadPersonas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaDatos.setText("Llenar la tabla de datos");
        tablaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaDatosActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        Search.setText("Consultar todos los datos");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        escenariomasVisitado.setText("Escenario mas visitado");
        escenariomasVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escenariomasVisitadoActionPerformed(evt);
            }
        });

        masvisitadoRestaurant.setText("Dia mas visitado del restaurante");
        masvisitadoRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masvisitadoRestaurantActionPerformed(evt);
            }
        });

        escenariomenosVisitado.setText("Escenario menos visitado");
        escenariomenosVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escenariomenosVisitadoActionPerformed(evt);
            }
        });

        totalPersonas.setText("Total de personas");
        totalPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPersonasActionPerformed(evt);
            }
        });

        promedioVisitantes.setText("Promedio de visitantes");
        promedioVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioVisitantesActionPerformed(evt);
            }
        });

        masmenosescenarioVisitado.setText("Dia con mas y menos visitantes");
        masmenosescenarioVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masmenosescenarioVisitadoActionPerformed(evt);
            }
        });

        diamasymenosVisitado.setText("Dia mas y menos visitado");
        diamasymenosVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diamasymenosVisitadoActionPerformed(evt);
            }
        });

        randommasymenosVisitado.setText("Escenario mas y menos visitado");
        randommasymenosVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randommasymenosVisitadoActionPerformed(evt);
            }
        });

        llenarTabla.setText("Llenar tabla de datos manualmente");
        llenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenarTablaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema UFPSO");

        mostrarCartelera.setText("Mostrar Cartelera de Películas");
        mostrarCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCarteleraActionPerformed(evt);
            }
        });

        jLabel2.setText("CINE");

        comprarEntrada.setText("Comprar entrada");
        comprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarEntradaActionPerformed(evt);
            }
        });

        consultar.setText("Consultar entrada");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        cantidadPersonas.setText("Cantidad de personas");
        cantidadPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(Search))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(escenariomasVisitado)
                                        .addComponent(promedioVisitantes))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(masvisitadoRestaurant)
                                        .addComponent(masmenosescenarioVisitado))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(escenariomenosVisitado)
                                        .addComponent(diamasymenosVisitado))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(randommasymenosVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(totalPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(tablaDatos)
                        .addGap(113, 113, 113)
                        .addComponent(llenarTabla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mostrarCartelera)
                                .addGap(31, 31, 31)
                                .addComponent(comprarEntrada)
                                .addGap(31, 31, 31)
                                .addComponent(consultar)
                                .addGap(33, 33, 33)
                                .addComponent(cantidadPersonas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)))))
                .addGap(0, 116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablaDatos)
                    .addComponent(llenarTabla))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escenariomasVisitado)
                    .addComponent(masvisitadoRestaurant)
                    .addComponent(escenariomenosVisitado)
                    .addComponent(totalPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedioVisitantes)
                    .addComponent(masmenosescenarioVisitado)
                    .addComponent(diamasymenosVisitado)
                    .addComponent(randommasymenosVisitado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarCartelera)
                    .addComponent(comprarEntrada)
                    .addComponent(consultar)
                    .addComponent(cantidadPersonas))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaDatosActionPerformed
   
        String[][] datos = objfunciones.getDatosTabla(); 
        String[] columnas = {"Escenario", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        // Actualiza el modelo de la tabla con los datos
        tabla.setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
        
    }//GEN-LAST:event_tablaDatosActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String total= objfunciones.EscenarioMasVisitado();
        String total1 = objfunciones.DiaMasVisitadoRestaurante();
        String total2 = objfunciones.escenarioMenosVisitado();
        String total3 = objfunciones.TotalVisitantesSemana();
        String total4 = objfunciones.PromedioVisitantesSemana();
        String total5 = objfunciones.DiaConMasYMenosVisitantes();
        String total6 = objfunciones.DiaYEscenarioMasYMenosVisitado();
        String total7 = objfunciones.EscenarioMasYmenosVisitado();
        
        JOptionPane.showMessageDialog(null, "Analisis: \n"+ total + total1 + total2 +total3 + total4 + total5 + total6 + total7);
        //JOptionPane.showMessageDialog(null, "Análisis: "+ total + total1 + total2 +total3 + total4 + total5 + total6, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SearchActionPerformed

    private void escenariomasVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escenariomasVisitadoActionPerformed
        // TODO add your handling code here:
        String total= objfunciones.EscenarioMasVisitado();
        JOptionPane.showMessageDialog(null, total);
    }//GEN-LAST:event_escenariomasVisitadoActionPerformed

    private void masvisitadoRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masvisitadoRestaurantActionPerformed
        // TODO add your handling code here:
        String total1 = objfunciones.DiaMasVisitadoRestaurante();
        JOptionPane.showMessageDialog(null, total1);
    }//GEN-LAST:event_masvisitadoRestaurantActionPerformed

    private void escenariomenosVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escenariomenosVisitadoActionPerformed
        // TODO add your handling code here:
        String total2 = objfunciones.escenarioMenosVisitado();
        JOptionPane.showMessageDialog(null, total2);
    }//GEN-LAST:event_escenariomenosVisitadoActionPerformed

    private void totalPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPersonasActionPerformed
        // TODO add your handling code here:
        String total3 = objfunciones.TotalVisitantesSemana();
        JOptionPane.showMessageDialog(null, total3);
    }//GEN-LAST:event_totalPersonasActionPerformed

    private void promedioVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioVisitantesActionPerformed
        // TODO add your handling code here:
        String total4 = objfunciones.PromedioVisitantesSemana();
        JOptionPane.showMessageDialog(null, total4);
    }//GEN-LAST:event_promedioVisitantesActionPerformed

    private void masmenosescenarioVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masmenosescenarioVisitadoActionPerformed
        // TODO add your handling code here:
        String total5 = objfunciones.DiaConMasYMenosVisitantes();
        JOptionPane.showMessageDialog(null, total5);
    }//GEN-LAST:event_masmenosescenarioVisitadoActionPerformed

    private void diamasymenosVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diamasymenosVisitadoActionPerformed
        // TODO add your handling code here:
        String total6 = objfunciones.DiaYEscenarioMasYMenosVisitado();
        JOptionPane.showMessageDialog(null, total6);
    }//GEN-LAST:event_diamasymenosVisitadoActionPerformed

    private void randommasymenosVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randommasymenosVisitadoActionPerformed
        // TODO add your handling code here:
        String total7 = objfunciones.EscenarioMasYmenosVisitado();
        JOptionPane.showMessageDialog(null, total7);
    }//GEN-LAST:event_randommasymenosVisitadoActionPerformed

    private void llenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenarTablaActionPerformed
        // TODO add your handling code here:
        objfunciones.llenarEscenariosManual();
    }//GEN-LAST:event_llenarTablaActionPerformed

    private void mostrarCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarteleraActionPerformed
        // TODO add your handling code here:
        String cartelera = objfunciones.mostrarCarteleraPeli();
        
        // Mostrar la cartelera
        JOptionPane.showMessageDialog(null, cartelera, "Cartelera de Películas", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_mostrarCarteleraActionPerformed

    private void comprarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarEntradaActionPerformed
       
        // Solicitar el número de documento
        String documento = JOptionPane.showInputDialog("Ingrese su documento:");
    
        // Solicitar el nombre del comprador
        String nombreComprador = JOptionPane.showInputDialog("Ingrese su nombre:");
    
        // Solicitar la fecha de nacimiento
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (formato: dd-MM-yyyy):");
    
        // Solicitar el sexo
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo (M/F):");

        try {
            // Solicitar el índice de la película
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la película:"));

            // Validamos que el índice sea correcto
            if (indice < 1 || indice > objfunciones.obtenerNumeroDePeliculas()) {
                JOptionPane.showMessageDialog(null, "Número de película inválido. Intente de nuevo.");
                return;
            }

            // Vender la entrada
            objfunciones.venderEntrada(indice - 1, documento, nombreComprador, fechaNacimiento, sexo); 

            // Mostrar las entradas vendidas
            String ventas = objfunciones.mostrarEntradasVendidas();
            JOptionPane.showMessageDialog(null, ventas); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.");
        }
        
    }//GEN-LAST:event_comprarEntradaActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        String documento = JOptionPane.showInputDialog("Ingrese su documento:");
        String entradas = objfunciones.mostrarEntradasCompradas(documento); 
        JOptionPane.showMessageDialog(null, entradas);
    }//GEN-LAST:event_consultarActionPerformed

    private void cantidadPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadPersonasActionPerformed
        // TODO add your handling code here:
        
        // Obtener conteo de hombres y mujeres
        int[] conteos = objfunciones.contarHombresYmujeres();
        String mensajeHombresYMujeres = "Hombres: " + conteos[0] + "\nMujeres: " + conteos[1];
    
        // Contar adultos mayores
        int totalAdultosMayores = objfunciones.contarAdultosMayores();
        String mensajeAdultosMayores = "Total de adultos mayores a 65 años: " + totalAdultosMayores;
    
        // Escenario con más mujeres
        String escenario = objfunciones.escenarioConMasMujeres();
        String mensajeEscenario = "Escenario con más mujeres: " + escenario;
    
        // Mostrar todos los resultados en una sola ventana
        JOptionPane.showMessageDialog(null, mensajeHombresYMujeres + "\n" + mensajeAdultosMayores + "\n" + mensajeEscenario);
    }//GEN-LAST:event_cantidadPersonasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton cantidadPersonas;
    private javax.swing.JButton comprarEntrada;
    private javax.swing.JButton consultar;
    private javax.swing.JButton diamasymenosVisitado;
    private javax.swing.JButton escenariomasVisitado;
    private javax.swing.JButton escenariomenosVisitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton llenarTabla;
    private javax.swing.JButton masmenosescenarioVisitado;
    private javax.swing.JButton masvisitadoRestaurant;
    private javax.swing.JButton mostrarCartelera;
    private javax.swing.JButton promedioVisitantes;
    private javax.swing.JButton randommasymenosVisitado;
    private javax.swing.JTable tabla;
    private javax.swing.JButton tablaDatos;
    private javax.swing.JButton totalPersonas;
    // End of variables declaration//GEN-END:variables
}
