package view;

import connector.ConexaoDB;
import especialidadeFrames.EspecialidadeMainForm;
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

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
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
        jMagenda.add(jMagendarConsulta);

        jMgradeHoraria.setText("Ver Grade Horária");
        jMagenda.add(jMgradeHoraria);

        Itens.add(jMagenda);

        jMatendimento.setText("Atendimento");

        jMgerarProntuario.setText("Gerar Prontuário");
        jMatendimento.add(jMgerarProntuario);

        jMhistoricoClinico.setText("Histórico Clínico ");
        jMatendimento.add(jMhistoricoClinico);

        Itens.add(jMatendimento);

        setJMenuBar(Itens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpacientesActionPerformed
        try {
            PacienteMainForm telaPaciente = new PacienteMainForm();
            Desktop.add(telaPaciente);
            telaPaciente.setVisible(rootPaneCheckingEnabled);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMpacientesActionPerformed

    private void jMmedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmedicosActionPerformed
        try {
            MedicoMainForm telaMedico = new MedicoMainForm();
            Desktop.add(telaMedico);
            telaMedico.setVisible(rootPaneCheckingEnabled);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMmedicosActionPerformed

    private void jMespecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMespecialidadeActionPerformed
        try {
            EspecialidadeMainForm telaEspecialidade =  new EspecialidadeMainForm();
            Desktop.add(telaEspecialidade);
            telaEspecialidade.setVisible(rootPaneCheckingEnabled);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMespecialidadeActionPerformed

    private void jMFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMFecharActionPerformed

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
