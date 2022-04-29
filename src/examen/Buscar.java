package examen;

import baseConexion.ConexionPG;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Dueño;

public class Buscar extends javax.swing.JFrame {

    public Buscar() {
        initComponents();
    }
    ConexionPG conectar = new ConexionPG();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_getCedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        txt_getCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_getCedulaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_getCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txt_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_getCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_getCedula.equals("") && txt_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese datos");
        } else if (""!=txt_getCedula.getText() && txt_nombre.getText().equals("")) {
            mostrardatos(txt_getCedula.getText());
            System.out.println("aaaaaaaaaaaaaaaa");
        } else if(""!=txt_nombre.getText() && txt_getCedula.getText().equals("")) {
            System.out.println("bbbbbbbbbbbbbbbbbbbb");
            mostrardatos(txt_nombre.getText());
        }
        
     


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_getCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_getCedulaActionPerformed

    }//GEN-LAST:event_txt_getCedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Menu m = new Menu();
        this.setVisible(false);
        m.setVisible(true);
         this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrardatos(String buscar) {
        try {
            List<Dueño> lista = new ArrayList<Dueño>();
            String sql = "select * from dueño where UPPER(cedula)= UPPER('" + buscar + "') or UPPER( nombre) = UPPER('" + buscar + "') ;";
            ResultSet rs = conectar.consulta(sql);
            while (rs.next()) {
                Dueño m = new Dueño();
                m.setCedula(rs.getString("cedula"));
                m.setNombre(rs.getString("nombre"));
                m.setEdad(rs.getInt("edad"));
                m.setSexo(rs.getString("sexo"));
                m.setDepartamento(rs.getInt("n_departamento"));
                if (rs.getBoolean("estado") == true) {
                    m.setEstado(("pagado"));
                } else {
                    m.setEstado(("debe"));
                }

                lista.add(m);
            }
            Reporte r=new Reporte(lista);
            r.setVisible(true);
               this.dispose();
            
            rs.close();
           
        } catch (Exception e) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, e);
          
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_getCedula;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
