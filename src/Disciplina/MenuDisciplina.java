
package Disciplina;

/**
 *
 * @author Ighorpm
 */
public class MenuDisciplina extends javax.swing.JFrame {

    public MenuDisciplina() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonToLista = new javax.swing.JButton();
        jButtonToUpd = new javax.swing.JButton();
        jButtonToCada = new javax.swing.JButton();
        jButtonToRem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonToLista.setText("Listar Disciplinas");
        jButtonToLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToListaActionPerformed(evt);
            }
        });

        jButtonToUpd.setText("Alterar Disciplinas");
        jButtonToUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToUpdActionPerformed(evt);
            }
        });

        jButtonToCada.setText("Cadastrar Disciplinas");
        jButtonToCada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToCadaActionPerformed(evt);
            }
        });

        jButtonToRem.setText("Remover Disciplinas");
        jButtonToRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToRemActionPerformed(evt);
            }
        });

        jButton5.setText("Fechar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Banco de Disciplinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonToLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonToCada, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(jButtonToUpd, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(jButtonToRem, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonToLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonToCada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonToUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonToRem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// OBJETIVO: Método por fechar o programa
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed
// OBJETIVO: Métodos responsáveis por abrir a janela de listagem
    private void jButtonToListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToListaActionPerformed
        ListaDisciplina lista = new ListaDisciplina();
        lista.setVisible(true);
    }//GEN-LAST:event_jButtonToListaActionPerformed
// OBJETIVO: Método responsável por abrir a janela de cadastro
    private void jButtonToCadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToCadaActionPerformed
        CadastroDisciplina cadastro = new CadastroDisciplina();
                cadastro.setVisible(true);
    }//GEN-LAST:event_jButtonToCadaActionPerformed
// OBJETIVO: Método responsável por abrir a janela de update
    private void jButtonToUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToUpdActionPerformed
       AlterarDisciplina alterar = new AlterarDisciplina();
        alterar.setVisible(true);
    }//GEN-LAST:event_jButtonToUpdActionPerformed
// OBJETIVO: Método reponsável por abrir a janela de delete
    private void jButtonToRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToRemActionPerformed
        RemoverDisciplina remover = new RemoverDisciplina();
        remover.setVisible(true);
    }//GEN-LAST:event_jButtonToRemActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonToCada;
    private javax.swing.JButton jButtonToLista;
    private javax.swing.JButton jButtonToRem;
    private javax.swing.JButton jButtonToUpd;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
