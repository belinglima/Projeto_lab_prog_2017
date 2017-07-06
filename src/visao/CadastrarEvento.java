/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class CadastrarEvento extends javax.swing.JFrame {

    /**
     * Creates new form Teste01
     */
    public CadastrarEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Usarname = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        Instituicao = new javax.swing.JTextField();
        Horas = new javax.swing.JTextField();
        Local = new javax.swing.JTextField();
        Evento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 494));
        getContentPane().setLayout(null);

        Sair.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Sair.setText("SAIR");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(240, 390, 110, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Evento:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 150, 14);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 90, 190, 14);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 270, 210, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Instituição:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 200, 200, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Local:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 330, 210, 14);

        jLabel12.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CPF:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 150, 210, 14);

        Salvar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Salvar.setText("SALVAR");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        getContentPane().add(Salvar);
        Salvar.setBounds(120, 390, 110, 40);
        getContentPane().add(Usarname);
        Usarname.setBounds(130, 110, 210, 30);

        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });
        getContentPane().add(CPF);
        CPF.setBounds(130, 170, 210, 30);
        getContentPane().add(Instituicao);
        Instituicao.setBounds(130, 230, 210, 30);
        getContentPane().add(Horas);
        Horas.setBounds(130, 290, 210, 30);
        getContentPane().add(Local);
        Local.setBounds(130, 350, 210, 30);

        Evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoActionPerformed(evt);
            }
        });
        getContentPane().add(Evento);
        Evento.setBounds(130, 49, 210, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 430, 50, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 480, 500);

        setSize(new java.awt.Dimension(488, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
    dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        BancoDeDados database = new BancoDeDados();
        database.configurar_connection("root", "", "porta");
        
        int user_id = database.usuarioID(Usarname.getText());
        
        if (user_id == 0){
            
            JOptionPane.showMessageDialog(null, "Usuários não encontrado");
            
        } else {
            
            
            if (database.eventoCadastrar(user_id, CPF.getText(), 
                                 Instituicao.getText(), Horas.getText(), 
                                 Local.getText(),
                                 Evento.getText())){
            
                JOptionPane.showMessageDialog(null, "Cadastro de evento realizado com sucesso!");
        
            
            } else {
            
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o evento");
            
            }
            
        }
       
    }//GEN-LAST:event_SalvarActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void EventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField Evento;
    private javax.swing.JTextField Horas;
    private javax.swing.JTextField Instituicao;
    private javax.swing.JTextField Local;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField Usarname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}