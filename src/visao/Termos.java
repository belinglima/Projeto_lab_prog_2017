/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Familia-Lima
 */
public class Termos extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Termos() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Termos = new javax.swing.JTextArea();
        Fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Termos de Utilização do sistema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 370, 50);

        Termos.setEditable(false);
        Termos.setColumns(20);
        Termos.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Termos.setRows(5);
        Termos.setText("Prezado Cliente,\nAo aceitar os termos de uso do sistema de horas complementares,\nvocê esta comcordando que qualquer alteração do sistema será, \nmediante pagamento e prévio agendamento com nossa equipe.\n \nA Equipe CERTYCOM não se responsabiliza por emissões invalidas\nde certificados.\n\nPara que possamos disponibilizar a Emissão de certificados. \nFavor entrar em contato, Atravez;\nTelefone e email Disponivel no ' menu ' Ajuda > Contato.\n\nCaso deseje ter mais de um acesso ao sistema entre em contato conosco.\nObrigado,\nEquipe CERTYCOM. \nwww.portalateral.com");
        jScrollPane1.setViewportView(Termos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 440, 250);

        Fechar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        Fechar.setForeground(new java.awt.Color(0, 0, 0));
        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(380, 20, 80, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 480, 390);

        setSize(new java.awt.Dimension(488, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
     dispose();
    }//GEN-LAST:event_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Termos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Termos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fechar;
    private javax.swing.JTextArea Termos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
