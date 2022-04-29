
package examen;


import baseConexion.ConexionPG;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Dueño;
import org.postgresql.util.Base64;

/**
 *
 * @author willi
 */

public class Reporte extends javax.swing.JFrame {
 List<Dueño> list = new ArrayList<>();
 
   ConexionPG conectar=new ConexionPG();
    public Reporte() {
        initComponents();
        list = mostrardatos();
        cargarLista(list);
    }

   public List<Dueño> mostrardatos() {
        try {
            List<Dueño> lista = new ArrayList<Dueño>();
            String sql = "select * from dueño ";
            ResultSet rs = conectar.consulta(sql);
            while (rs.next()) {
                Dueño m = new Dueño();
                m.setCedula(rs.getString("cedula"));
                m.setNombre(rs.getString("nombre"));
                m.setEdad(rs.getInt("edad"));
                m.setSexo(rs.getString("sexo"));
                m.setDepartamento(rs.getInt("n_departamento"));
                if (rs.getBoolean("estado")==true) {
                    m.setEstado(("pagado"));
                }else {
                     m.setEstado(("debe"));
                }
                
                lista.add(m);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
   
   
      public void cargarLista(List<Dueño> lista) {
          System.out.println("aaaa");
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) tabla.getModel();
        tblModel.setNumRows(0);
        //List<Dueño> lista = mostrardatos();
        lista.stream().forEach(r -> {
            String[] compu = {r.getCedula(), r.getNombre(), String.valueOf(r.getEdad()),
                 r.getSexo(), String.valueOf(r.getDepartamento()), r.getEstado()};
            tblModel.addRow(compu);
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Edad", "Sexo", "Departamento", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
