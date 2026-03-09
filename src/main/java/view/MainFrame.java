package view;

import agendaConsultaFrames.AgendaConsultaMainForm;
import connector.ConexaoDB;
import especialidadeFrames.EspecialidadeMainForm;
import execucaoConsulta.ConsultasDoDiaForm;
import execucaoConsulta.Prontuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import medicoFrames.MedicoMainForm;
import pacienteFrames.PacienteMainForm;

public class MainFrame extends javax.swing.JFrame {

    private static Connection conn;
    
    public MainFrame() {
        initComponents();
        try {
            conn = ConexaoDB.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados.");
        }
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        Itens = new javax.swing.JMenuBar();
        jMarquivo = new javax.swing.JMenu();
        jMajuda = new javax.swing.JMenuItem();
        jMFechar = new javax.swing.JMenuItem();
        jMregistros = new javax.swing.JMenu();
        jMpacientes = new javax.swing.JMenuItem();
        jMmedicos = new javax.swing.JMenuItem();
        jMespecialidade = new javax.swing.JMenuItem();
        jMagenda = new javax.swing.JMenu();
        jMagendarConsulta = new javax.swing.JMenuItem();
        jMgradeHoraria = new javax.swing.JMenuItem();
        jMatendimento = new javax.swing.JMenu();
        jMgerarProntuario = new javax.swing.JMenuItem();
        jMhistoricoClinico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setPreferredSize(new java.awt.Dimension(1200, 806));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        Itens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMarquivo.setText("Arquivo");

        jMajuda.setText("Ajuda");
        jMarquivo.add(jMajuda);

        jMFechar.setText("Fechar");
        jMFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFecharActionPerformed(evt);
            }
        });
        jMarquivo.add(jMFechar);

        Itens.add(jMarquivo);

        jMregistros.setText("Registros");

        jMpacientes.setText("Pacientes");
        jMpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpacientesActionPerformed(evt);
            }
        });
        jMregistros.add(jMpacientes);

        jMmedicos.setText("Medicos");
        jMmedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmedicosActionPerformed(evt);
            }
        });
        jMregistros.add(jMmedicos);

        jMespecialidade.setText("Especialidade");
        jMespecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMespecialidadeActionPerformed(evt);
            }
        });
        jMregistros.add(jMespecialidade);

        Itens.add(jMregistros);

        jMagenda.setText("Agenda");

        jMagendarConsulta.setText("Agendar Consulta");
        jMagendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMagendarConsultaActionPerformed(evt);
            }
        });
        jMagenda.add(jMagendarConsulta);

        jMgradeHoraria.setText("Ver Grade Horária");
        jMagenda.add(jMgradeHoraria);

        Itens.add(jMagenda);

        jMatendimento.setText("Atendimento");

        jMgerarProntuario.setText("Gerar Prontuário");
        jMgerarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMgerarProntuarioActionPerformed(evt);
            }
        });
        jMatendimento.add(jMgerarProntuario);

        jMhistoricoClinico.setText("Histórico Clínico ");
        jMatendimento.add(jMhistoricoClinico);

        Itens.add(jMatendimento);

        setJMenuBar(Itens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirFrameCentralizado(javax.swing.JInternalFrame frame) {
        if (!frame.isDisplayable()) {
            Desktop.add(frame);
        }

        try {
            frame.pack(); 

            int x = (Desktop.getWidth() - frame.getWidth()) / 2;
            int y = (Desktop.getHeight() - frame.getHeight()) / 2;

            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.setSelected(true); 
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }
    
    private void jMpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpacientesActionPerformed
        try {
            PacienteMainForm telaPaciente = new PacienteMainForm();
            Desktop.add(telaPaciente);
            abrirFrameCentralizado(telaPaciente);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMpacientesActionPerformed

    private void jMmedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmedicosActionPerformed
        try {
            MedicoMainForm telaMedico = new MedicoMainForm();
            Desktop.add(telaMedico);
            abrirFrameCentralizado(telaMedico);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMmedicosActionPerformed

    private void jMespecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMespecialidadeActionPerformed
        try {
            EspecialidadeMainForm telaEspecialidade =  new EspecialidadeMainForm();
            abrirFrameCentralizado(telaEspecialidade);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMespecialidadeActionPerformed

    private void jMFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMFecharActionPerformed

    private void jMagendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagendarConsultaActionPerformed
        try {
            AgendaConsultaMainForm telaAgenda = new AgendaConsultaMainForm();
            abrirFrameCentralizado(telaAgenda);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMagendarConsultaActionPerformed

    private void jMgerarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMgerarProntuarioActionPerformed
        try {
            ConsultasDoDiaForm telaConsultas = new ConsultasDoDiaForm();
            abrirFrameCentralizado(telaConsultas);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMgerarProntuarioActionPerformed

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {             
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Itens;
    private javax.swing.JMenuItem jMFechar;
    private javax.swing.JMenu jMagenda;
    private javax.swing.JMenuItem jMagendarConsulta;
    private javax.swing.JMenuItem jMajuda;
    private javax.swing.JMenu jMarquivo;
    private javax.swing.JMenu jMatendimento;
    private javax.swing.JMenuItem jMespecialidade;
    private javax.swing.JMenuItem jMgerarProntuario;
    private javax.swing.JMenuItem jMgradeHoraria;
    private javax.swing.JMenuItem jMhistoricoClinico;
    private javax.swing.JMenuItem jMmedicos;
    private javax.swing.JMenuItem jMpacientes;
    private javax.swing.JMenu jMregistros;
    // End of variables declaration//GEN-END:variables
}
