package asociaciones.pantallas;

import asociaciones.entidades.Profesor;
import javax.swing.JOptionPane;

/**
 *
 * @author tokiro
 */
public class PantallaEditarProfe extends javax.swing.JFrame {

    private Profesor profesor;

    public PantallaEditarProfe(Profesor profesor) {
        initComponents();
        this.profesor = profesor;
    }

    public void guardarProfe(Profesor profesor) {
        profesor.setNombre(txtNomProf.getText());
        //PantallaProfe.jListPro.setText();
        JOptionPane.showMessageDialog(null, "Nombre Guardado");
        txtNomProf.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomPro = new javax.swing.JLabel();
        txtNomProf = new javax.swing.JTextField();
        btnGuardaPro = new javax.swing.JButton();
        btnCancelaPro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNomPro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomPro.setText("Nombre:");

        btnGuardaPro.setText("Guardar");
        btnGuardaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaProActionPerformed(evt);
            }
        });

        btnCancelaPro.setText("Cancelar");
        btnCancelaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaProActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[Nombre de Profesor]");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardaPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelaPro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomProf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomPro))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardaPro)
                    .addComponent(btnCancelaPro))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaProActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaProActionPerformed

    private void btnGuardaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaProActionPerformed
        //String a;
        guardarProfe(profesor);
        //PantallaProfe lista = new PantallaProfe();
        //a = profesor.getNombre();
        
        //lista.setVisible(true);
        //lista.mostrarProfe();
    }//GEN-LAST:event_btnGuardaProActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaEditarProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaEditarProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaEditarProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaEditarProfe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Profesor profe = new Profesor();
                new PantallaEditarProfe(profe).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelaPro;
    private javax.swing.JButton btnGuardaPro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNomPro;
    private javax.swing.JTextField txtNomProf;
    // End of variables declaration//GEN-END:variables
}
