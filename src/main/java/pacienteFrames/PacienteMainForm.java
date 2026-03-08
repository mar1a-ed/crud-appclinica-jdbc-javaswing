package pacienteFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteMainForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public PacienteMainForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBfechar = new javax.swing.JButton();
        jLcpf = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Data de Nascimento", "Cpf", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLcpf.setText("CPF : ");

        jBbuscar.setText("Buscar");
        jBbuscar.setToolTipText("");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLcpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jBfechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLcpf)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        AddPacienteForm telaAdd = new AddPacienteForm();
        this.getDesktopPane().add(telaAdd);
        telaAdd.setVisible(true);
        
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
        
            String cpf = jTable1.getValueAt(qtd_linha, 4).toString();
            
            try {
                AtualizarPacienteForm telaAtualizar = new AtualizarPacienteForm();
                this.getDesktopPane().add(telaAtualizar);               
                telaAtualizar.selectDados(cpf);                
                telaAtualizar.setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        String string = jTcpf.getText();
        
        try{   
            ps = conn.prepareStatement("select * from paciente where nome like ? or cpf like ?");
            
            ps.setString(1, "%" + string + "%");
            ps.setString(2, "%" + string + "%");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome"), rs.getString("email"), rs.getString("telefone"), rs.getDate("data_nasc"), rs.getString("cpf"), rs.getString("sexo")
                }); 
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        PreparedStatement ps;
        
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Atenção! Deseja excluir este paciente?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(confirmacao == JOptionPane.YES_OPTION) {
                String cpf = jTable1.getValueAt(qtd_linha, 4).toString();

                try{
                    ps = conn.prepareStatement("delete from paciente where cpf = ?");

                    ps.setString(1, cpf);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Paciente removido com sucesso.");
                    jBbuscarActionPerformed(evt);
                } catch (SQLException ex) {

                }
            }
        }
        
    }//GEN-LAST:event_jBexcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBnovo;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcpf;
    // End of variables declaration//GEN-END:variables
}
