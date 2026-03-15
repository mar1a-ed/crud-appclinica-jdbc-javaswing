package execucaoConsulta;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultasDoDiaForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public ConsultasDoDiaForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLconsultas = new javax.swing.JLabel();
        jBexecutar = new javax.swing.JButton();
        jLdata = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jBfiltrar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jLtodos = new javax.swing.JLabel();
        jBbuscarTodos = new javax.swing.JButton();
        jLpaciente = new javax.swing.JLabel();
        jTpaciente = new javax.swing.JTextField();
        jBfiltrarPorPaciente = new javax.swing.JButton();
        jLmedico = new javax.swing.JLabel();
        jTmedico = new javax.swing.JTextField();
        jBfiltrarPorMedico = new javax.swing.JButton();
        jBcancelarConsulta = new javax.swing.JButton();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Medico", "Status Consulta", "Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLconsultas.setText("Lista de Consultas");

        jBexecutar.setText("Executar");
        jBexecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexecutarActionPerformed(evt);
            }
        });

        jLdata.setText("Data");

        jBfiltrar.setText("Filtrar");
        jBfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfiltrarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLtodos.setText("Todos :");

        jBbuscarTodos.setText("Buscar");
        jBbuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarTodosActionPerformed(evt);
            }
        });

        jLpaciente.setText("Paciente :");

        jBfiltrarPorPaciente.setText("Filtrar");
        jBfiltrarPorPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfiltrarPorPacienteActionPerformed(evt);
            }
        });

        jLmedico.setText("Medico :");

        jBfiltrarPorMedico.setText("Filtrar");
        jBfiltrarPorMedico.setToolTipText("");
        jBfiltrarPorMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfiltrarPorMedicoActionPerformed(evt);
            }
        });

        jBcancelarConsulta.setText("Cancelar Consulta");
        jBcancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLconsultas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBexecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jBcancelarConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLpaciente)
                                            .addComponent(jLtodos))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jBfiltrarPorPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTpaciente)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jBbuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 4, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLmedico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBfiltrarPorMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTmedico)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLdata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLconsultas)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLdata)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBfiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLpaciente)
                            .addComponent(jTpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBfiltrarPorPaciente)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLmedico)
                            .addComponent(jTmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBfiltrarPorMedico)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBexecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBcancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBbuscarTodos)
                        .addComponent(jLtodos)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            e.getMessage();
        }
    }
    
    private void jBfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarActionPerformed
        DefaultTableModel tabelaConsulta = (DefaultTableModel) jTable1.getModel();
        tabelaConsulta.setNumRows(0);
        PreparedStatement ps;
        ResultSet rs;
        
        if(jDateChooser1.getDate() != null){
            try{
                ps = conn.prepareStatement("select a.id, p.nome, p.telefone, p.sexo, a.id_crm, a.status_consulta"
                        + " from agenda_consulta a join paciente p on p.cpf = a.id_cpf"
                        + " where date(a.data_consulta) = ? and a.status_consulta != 'Finalizada' and a.status_consulta != 'Cancelada'");


                Date data = jDateChooser1.getDate();
                ps.setDate(1, new java.sql.Date(data.getTime()));

                rs = ps.executeQuery();

                while(rs.next()){
                    tabelaConsulta.addRow(new Object[]{
                        rs.getString("nome"), rs.getInt("id_crm"), rs.getString("status_consulta"), rs.getInt("id")
                    });
                }

                ps.close();
                rs.close();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
        
        
    }//GEN-LAST:event_jBfiltrarActionPerformed

    private void jBexecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexecutarActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        int linha = jTable1.getSelectedRow();
        Integer id = (Integer)jTable1.getValueAt(linha, 3);
        String nome = jTable1.getValueAt(linha, 0).toString();
        String contato = jTable1.getValueAt(linha, 1).toString();
        String sexo = null;
        
        if(linha != -1){
            try {
                ps = conn.prepareStatement("select * from paciente where nome = ?");
                
                ps.setString(1,nome);
                
                rs = ps.executeQuery();
                
                if(rs.next()){
                    sexo = rs.getString("sexo");
                }
                
                Prontuario telaProntuario = new Prontuario();
                telaProntuario.dadosConsulta(id, nome, contato, sexo);
                abrirFrameCentralizado(telaProntuario);
                this.dispose();
                
                ps.close();
                rs.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
            }
        
        }
        
    }//GEN-LAST:event_jBexecutarActionPerformed

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBfiltrarPorPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarPorPacienteActionPerformed
       
        DefaultTableModel tabelaConsulta = (DefaultTableModel) jTable1.getModel();
        tabelaConsulta.setNumRows(0);
        PreparedStatement ps;
        ResultSet rs;
        
        if(jTpaciente.getText() != null){
            try{
                ps = conn.prepareStatement("select a.id, p.nome, p.telefone, p.sexo, a.id_crm, a.status_consulta"
                        + " from agenda_consulta a join paciente p on p.cpf = a.id_cpf"
                        + " where p.nome like ? and a.status_consulta != 'Finalizada' and a.status_consulta != 'Cancelada'");

                ps.setString(1, "%" + jTpaciente.getText() + "%");

                rs = ps.executeQuery();

                while(rs.next()){
                    tabelaConsulta.addRow(new Object[]{
                        rs.getString("nome"), rs.getInt("id_crm"), rs.getString("status_consulta"), rs.getInt("id")
                    });
                }

                ps.close();
                rs.close();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBfiltrarPorPacienteActionPerformed

    private void jBfiltrarPorMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarPorMedicoActionPerformed
      DefaultTableModel tabelaConsulta = (DefaultTableModel) jTable1.getModel();
        tabelaConsulta.setNumRows(0);
        PreparedStatement ps;
        ResultSet rs;
        
        if(jTmedico.getText() != null){
            try{
                ps = conn.prepareStatement("select a.id, p.nome, p.telefone, p.sexo, a.id_crm, a.status_consulta"
                        + " from agenda_consulta a join paciente p on p.cpf = a.id_cpf"
                        + " join medico m on m.crm = a.id_crm where m.nome_medico like ? and a.status_consulta != 'Finalizada' and a.status_consulta != 'Cancelada'");

                ps.setString(1, "%" + jTmedico.getText() + "%");

                rs = ps.executeQuery();

                while(rs.next()){
                    tabelaConsulta.addRow(new Object[]{
                        rs.getString("nome"), rs.getInt("id_crm"), rs.getString("status_consulta"), rs.getInt("id")
                    });
                }

                ps.close();
                rs.close();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jBfiltrarPorMedicoActionPerformed

    private void jBbuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosActionPerformed
        
        DefaultTableModel tabelaConsulta = (DefaultTableModel) jTable1.getModel();
        tabelaConsulta.setNumRows(0);
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select a.id, p.nome, p.telefone, p.sexo, a.id_crm, a.status_consulta"
                    + " from agenda_consulta a join paciente p on p.cpf = a.id_cpf"
                    + " where a.status_consulta != 'Finalizada' and a.status_consulta != 'Cancelada'");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaConsulta.addRow(new Object[]{
                    rs.getString("nome"), rs.getInt("id_crm"), rs.getString("status_consulta"), rs.getInt("id")
                });
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
    }//GEN-LAST:event_jBbuscarTodosActionPerformed

    private void jBcancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarConsultaActionPerformed
        
        PreparedStatement ps;
        ResultSet rs;
        int linha = jTable1.getSelectedRow();
                
        if(linha != -1){
            try {
                ps = conn.prepareStatement("update agenda_consulta set status_consulta = 'Cancelada' where id = ?");
                
                ps.setInt(1, (int) jTable1.getValueAt(linha, 3));
                                
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane, "Consulta cancelada com sucesso.");
                
                ps.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
            }
        
        }
    }//GEN-LAST:event_jBcancelarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarTodos;
    private javax.swing.JButton jBcancelarConsulta;
    private javax.swing.JButton jBexecutar;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBfiltrar;
    private javax.swing.JButton jBfiltrarPorMedico;
    private javax.swing.JButton jBfiltrarPorPaciente;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLconsultas;
    private javax.swing.JLabel jLdata;
    private javax.swing.JLabel jLmedico;
    private javax.swing.JLabel jLpaciente;
    private javax.swing.JLabel jLtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTmedico;
    private javax.swing.JTextField jTpaciente;
    // End of variables declaration//GEN-END:variables
}
