package asociaciones.pantallas;

import asociaciones.entidades.Curso;
import asociaciones.entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tokiro
 */
public class PantallaProfe extends javax.swing.JFrame {

    private Curso curso;
    private Profesor profesor;

    public PantallaProfe(Curso curso) {
        initComponents();
        this.curso = curso;
        //jListPro.setNombre(int.parse(profesor));
    }

    PantallaProfe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Profesor> buscar(String criterio) {
        return new ArrayList<>();
    }

    public void agregar(Profesor profesor) {
        Profesor[] profesores = curso.getProfesores();
        int tamaño = profesores.length;
        for (int i = 0; i < tamaño; i++) {
            if (profesores[i] != null
                    && !profesores[i].getNombre().isEmpty()) {
                profesores[i] = profesor;
                return;
            }

            if (profesores[i] == null) {
                profesores[i] = profesor;
                return;
            }
        }
    }
    public void mostrarProfe(Profesor profesor){
        
        //jListPro.add(profesor);
        //jListPro.add(String(profesor.getNombre()));
        //jListPro.setVisible(true);
    }

    public void eliminar(Profesor profesor) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregaPro = new javax.swing.JButton();
        btnEliminaPro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPro = new javax.swing.JList<String>();
        btnSalirProf = new javax.swing.JButton();
        txtBuscaProfe = new javax.swing.JTextField();
        btnBuscaProf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAgregaPro.setText("Agregar");
        btnAgregaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaProActionPerformed(evt);
            }
        });

        btnEliminaPro.setText("Eliminar");
        btnEliminaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListPro);

        btnSalirProf.setText("Salir");
        btnSalirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProfActionPerformed(evt);
            }
        });

        btnBuscaProf.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Profesores de: [ ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscaProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscaProf)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalirProf)
                                .addGap(81, 81, 81)
                                .addComponent(btnAgregaPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminaPro))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProf))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregaPro)
                    .addComponent(btnEliminaPro)
                    .addComponent(btnSalirProf))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaProActionPerformed

        Profesor profesor = new Profesor();
        PantallaEditarProfe EditProfe = new PantallaEditarProfe(profesor);
        EditProfe.setVisible(true);
    }//GEN-LAST:event_btnAgregaProActionPerformed

    private void btnEliminaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProActionPerformed

    }//GEN-LAST:event_btnEliminaProActionPerformed

    private void btnSalirProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProfActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirProfActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Curso curso = new Curso("", 0, "");
                new PantallaProfe(curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregaPro;
    private javax.swing.JButton btnBuscaProf;
    private javax.swing.JButton btnEliminaPro;
    private javax.swing.JButton btnSalirProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscaProfe;
    // End of variables declaration//GEN-END:variables
}
