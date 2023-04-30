
package asociaciones.pantallas;

import asociaciones.entidades.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author tokiro
 */
public class PantallaEditarEstu extends javax.swing.JFrame {

    private Estudiante estudiante;

    
    public PantallaEditarEstu(Estudiante estudiante) {
        initComponents();
        this.estudiante = estudiante;
    }

    public void guardarEstu(Estudiante estudiante) {
        estudiante.setCodigo(txtCodEstu.getText());
        estudiante.setNombre(txtNomEstu.getText());
        JOptionPane.showMessageDialog(null, "Nombre Guardado");
        txtCodEstu.setText("");
        txtNomEstu.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodEstu = new javax.swing.JLabel();
        txtCodEstu = new javax.swing.JTextField();
        btnGuardaEstu = new javax.swing.JButton();
        btnCancelaEstu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNomEstu = new javax.swing.JLabel();
        txtNomEstu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodEstu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodEstu.setText("Código:");

        btnGuardaEstu.setText("Guardar");
        btnGuardaEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaEstuActionPerformed(evt);
            }
        });

        btnCancelaEstu.setText("Cancelar");
        btnCancelaEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaEstuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[Nombre de Estudiante]");
        jLabel2.setToolTipText("");

        lblNomEstu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomEstu.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodEstu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomEstu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardaEstu)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelaEstu)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodEstu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomEstu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardaEstu)
                    .addComponent(btnCancelaEstu))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelaEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaEstuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaEstuActionPerformed

    private void btnGuardaEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaEstuActionPerformed
        guardarEstu(estudiante);
    }//GEN-LAST:event_btnGuardaEstuActionPerformed

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
                Estudiante estudiante = new Estudiante();
                new PantallaEditarEstu(estudiante).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelaEstu;
    private javax.swing.JButton btnGuardaEstu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCodEstu;
    private javax.swing.JLabel lblNomEstu;
    private javax.swing.JTextField txtCodEstu;
    private javax.swing.JTextField txtNomEstu;
    // End of variables declaration//GEN-END:variables
}
