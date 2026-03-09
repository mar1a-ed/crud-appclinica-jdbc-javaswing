package agendaConsultaFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgendaConsultaMainForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public AgendaConsultaMainForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    public void abrirFrameCentralizado(javax.swing.JInternalFrame frame) {
        if (!frame.isDisplayable()) {
            this.getDesktopPane().add(frame);
        }

        try {
            frame.pack(); 

            int x = (this.getDesktopPane().getWidth() - frame.getWidth()) / 2;
            int y = (this.getDesktopPane().getHeight() - frame.getHeight()) / 2;

            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.setSelected(true); 
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }
    
    public void setPaciente(String nome, String cpf){
        jTpaciente.setText(nome);
        jTprocurarPaciente.setText(cpf);
    }
    
    public void setMedico(String nome, Integer crm){
        jTmedico.setText(nome);
        jTprocurarMedico.setText(crm.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLpaciente = new javax.swing.JLabel();
        jLmedico = new javax.swing.JLabel();
        jLstatus = new javax.swing.JLabel();
        jLdata = new javax.swing.JLabel();
        jLhorario = new javax.swing.JLabel();
        jTpaciente = new javax.swing.JTextField();
        jTmedico = new javax.swing.JTextField();
        jRagendada = new javax.swing.JRadioButton();
        jRfinalizada = new javax.swing.JRadioButton();
        jDateChooserData = new com.toedter.calendar.JDateChooser();
        jBsalvar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jComboBoxhorario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBprocurarPaciente = new javax.swing.JButton();
        jTprocurarPaciente = new javax.swing.JTextField();
        jBprocurarMedico = new javax.swing.JButton();
        jTprocurarMedico = new javax.swing.JTextField();

        jLpaciente.setText("Paciente :");

        jLmedico.setText("Medico :");

        jLstatus.setText("Status :");

        jLdata.setText("Data :");

        jLhorario.setText("Horário :");

        jTpaciente.setEditable(false);

        jTmedico.setEditable(false);

        buttonGroup1.add(jRagendada);
        jRagendada.setText("Agendada");
        jRagendada.setContentAreaFilled(false);
        jRagendada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jRfinalizada);
        jRfinalizada.setText("Finalizada");
        jRfinalizada.setToolTipText("");

        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jComboBoxhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08 : 00", "09 : 00", "10 : 00", "11 : 00", "13 : 00", "14 : 00", "15 : 00", "16 : 00", "17 : 00" }));

        jLabel1.setText("Agendar Consulta");

        jBprocurarPaciente.setText("Procurar");
        jBprocurarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprocurarPacienteActionPerformed(evt);
            }
        });

        jBprocurarMedico.setText("Procurar");
        jBprocurarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprocurarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLpaciente)
                            .addComponent(jLmedico)
                            .addComponent(jLstatus)
                            .addComponent(jLdata, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRagendada)
                                .addGap(18, 18, 18)
                                .addComponent(jRfinalizada)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTmedico, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(jTpaciente))
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBprocurarPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBprocurarMedico, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTprocurarMedico)
                                    .addComponent(jTprocurarPaciente))
                                .addGap(66, 66, 66))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLhorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBprocurarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTprocurarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLpaciente)
                        .addComponent(jTpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLmedico)
                    .addComponent(jTmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBprocurarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprocurarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLstatus)
                    .addComponent(jRagendada)
                    .addComponent(jRfinalizada))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLhorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBprocurarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprocurarPacienteActionPerformed
        try {
            BuscarPacienteForm telaPaciente = new BuscarPacienteForm(this);
            abrirFrameCentralizado(telaPaciente);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaConsultaMainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBprocurarPacienteActionPerformed

    private void jBprocurarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprocurarMedicoActionPerformed
        try {
            BuscarMedicoForm telaMedico = new BuscarMedicoForm(this);
            abrirFrameCentralizado(telaMedico);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaConsultaMainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBprocurarMedicoActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        PreparedStatement ps;
        
        try{
            ps = conn.prepareStatement("insert into agenda_consulta (id_cpf, id_crm, status_consulta, data_consulta) values (?, ?, ?, ?)");
            
            ps.setString(1, jTprocurarPaciente.getText());
            ps.setInt(2, Integer.parseInt(jTprocurarMedico.getText()));
            
            if(jRagendada.isSelected()){
                ps.setString(3, "Agendada");
            }else{
                ps.setString(3, "Finalizada");
            }
            
            Date data = jDateChooserData.getDate();
            ps.setDate(4, new java.sql.Date(data.getTime()));
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Consulta agendada com sucesso.");
            limpar();
            
            ps.close();
        }catch(SQLException e){
            
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    public void limpar(){
        jTpaciente.setText("");
        jTmedico.setText("");
        jTprocurarMedico.setText("");
        jTprocurarPaciente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBprocurarMedico;
    private javax.swing.JButton jBprocurarPaciente;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<String> jComboBoxhorario;
    private com.toedter.calendar.JDateChooser jDateChooserData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLdata;
    private javax.swing.JLabel jLhorario;
    private javax.swing.JLabel jLmedico;
    private javax.swing.JLabel jLpaciente;
    private javax.swing.JLabel jLstatus;
    private javax.swing.JRadioButton jRagendada;
    private javax.swing.JRadioButton jRfinalizada;
    private javax.swing.JTextField jTmedico;
    private javax.swing.JTextField jTpaciente;
    private javax.swing.JTextField jTprocurarMedico;
    private javax.swing.JTextField jTprocurarPaciente;
    // End of variables declaration//GEN-END:variables
}
