package view;

import agendaConsultaFrames.AgendaConsultaMainForm;
import connector.ConexaoDB;
import especialidadeFrames.EspecialidadeMainForm;
import execucaoConsulta.ConsultasDoDiaForm;
import execucaoConsulta.HistoricoClinicoForm;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import medicoFrames.MedicoMainForm;
import pacienteFrames.PacienteMainForm;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        
        try {
            ConexaoDB.getConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
        }

        // Define o que acontece ao fechar a janela principal
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                ConexaoDB.fecharConexao(); // Fecha a conexão estática
                System.exit(0);
            }
        });
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
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
        jMatendimento = new javax.swing.JMenu();
        jMgerarProntuario = new javax.swing.JMenuItem();
        jMhistoricoClinico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setPreferredSize(new java.awt.Dimension(1054, 1103));

        jLabel1.setText("Sistema de Gestão de Clínica Médica");

        Desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(761, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(1027, Short.MAX_VALUE))
        );

        getContentPane().add(Desktop, java.awt.BorderLayout.CENTER);

        Itens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMarquivo.setText("Arquivo");

        jMajuda.setText("Ajuda");
        jMajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMajudaActionPerformed(evt);
            }
        });
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
        jMhistoricoClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMhistoricoClinicoActionPerformed(evt);
            }
        });
        jMatendimento.add(jMhistoricoClinico);

        Itens.add(jMatendimento);

        setJMenuBar(Itens);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirFrameCentralizado(javax.swing.JInternalFrame frame) { //função para centralizar os internalframes ao abrir
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
            e.getMessage();
        }
    }
    
    //abre a tela de gestão dos pacientes
    private void jMpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpacientesActionPerformed
        try {
            PacienteMainForm telaPaciente = new PacienteMainForm();
            Desktop.add(telaPaciente);
            abrirFrameCentralizado(telaPaciente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
    }//GEN-LAST:event_jMpacientesActionPerformed

    //abre a tela de gestão dos medicos
    private void jMmedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmedicosActionPerformed
        try {
            MedicoMainForm telaMedico = new MedicoMainForm();
            Desktop.add(telaMedico);
            abrirFrameCentralizado(telaMedico);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jMmedicosActionPerformed

    //abre a tela de gestão das especialidades
    private void jMespecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMespecialidadeActionPerformed
        try {
            EspecialidadeMainForm telaEspecialidade =  new EspecialidadeMainForm();
            abrirFrameCentralizado(telaEspecialidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jMespecialidadeActionPerformed

    //fecha o frame
    private void jMFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMFecharActionPerformed

    //abre a tela de gestão de consultas (agendar ou editar status)
    private void jMagendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagendarConsultaActionPerformed
        try {
            AgendaConsultaMainForm telaAgenda = new AgendaConsultaMainForm();
            abrirFrameCentralizado(telaAgenda);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jMagendarConsultaActionPerformed

    //abre a tela de gestão de execucao de consultas / prontuário
    private void jMgerarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMgerarProntuarioActionPerformed
        try {
            ConsultasDoDiaForm telaConsultas = new ConsultasDoDiaForm();
            abrirFrameCentralizado(telaConsultas);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jMgerarProntuarioActionPerformed

    private void jMajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMajudaActionPerformed
        
        AjudaForm telaAjuda = new AjudaForm();
        abrirFrameCentralizado(telaAjuda);
    }//GEN-LAST:event_jMajudaActionPerformed

    private void jMhistoricoClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMhistoricoClinicoActionPerformed
        
        try {
            HistoricoClinicoForm telaHistorico = new HistoricoClinicoForm();
            abrirFrameCentralizado(telaHistorico);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
        }
    }//GEN-LAST:event_jMhistoricoClinicoActionPerformed
 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMFechar;
    private javax.swing.JMenu jMagenda;
    private javax.swing.JMenuItem jMagendarConsulta;
    private javax.swing.JMenuItem jMajuda;
    private javax.swing.JMenu jMarquivo;
    private javax.swing.JMenu jMatendimento;
    private javax.swing.JMenuItem jMespecialidade;
    private javax.swing.JMenuItem jMgerarProntuario;
    private javax.swing.JMenuItem jMhistoricoClinico;
    private javax.swing.JMenuItem jMmedicos;
    private javax.swing.JMenuItem jMpacientes;
    private javax.swing.JMenu jMregistros;
    // End of variables declaration//GEN-END:variables
}
