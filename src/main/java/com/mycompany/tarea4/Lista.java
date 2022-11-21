package com.mycompany.tarea4;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Lista extends javax.swing.JFrame {
    static int numero3;
    static int indice = 0;
    public Lista() {
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
    }


    private void mostrar(){
        indice++;
        int numeroA = 0;
        System.out.println("numero 3: " + numero3);
        System.out.println("test de array dentro de lista, contador: " + indice + "resgistros: " + Registro.registros);
        for(Asistentes usuario : Registro.registros){
            if(usuario.getIndice() == numeroA){
                MOSTRARNOM.setText(usuario.getNombre());
                PATERNOMOST.setText(usuario.getApaterno());
                MATERNOMOST.setText(usuario.getAmaterno());
                MOSTRAREDAD.setText(String.valueOf(usuario.getEdad()));
                MOSTRARUNI.setText(usuario.getUniversidad());
            }
        }

        // MOSTRARNOM.setText(Registro.registros.get(indice).getNombre());
        // PATERNOMOST.setText(Registro.registros.get(indice).getApaterno());
        // MATERNOMOST.setText(Registro.registros.get(indice).getAmaterno());
        // MOSTRAREDAD.setText(String.valueOf(Registro.registros.get(indice).getEdad()));
        // MOSTRARUNI.setText(Registro.registros.get(indice).getUniversidad());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        JLTitulov3 = new javax.swing.JLabel();
        JLSubti = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JPanel();
        AnteriorBTN = new javax.swing.JButton();
        SigBTN = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();
        LogoV3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLPaternov3 = new javax.swing.JLabel();
        JLMaternov3 = new javax.swing.JLabel();
        JLEdadv3 = new javax.swing.JLabel();
        JLUniv3 = new javax.swing.JLabel();
        MOSTRARNOM = new javax.swing.JLabel();
        PATERNOMOST = new javax.swing.JLabel();
        MATERNOMOST = new javax.swing.JLabel();
        MOSTRAREDAD = new javax.swing.JLabel();
        MOSTRARUNI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ventana3"); // NOI18N

        Fondo1.setBackground(new java.awt.Color(153, 204, 255));

        Fondo.setBackground(new java.awt.Color(51, 102, 255));

        JLTitulov3.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        JLTitulov3.setText("CONGRESO FCC");

        JLSubti.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        JLSubti.setText("LISTA DE ASISTENTES");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLTitulov3)
                    .addComponent(JLSubti))
                .addGap(307, 307, 307))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLTitulov3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLSubti)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        Fondo2.setBackground(new java.awt.Color(51, 102, 255));

        AnteriorBTN.setBackground(new java.awt.Color(153, 204, 255));
        AnteriorBTN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        AnteriorBTN.setText("ANTERIOR");
        AnteriorBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnteriorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorBTNActionPerformed(evt);
            }
        });

        SigBTN.setBackground(new java.awt.Color(153, 204, 255));
        SigBTN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        SigBTN.setText("SIGUIENTE");
        SigBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SigBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigBTNActionPerformed(evt);
            }
        });

        RegresarBtn.setBackground(new java.awt.Color(153, 204, 255));
        RegresarBtn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        RegresarBtn.setText("REGRESAR");
        RegresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(AnteriorBTN)
                .addGap(58, 58, 58)
                .addComponent(SigBTN)
                .addGap(198, 198, 198)
                .addComponent(RegresarBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegresarBtn)
                    .addComponent(SigBTN)
                    .addComponent(AnteriorBTN))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        LogoV3.setIcon(new javax.swing.ImageIcon("C:\\Users\\m_ang\\Documents\\NetBeansProjects\\Tarea4\\src\\main\\java\\com\\mycompany\\tarea4\\Imagenes\\FCC.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("NOMBRE:");

        JLPaternov3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLPaternov3.setText("APELLIDO PATERNO:");

        JLMaternov3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLMaternov3.setText("APELLIDO MATERNO:");

        JLEdadv3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLEdadv3.setText("EDAD:");

        JLUniv3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLUniv3.setText("UNIVERSIDAD:");

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fondo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Fondo1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(JLPaternov3))
                    .addComponent(JLMaternov3)
                    .addComponent(JLEdadv3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLUniv3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MOSTRARNOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PATERNOMOST, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(MATERNOMOST, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MOSTRAREDAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MOSTRARUNI, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoV3)
                .addGap(69, 69, 69))
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoV3)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MOSTRARNOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PATERNOMOST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLPaternov3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Fondo1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(JLMaternov3))
                            .addGroup(Fondo1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MATERNOMOST, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MOSTRAREDAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLEdadv3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLUniv3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MOSTRARUNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(Fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        Registro frame2 = new Registro();
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarBtnActionPerformed

    private void AnteriorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorBTNActionPerformed
        //    numero3--;
        // validar(test);
        int test = numero3 - 1;
        if(test < 0){
            numero3 = 0;
            JOptionPane.showMessageDialog(null, "No hay mas registros");
        }else{
            numero3--;
        }
        int numeroA = numero3;
        System.out.println(numeroA);
        
        for(Asistentes asistentes : Registro.registros){
            if(asistentes.getIndice() == numeroA){
                MOSTRARNOM.setText(asistentes.getNombre());
                PATERNOMOST.setText(asistentes.getApaterno());
                MATERNOMOST.setText(asistentes.getAmaterno());
                MOSTRAREDAD.setText(String.valueOf(asistentes.getEdad()));
                MOSTRARUNI.setText(asistentes.getUniversidad());
            }
        }
    }//GEN-LAST:event_AnteriorBTNActionPerformed

    private void SigBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigBTNActionPerformed
        //  boolean bandera = false;
        int test = numero3 + 1;
        if(test > Registro.registros.size()){
            numero3 = Registro.registros.size();
            JOptionPane.showMessageDialog(null, "No hay mas registros");
        }else{
            numero3++;
        }
        int numeroA = numero3;
        System.out.println(numeroA);
        for(Asistentes asistente : Registro.registros){
            if(asistente.getIndice() == numeroA){
                MOSTRARNOM.setText(asistente.getNombre());
                PATERNOMOST.setText(asistente.getApaterno());
                MATERNOMOST.setText(asistente.getAmaterno());
                MOSTRAREDAD.setText(String.valueOf(asistente.getEdad()));
                MOSTRARUNI.setText(asistente.getUniversidad());
                
                // bandera = true;
            }
        }
        // if(!bandera){
        //     JOptionPane.showMessageDialog(null, "Final de la lista");
        // }
    }//GEN-LAST:event_SigBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnteriorBTN;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JLabel JLEdadv3;
    private javax.swing.JLabel JLMaternov3;
    private javax.swing.JLabel JLPaternov3;
    private javax.swing.JLabel JLSubti;
    private javax.swing.JLabel JLTitulov3;
    private javax.swing.JLabel JLUniv3;
    private javax.swing.JLabel LogoV3;
    private javax.swing.JLabel MATERNOMOST;
    private javax.swing.JLabel MOSTRAREDAD;
    private javax.swing.JLabel MOSTRARNOM;
    private javax.swing.JLabel MOSTRARUNI;
    private javax.swing.JLabel PATERNOMOST;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JButton SigBTN;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
