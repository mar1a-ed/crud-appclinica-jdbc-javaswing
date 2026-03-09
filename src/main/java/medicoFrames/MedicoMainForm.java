package medicoFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoMainForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public MedicoMainForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnomeEsp = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBnovo = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jLmedico = new javax.swing.JLabel();

        jLnomeEsp.setText("Especialidade :");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CRM", "Especialidade", "Preço Consulta"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLmedico.setText("Medicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(161, 161, 161)
                            .addComponent(jLnomeEsp)
                            .addGap(18, 18, 18)
                            .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLmedico)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLmedico)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnomeEsp)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
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
            e.printStackTrace();
        }
    }
    
    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        try {
            AddMedicoForm telaAdd = new AddMedicoForm();
            this.getDesktopPane().add(telaAdd);
            abrirFrameCentralizado(telaAdd);
        } catch (SQLException ex) {
            Logger.getLogger(MedicoMainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
        
            Integer crm = Integer.parseInt(jTable1.getValueAt(qtd_linha, 1).toString());
        
            try {
                EditarMedicoForm telaAtualizar = new EditarMedicoForm();
                telaAtualizar.selectDados(crm);
                abrirFrameCentralizado(telaAtualizar);
            } catch (SQLException ex) {
                Logger.getLogger(MedicoMainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        PreparedStatement ps;
        
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Atenção! Deseja excluir este medico?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(confirmacao == JOptionPane.YES_OPTION) {
                Integer crm = Integer.parseInt(jTable1.getValueAt(qtd_linha, 1).toString());

                try{
                    ps = conn.prepareStatement("delete from medico where crm = ?");

                    ps.setInt(1, crm);

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(rootPane, "Medico removido com sucesso.");
                    jBbuscarActionPerformed(evt);
                    
                    ps.close();
                } catch (SQLException ex) {

                }
            }
        }
        
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        String nome = jTnome.getText();

        try {
            
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on m.crm = me.crm_medico left join especialidade e on me.especialidade_id = e.id_especialidade where m.nome_medico like ? group by m.crm");

            ps.setString(1, "%" + nome + "%");
            rs = ps.executeQuery();

            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"),
                    rs.getInt("crm"),
                    rs.getString("especialidades"),
                    rs.getDouble("preco_consulta")
                }); 
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage());
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBnovo;
    private javax.swing.JLabel jLmedico;
    private javax.swing.JLabel jLnomeEsp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables
}
