package medicoFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        jTesp = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBnovo = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jLmedico = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jTnomeMedico = new javax.swing.JTextField();
        jBbuscarNome = new javax.swing.JButton();
        jLtodos = new javax.swing.JLabel();
        jBbuscarTodos = new javax.swing.JButton();
        jLcrm = new javax.swing.JLabel();
        jBbuscarCrm = new javax.swing.JButton();
        jTcrm = new javax.swing.JTextField();

        setClosable(true);

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

        jLnome.setText("Nome :");

        jBbuscarNome.setText("Buscar");
        jBbuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarNomeActionPerformed(evt);
            }
        });

        jLtodos.setText("Todos :");

        jBbuscarTodos.setText("Buscar");
        jBbuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarTodosActionPerformed(evt);
            }
        });

        jLcrm.setText("CRM :");

        jBbuscarCrm.setText("Buscar");
        jBbuscarCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarCrmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLmedico))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLnomeEsp)
                                        .addComponent(jLnome))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTnomeMedico)
                                        .addComponent(jTesp)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLcrm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTcrm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBbuscarCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLtodos)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(jBbuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBbuscarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLmedico)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTesp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLnomeEsp)
                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnome)
                    .addComponent(jBbuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcrm)
                    .addComponent(jLtodos)
                    .addComponent(jBbuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
    
    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        try {
            AddMedicoForm telaAdd = new AddMedicoForm();
            this.getDesktopPane().add(telaAdd);
            abrirFrameCentralizado(telaAdd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
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
                    JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        String esp = jTesp.getText();

        try {
            
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on m.crm = me.crm_medico left join especialidade e on me.especialidade_id = e.id_especialidade where e.nome like ? group by m.nome_medico");

            ps.setString(1, "%" + esp + "%");
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

    private void jBbuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarNomeActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        String nome = jTnomeMedico.getText();

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
            
            ps.close();
            rs.close();
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarNomeActionPerformed

    private void jBbuscarCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarCrmActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        Integer crm = Integer.parseInt(jTcrm.getText());

        if (jTcrm.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite um CRM válido.");
            return;
        }
        
        try {
            
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on me.crm_medico = m.crm left join especialidade e on me.especialidade_id = e.id_especialidade where m.crm = ? group by m.crm");

            ps.setInt(1, crm);
            rs = ps.executeQuery();

            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"),
                    rs.getInt("crm"),
                    rs.getString("especialidades"),
                    rs.getDouble("preco_consulta")
                }); 
            }
            
            ps.close();
            rs.close();
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarCrmActionPerformed

    private void jBbuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on m.crm = me.crm_medico left join especialidade e on me.especialidade_id = e.id_especialidade group by m.nome_medico");

            rs = ps.executeQuery();

            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"),
                    rs.getInt("crm"),
                    rs.getString("especialidades"),
                    rs.getDouble("preco_consulta")
                }); 
            }
            
            ps.close();
            rs.close();
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBbuscarCrm;
    private javax.swing.JButton jBbuscarNome;
    private javax.swing.JButton jBbuscarTodos;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBnovo;
    private javax.swing.JLabel jLcrm;
    private javax.swing.JLabel jLmedico;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnomeEsp;
    private javax.swing.JLabel jLtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcrm;
    private javax.swing.JTextField jTesp;
    private javax.swing.JTextField jTnomeMedico;
    // End of variables declaration//GEN-END:variables
}
