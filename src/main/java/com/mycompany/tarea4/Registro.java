
package com.mycompany.tarea4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
public static ArrayList<Asistentes>registros = new ArrayList<>();
    static int test = 0;
    static int numero1 = 0;
    static int numero2 = 0;
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        System.out.println("test = " + test);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        test++;
        System.out.println("registros: " + registros);
        Fondo1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        Titulov2 = new javax.swing.JLabel();
        Registrov2 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JPanel();
        REGISTRAR = new javax.swing.JButton();
        ORDENAR = new javax.swing.JButton();
        LISTAR = new javax.swing.JButton();
        AUTOR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        FCCLogo = new javax.swing.JLabel();
        JLNombrev2 = new javax.swing.JLabel();
        JLPaterno = new javax.swing.JLabel();
        JLMaterno = new javax.swing.JLabel();
        JLEdad = new javax.swing.JLabel();
        JLuni = new javax.swing.JLabel();
        NOMBRETXT = new javax.swing.JTextField();
        PATERNOTXT = new javax.swing.JTextField();
        MATERNOTXT = new javax.swing.JTextField();
        EDADTXT = new javax.swing.JTextField();
        UNITXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo1.setBackground(new java.awt.Color(153, 204, 255));
        Fondo1.setPreferredSize(new java.awt.Dimension(1050, 850));

        Fondo.setBackground(new java.awt.Color(51, 102, 255));

        Titulov2.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        Titulov2.setText("CONGRESO FCC");

        Registrov2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Registrov2.setText("REGISTRO");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulov2)
                .addGap(317, 317, 317))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(Registrov2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Titulov2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrov2)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Fondo2.setBackground(new java.awt.Color(51, 102, 255));
        Fondo2.setPreferredSize(new java.awt.Dimension(1050, 210));

        REGISTRAR.setBackground(new java.awt.Color(153, 204, 255));
        REGISTRAR.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        ORDENAR.setBackground(new java.awt.Color(153, 204, 255));
        ORDENAR.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ORDENAR.setText("ORDENAR");
        ORDENAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARActionPerformed(evt);
            }
        });

        LISTAR.setBackground(new java.awt.Color(153, 204, 255));
        LISTAR.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LISTAR.setText("LISTAR");
        LISTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTARActionPerformed(evt);
            }
        });

        AUTOR.setBackground(new java.awt.Color(153, 204, 255));
        AUTOR.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        AUTOR.setText("AUTOR");
        AUTOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AUTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORActionPerformed(evt);
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

        javax.swing.GroupLayout Fondo2Layout = new javax.swing.GroupLayout(Fondo2);
        Fondo2.setLayout(Fondo2Layout);
        Fondo2Layout.setHorizontalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(REGISTRAR)
                .addGap(33, 33, 33)
                .addComponent(ORDENAR)
                .addGap(46, 46, 46)
                .addComponent(LISTAR)
                .addGap(101, 101, 101)
                .addComponent(AUTOR)
                .addGap(46, 46, 46)
                .addComponent(SALIR)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Fondo2Layout.setVerticalGroup(
            Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALIR)
                    .addGroup(Fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AUTOR)
                        .addComponent(LISTAR))
                    .addComponent(ORDENAR)
                    .addComponent(REGISTRAR))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        FCCLogo.setBackground(new java.awt.Color(153, 204, 255));
        FCCLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\m_ang\\Documents\\NetBeansProjects\\Tarea4\\src\\main\\java\\com\\mycompany\\tarea4\\Imagenes\\FCC.png")); // NOI18N

        JLNombrev2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLNombrev2.setText("NOMBRE:");

        JLPaterno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLPaterno.setText("APELLIDO PATERNO:");

        JLMaterno.setBackground(new java.awt.Color(153, 204, 255));
        JLMaterno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLMaterno.setText("APELLIDO MATERNO:");

        JLEdad.setBackground(new java.awt.Color(153, 204, 255));
        JLEdad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLEdad.setText("EDAD:");

        JLuni.setBackground(new java.awt.Color(153, 204, 255));
        JLuni.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLuni.setText("UNIVERSIDAD:");

        NOMBRETXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRETXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Fondo1Layout = new javax.swing.GroupLayout(Fondo1);
        Fondo1.setLayout(Fondo1Layout);
        Fondo1Layout.setHorizontalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(FCCLogo)
                .addGap(215, 215, 215)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addComponent(JLPaterno)
                        .addGap(18, 18, 18)
                        .addComponent(PATERNOTXT))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addComponent(JLNombrev2)
                        .addGap(159, 159, 159)
                        .addComponent(NOMBRETXT, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLMaterno)
                            .addComponent(JLEdad)
                            .addComponent(JLuni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MATERNOTXT)
                            .addComponent(EDADTXT)
                            .addComponent(UNITXT))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fondo1Layout.setVerticalGroup(
            Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo1Layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(FCCLogo))
                    .addGroup(Fondo1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NOMBRETXT)
                            .addComponent(JLNombrev2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PATERNOTXT)
                            .addComponent(JLPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MATERNOTXT)
                            .addComponent(JLMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEdad)
                            .addComponent(EDADTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(Fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UNITXT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTARActionPerformed
        Lista frame3 = new Lista();
        frame3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LISTARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void NOMBRETXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRETXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRETXTActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        if(!NOMBRETXT.getText().equals("") && !PATERNOTXT.getText().equals("") && !MATERNOTXT.getText().equals("") 
        && !EDADTXT.getText().equals("") && !UNITXT.getText().equals("")){
            // Asistentes asistentes = new Asistentes ("","", "",0,0, "");
                
            // asistentes.setIndice(numero1);
            // asistentes.setNombre(NOMBRETXT.getText());
            // asistentes.setApaterno(PATERNOTXT.getText());
            // asistentes.setAmaterno(MATERNOTXT.getText());
            // asistentes.setEdad(Integer.parseInt(EDADTXT.getText()));      
            // asistentes.setUniversidad(UNITXT.getText());
            // registros.add(asistentes);
            System.out.println("id = " + numero1);
            registros.add(new Asistentes(NOMBRETXT.getText(), PATERNOTXT.getText(), MATERNOTXT.getText(), numero1, Integer.parseInt(EDADTXT.getText()), UNITXT.getText()));
            numero1++;
            System.out.println(EDADTXT.getText());
        
            NOMBRETXT.setText(null);
            PATERNOTXT.setText(null);
            MATERNOTXT.setText(null);
            EDADTXT.setText(null);
            UNITXT.setText(null);
            System.out.println(registros);
            }else{
                JOptionPane.showMessageDialog(null, "Digite los datos para su registro");
            }
            JOptionPane.showMessageDialog(null,"Registro correcto","REGISTRAR",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void AUTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORActionPerformed
        JOptionPane.showMessageDialog(null,"Nombre completo: Gael Reyes Arroyo\nMatricula: 202154715\nNo. de lista: 30","AUTOR",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_AUTORActionPerformed

    private void ORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARActionPerformed
        Asistentes aux;
        int n= 0, i;
        boolean mov = true;
        while(mov){
            mov = false;
            for(i=1;i<registros.size()-n; i++){
                if(registros.get(i).getApaterno().compareTo(registros.get(i-1).getApaterno())<0){
                    mov = true;
                    aux = registros.get(i);
                    registros.set(i, registros.get(i-1));
                    registros.set(i-1, aux);
                }
            }
        }
        for(i = 0; i < registros.size(); i++){
            registros.get(i).setIndice(numero2);
            numero2++;
        }
        JOptionPane.showMessageDialog(null, "Lista ordenada");
 
        numero2 = 0;
    }//GEN-LAST:event_ORDENARActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUTOR;
    private javax.swing.JTextField EDADTXT;
    private javax.swing.JLabel FCCLogo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JPanel Fondo2;
    private javax.swing.JLabel JLEdad;
    private javax.swing.JLabel JLMaterno;
    private javax.swing.JLabel JLNombrev2;
    private javax.swing.JLabel JLPaterno;
    private javax.swing.JLabel JLuni;
    private javax.swing.JButton LISTAR;
    private javax.swing.JTextField MATERNOTXT;
    private javax.swing.JTextField NOMBRETXT;
    private javax.swing.JButton ORDENAR;
    private javax.swing.JTextField PATERNOTXT;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JLabel Registrov2;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel Titulov2;
    private javax.swing.JTextField UNITXT;
    // End of variables declaration//GEN-END:variables
}
