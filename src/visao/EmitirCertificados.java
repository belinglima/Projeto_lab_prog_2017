/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import modelo.CertificadoImprimir;
import modelo.MD5;
/**
 *
 * @author Familia-Lima
 */
public class EmitirCertificados extends javax.swing.JFrame {

    /**
     * Creates new form EmitirCertificados
     */
    public EmitirCertificados() {
        initComponents();
        Atualizar.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Participantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Eventos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Atualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Evento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Participante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Emitir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(Participantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 430, 100);

        jScrollPane2.setViewportView(Eventos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 190, 430, 110);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA DE PARTICIPANTES ATIVOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 420, 30);

        Atualizar.setText("ATUALIZAR");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Atualizar);
        Atualizar.setBounds(330, 430, 120, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTA DE EVENTOS DISPONIVEIS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 420, 30);
        getContentPane().add(Evento);
        Evento.setBounds(110, 380, 340, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMITIR CERTIFICADOS ->");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 310, 430, 30);
        getContentPane().add(Participante);
        Participante.setBounds(110, 350, 340, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EVENTO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 380, 80, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PARTICIPANTE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 350, 90, 30);

        Emitir.setText("EMITIR");
        Emitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmitirActionPerformed(evt);
            }
        });
        getContentPane().add(Emitir);
        Emitir.setBounds(110, 430, 100, 40);

        Sair.setText("SAIR");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(220, 430, 100, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 330, 430, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/porta.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 500);

        setSize(new java.awt.Dimension(488, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void EmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmitirActionPerformed
    
     CertificadoImprimir emitir = new CertificadoImprimir();
     
     try {
         
        MD5 MD5 = new MD5();
            
        int evento_id = Integer.parseInt(Evento.getText());
        int participante_id = Integer.parseInt(Participante.getText());
        
        BancoDeDados database = new BancoDeDados();
        
        
        database.configurar_connection("root", "", "porta");
        ResultSet resultadoParticipante = database.buscarParticipante(participante_id);
        ResultSet resultadoEvento = database.buscarEvento(evento_id);
        
        resultadoParticipante.first();
        resultadoEvento.first();
        
         System.out.println(resultadoParticipante.getString("nome"));
         System.out.println(resultadoEvento.getString("nome"));
         
         String evento = resultadoEvento.getString("nome");
         String participante = resultadoParticipante.getString("nome");
         String horas = resultadoEvento.getString("horas");
         String instituição = resultadoEvento.getString("instituicao");
         
         String md5_seed = evento + participante + horas + instituição;
         String md5_hash = MD5.getMD5(md5_seed);
         
         if (!database.checarCertificado(evento_id, participante_id)){
             
             database.emitirCertificado(evento_id, participante_id, md5_hash);
             
         };
         
         
         
         emitir.setAtributes(evento_id, participante_id, evento, participante, 
                             horas, instituição, md5_hash);
         
         emitir.setVisible(true);
         
     } catch (SQLException exception) {
         
         JOptionPane.showMessageDialog(null, "Não foi possivel gerar o certificado. Certifique que os IDs foram digitados corretamenta");
         System.out.println(exception.getMessage());         
         
     }
     
    }//GEN-LAST:event_EmitirActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        
        try {
            BancoDeDados database = new BancoDeDados();
            database.configurar_connection("root", "", "porta");
        
            ResultSet eventos = database.buscarEventos();
            ResultSet participantes = database.buscarParticipantes();
            DefaultListModel dataModelEventos = new DefaultListModel();
            DefaultListModel dataModelParticipantes = new DefaultListModel();
            String lineData = new String();
            
            while (participantes.next()){
                
                lineData = participantes.getString("id");
                lineData += " - ";
                lineData += participantes.getString("nome");
                dataModelParticipantes.addElement(lineData);               
                
            };
            
            Participantes.setModel(dataModelParticipantes);
            Participantes.repaint();
            
             while (eventos.next()){
                
                lineData = eventos.getString("id");
                lineData += " - ";
                lineData += eventos.getString("nome");
                dataModelEventos.addElement(lineData);
             
            };
            
            Eventos.setModel(dataModelEventos);
            Eventos.repaint();
             
        } catch (SQLException exception){
            
            System.out.println(exception.getMessage());
            
        }
         
         
        
    }//GEN-LAST:event_AtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirCertificados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmitirCertificados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Emitir;
    private javax.swing.JTextField Evento;
    private javax.swing.JList<String> Eventos;
    private javax.swing.JTextField Participante;
    private javax.swing.JList<String> Participantes;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
