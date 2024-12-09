
package com.mycompany.cineleonelda;


public class Menu extends javax.swing.JFrame {

    CineLeonelda cine = new CineLeonelda();
    ArbolBinario arbol = new ArbolBinario();
   
    public Menu() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        sellTickets = new javax.swing.JButton();
        seeAvailableTickets = new javax.swing.JButton();
        consultByDocument = new javax.swing.JButton();
        buyersReport = new javax.swing.JButton();
        printOrderByAge = new javax.swing.JButton();
        addPelicula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Cine Leonelda");

        sellTickets.setText("Vender boletas");
        sellTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellTicketsActionPerformed(evt);
            }
        });

        seeAvailableTickets.setText("Ver boletas disponibles");
        seeAvailableTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAvailableTicketsActionPerformed(evt);
            }
        });

        consultByDocument.setText("Consultar por documento");
        consultByDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultByDocumentActionPerformed(evt);
            }
        });

        buyersReport.setText("Reporte de compradores");
        buyersReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyersReportActionPerformed(evt);
            }
        });

        printOrderByAge.setText("Imprimir en orden ");
        printOrderByAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOrderByAgeActionPerformed(evt);
            }
        });

        addPelicula.setText("Cartelera");
        addPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellTickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultByDocument))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buyersReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seeAvailableTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tittle)
                            .addComponent(addPelicula))
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(printOrderByAge)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellTickets)
                    .addComponent(seeAvailableTickets))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultByDocument)
                    .addComponent(buyersReport))
                .addGap(30, 30, 30)
                .addComponent(printOrderByAge)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellTicketsActionPerformed
        // vender boletas
        cine.venderBoletas();
    }//GEN-LAST:event_sellTicketsActionPerformed

    private void seeAvailableTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAvailableTicketsActionPerformed
        // boletas disponibles
       cine.mostrarBoletasDisponibles();
    }//GEN-LAST:event_seeAvailableTicketsActionPerformed

    private void consultByDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultByDocumentActionPerformed
        // consutar por documento
        cine.consultarPorDocumento();
    }//GEN-LAST:event_consultByDocumentActionPerformed

    private void buyersReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyersReportActionPerformed
        // información de compradores
        cine.mostrarCompradores();
    }//GEN-LAST:event_buyersReportActionPerformed

    private void printOrderByAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOrderByAgeActionPerformed
        // imprimir en orden de edad
        cine.mostrarEnOrden();
    }//GEN-LAST:event_printOrderByAgeActionPerformed

    private void addPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPeliculaActionPerformed
        // ingresar peliculas
        cine.iniciarCartelera();
    }//GEN-LAST:event_addPeliculaActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPelicula;
    private javax.swing.JButton buyersReport;
    private javax.swing.JButton consultByDocument;
    private javax.swing.JButton printOrderByAge;
    private javax.swing.JButton seeAvailableTickets;
    private javax.swing.JButton sellTickets;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
