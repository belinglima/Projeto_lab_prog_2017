package visao;

import javax.swing.ImageIcon;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
this.setIconImage(new ImageIcon("imagens/2.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jButtonEventos = new javax.swing.JButton();
        jButtonFaleConosco = new javax.swing.JButton();
        jButtonPlanos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelPlanodeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso Certycom");
        getContentPane().setLayout(null);

        jButtonLogin.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_green.png"))); // NOI18N
        jButtonLogin.setText("LOGIN / CADASTRO");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(140, 30, 190, 40);

        jButtonEventos.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButtonEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendar.png"))); // NOI18N
        jButtonEventos.setText("EVENTOS");
        jButtonEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEventos);
        jButtonEventos.setBounds(140, 80, 190, 37);

        jButtonFaleConosco.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButtonFaleConosco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telephone.png"))); // NOI18N
        jButtonFaleConosco.setText("FALE CONOSCO");
        jButtonFaleConosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFaleConoscoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFaleConosco);
        jButtonFaleConosco.setBounds(141, 420, 190, 37);

        jButtonPlanos.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jButtonPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculator_add.png"))); // NOI18N
        jButtonPlanos.setText("PLANOS");
        jButtonPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlanosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlanos);
        jButtonPlanos.setBounds(140, 130, 190, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 430, 50, 60);

        jLabelPlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabelPlanodeFundo);
        jLabelPlanodeFundo.setBounds(0, 0, 472, 494);

        setSize(new java.awt.Dimension(488, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Telalogin Login = new Telalogin();
        Login.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlanosActionPerformed
        Planos pla = new Planos();
        pla.setVisible(true);
    }//GEN-LAST:event_jButtonPlanosActionPerformed

    private void jButtonEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventosActionPerformed
        Eventos evento = new Eventos();
        evento.setVisible(true);
    }//GEN-LAST:event_jButtonEventosActionPerformed

    private void jButtonFaleConoscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFaleConoscoActionPerformed
      Contatos contato = new Contatos();
      contato.setVisible(true);
    }//GEN-LAST:event_jButtonFaleConoscoActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEventos;
    private javax.swing.JButton jButtonFaleConosco;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonPlanos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPlanodeFundo;
    // End of variables declaration//GEN-END:variables
}
