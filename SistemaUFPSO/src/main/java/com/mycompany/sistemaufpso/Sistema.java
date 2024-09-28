
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaDatos.setText("Mostrar tabla de datos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randommasymenosVisitado))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(Search)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(tablaDatos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tablaDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(24, Short.MAX_VALUE))
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
    private javax.swing.JButton diamasymenosVisitado;
    private javax.swing.JButton escenariomasVisitado;
    private javax.swing.JButton escenariomenosVisitado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton masmenosescenarioVisitado;
    private javax.swing.JButton masvisitadoRestaurant;
    private javax.swing.JButton promedioVisitantes;
    private javax.swing.JButton randommasymenosVisitado;
    private javax.swing.JTable tabla;
    private javax.swing.JButton tablaDatos;
    private javax.swing.JButton totalPersonas;
    // End of variables declaration//GEN-END:variables
}
