package com.mycompany.tarea4;

import javax.swing.JOptionPane;

public class Congreso extends javax.swing.JFrame {

    public Congreso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo2 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JPanel();
        INGRESAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        BuapLogo = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLClave = new javax.swing.JLabel();
        NOMV1 = new javax.swing.JTextField();
        CLAVETXT = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo2.setBackground(new java.awt.Color(153, 204, 255));

        Fondo.setBackground(new java.awt.Color(51, 102, 255));

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        Titulo.setText("CONGRESO FCC-BUAP");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(Titulo)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Titulo)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Fondo1.setBackground(new java.awt.Color(51, 105, 255));

        INGRESAR.setBackground(new java.awt.Color(153, 204, 255));
        INGRESAR.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        INGRESAR.setText("INGRESAR");
        INGRESAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        SALIR.setBackground(new java.awt.Color(153, 204, 255));
        SALIR.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(INGRESAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SALIR)
                .addGap(150, 150, 150))
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR)
                    .addComponent(SALIR))
                .addGap(70, 70, 70))
        );

        BuapLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\m_ang\\Documents\\NetBeansProjects\\Tarea4\\src\\main\\java\\com\\mycompany\\tarea4\\Imagenes\\BUAP.png")); // NOI18N

        JLNombre.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        JLNombre.setText("NOMBRE:");

        JLClave.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        JLClave.setText("CLAVE:");

        NOMV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fondo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BuapLogo)
                .addGap(168, 168, 168)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNombre)
                    .addComponent(JLClave))
                .addGap(28, 28, 28)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NOMV1)
                    .addComponent(CLAVETXT, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuapLogo)
                    .addGroup(Fondo2Layout.createSequentialGroup()
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NOMV1))
                        .addGap(117, 117, 117)
                        .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CLAVETXT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(Fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMV1ActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        String nombre="PARIS HILTON",contrasena="123456";
        
        String clave = new String(CLAVETXT.getPassword());
        if(NOMV1.getText().equals(nombre)&& clave.equals(contrasena)){
        Registro frame2 = new Registro();
        frame2.setVisible(true);
        this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "NOMBRE Y/O CLAVE INVALIDOS");
        }
    }//GEN-LAST:event_INGRESARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Congreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Congreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Congreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Congreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Congreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuapLogo;
    private javax.swing.JPasswordField CLAVETXT;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JLabel JLClave;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JTextField NOMV1;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
