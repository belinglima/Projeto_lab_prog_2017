package visao;

import javax.swing.JOptionPane;

public class Telalogin extends javax.swing.JFrame {

    BancoDeDados database;

    /**
     * Creates new form PortaADM
     */
    public Telalogin() {
        this.database = new BancoDeDados();
        database.configurar_connection("root", "", "porta");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entrar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelPlanodeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso Restrito! - Certycom");
        getContentPane().setLayout(null);

        Entrar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lock.png"))); // NOI18N
        Entrar.setText("ENTRAR");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(130, 300, 110, 40);

        Voltar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        Voltar.setText("VOLTAR");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(240, 300, 110, 40);

        Cadastrar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        Cadastrar.setText("CADASTRAR");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(170, 370, 130, 40);

        jLabelUsuario.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("USUÁRIO ");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(140, 150, 100, 20);

        jLabelSenha.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("SENHA");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(140, 210, 50, 14);

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario);
        Usuario.setBounds(140, 170, 190, 30);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(140, 230, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 430, 50, 60);

        jLabelPlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabelPlanodeFundo);
        jLabelPlanodeFundo.setBounds(0, 0, 470, 494);

        setSize(new java.awt.Dimension(487, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaPrincipal Voltar = new TelaPrincipal();
        Voltar.setVisible(true);
        dispose();

    }//GEN-LAST:event_VoltarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        CadastroAcesso cadastro = new CadastroAcesso();
        cadastro.setVisible(true);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

        DashboardUser tela = new DashboardUser();

        if (database.checarUsuario(Usuario.getText(), Password.getText())
                || Usuario.getText().equalsIgnoreCase("Admin") && Password.getText().equalsIgnoreCase("projetoporta")) {
            tela.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem Vindo!");
        } else {
          JOptionPane.showMessageDialog(null, "Acesso Negado!");
        }

    }//GEN-LAST:event_EntrarActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telalogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Entrar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPlanodeFundo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables
}
