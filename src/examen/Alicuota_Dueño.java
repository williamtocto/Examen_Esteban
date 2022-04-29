
package examen;

import javax.swing.ButtonGroup;
import modelo.Dueño;


public class Alicuota_Dueño extends javax.swing.JFrame {

   ButtonGroup grupo = null;
   
    public Alicuota_Dueño() {
        initComponents();      
        grupo.add(rbtn_paga);
        grupo.add(rbtn_pendiente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtn_paga = new javax.swing.JRadioButton();
        rbtn_pendiente = new javax.swing.JRadioButton();
        txt_numero_dep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 126, 220, -1));

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 84, 220, -1));
        getContentPane().add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 168, 220, -1));

        jLabel1.setText("Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 88, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 130, -1, -1));

        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 172, -1, -1));

        jLabel5.setText("Ingresar Dueño");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 14, -1, -1));

        jLabel6.setText("N_departamento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 246, -1, -1));

        rbtn_paga.setText("Paga");
        rbtn_paga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_pagaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_paga, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 298, 82, -1));

        rbtn_pendiente.setText("Pendiente");
        rbtn_pendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_pendienteActionPerformed(evt);
            }
        });
        getContentPane().add(rbtn_pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 298, -1, -1));

        txt_numero_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_depActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numero_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 242, 220, -1));

        jLabel7.setText("Estado Cuota");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 298, -1, 28));

        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 214, -1, -1));
        getContentPane().add(txt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 206, 220, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 430, 320));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 110, 30));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_pagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_pagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_pagaActionPerformed

    private void rbtn_pendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_pendienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_pendienteActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_numero_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero_depActionPerformed

    Dueño d=new Dueño();
 
    public void ingresarDueño(){

        String sql="Insert into alicuota Values("+txt_cedula.getText()+","
                +txt_nombre+", "+txt_edad.getText()+","+txt_sexo.getText()
                +","+txt_numero_dep.getText()+"true"+"); ";
        
        
        
        
  
    }
    
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
            java.util.logging.Logger.getLogger(Alicuota_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alicuota_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alicuota_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alicuota_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alicuota_Dueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtn_paga;
    private javax.swing.JRadioButton rbtn_pendiente;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero_dep;
    private javax.swing.JTextField txt_sexo;
    // End of variables declaration//GEN-END:variables
}
