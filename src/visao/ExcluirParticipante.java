/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia-Lima
 */
public class ExcluirParticipante extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirParticipante
     */
    public ExcluirParticipante() {
        initComponents();
        this.Atualizar.doClick(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atualizar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Participantes = new javax.swing.JList<>();
        Apagar = new javax.swing.JButton();
        IDParticipante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Atualizar.setText("Atualizar Lista");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar);
        Atualizar.setBounds(302, 450, 130, 25);

        Sair.setText("SAIR");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(160, 450, 140, 25);

        Participantes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Participantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Participantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 400, 220);

        Apagar.setText("APAGAR");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });
        getContentPane().add(Apagar);
        Apagar.setBounds(353, 410, 80, 30);

        IDParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDParticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(IDParticipante);
        IDParticipante.setBounds(110, 410, 240, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escolha o ID do Participante Para Apagar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 100, 370, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID =");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 410, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 470, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 500);

        setSize(new java.awt.Dimension(488, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
           BancoDeDados database = new BancoDeDados();
           database.configurar_connection("root","","porta");         
           
           if (database.removerParticipante(Integer.parseInt(IDParticipante.getText()))) {
               
               JOptionPane.showMessageDialog(null, "participante removido");
               this.Atualizar.doClick(); 
               Participantes.repaint();
               
           } else {
               
               JOptionPane.showMessageDialog(null, "não foi possível remover o participante");
               
           };
    }//GEN-LAST:event_ApagarActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
           BancoDeDados database = new BancoDeDados();
           database.configurar_connection("root","","porta");
           DefaultListModel dataModel = new DefaultListModel();
           
           String linha_dados = new String();
           
           try {
               
                ResultSet resultados = database.buscarParticipantes();
                
                while (resultados.next()) {
                    
                    linha_dados = String.valueOf(resultados.getString("id"));
                    linha_dados += " - ";
                    linha_dados += String.valueOf(resultados.getString("nome"));
                    linha_dados += " - ";
                    linha_dados += String.valueOf(resultados.getString("cpf"));
                    dataModel.addElement(linha_dados);
                    
                  
                    
                }
               
           } catch (SQLException exception) {
               
               
               System.out.println(exception.getMessage());
               
               System.out.println("Zikou");
               
           }
           
            Participantes.setModel(dataModel);        
            Participantes.repaint();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void IDParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDParticipanteActionPerformed
       Participantes.getSelectedIndex();
    }//GEN-LAST:event_IDParticipanteActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirParticipante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Atualizar;
    private javax.swing.JTextField IDParticipante;
    private javax.swing.JList<String> Participantes;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
