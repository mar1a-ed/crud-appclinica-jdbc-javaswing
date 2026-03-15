package agendaConsultaFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarMedicoForm extends javax.swing.JInternalFrame {

    private AgendaConsultaMainForm telaAgenda;
    
    Connection conn;
    
    public BuscarMedicoForm(AgendaConsultaMainForm telaAgenda) throws SQLException {
        initComponents();
        this.telaAgenda = telaAgenda;
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jListaMedico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLcrm = new javax.swing.JLabel();
        jTcrm = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBselecionar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jBbuscarNome = new javax.swing.JButton();
        jLespecialidade = new javax.swing.JLabel();
        jTesp = new javax.swing.JTextField();
        jBbuscarEsp = new javax.swing.JButton();
        jLtodos = new javax.swing.JLabel();
        jBbuscarTodos = new javax.swing.JButton();

        setClosable(true);

        jListaMedico.setText("Lista de Medicos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CRM", "Especialidade(s)", "Preço Consulta"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLcrm.setText("CRM :");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBselecionar.setText("Selecionar");
        jBselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselecionarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLnome.setText("Nome :");

        jBbuscarNome.setText("Buscar");
        jBbuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarNomeActionPerformed(evt);
            }
        });

        jLespecialidade.setText("Especialidade :");

        jBbuscarEsp.setText("Buscar");
        jBbuscarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarEspActionPerformed(evt);
            }
        });

        jLtodos.setText("Todos :");

        jBbuscarTodos.setText("Buscar");
        jBbuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLespecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLtodos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBbuscarEsp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTesp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBbuscarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLcrm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBbuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTcrm, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTnome))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jListaMedico)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jListaMedico)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcrm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcrm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLnome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBbuscarNome)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTesp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLespecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBbuscarEsp)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtodos)
                    .addComponent(jBbuscarTodos))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselecionarActionPerformed
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
        
            Integer crm = Integer.parseInt(jTable1.getValueAt(qtd_linha, 1).toString());
            String nome = jTable1.getValueAt(qtd_linha, 0).toString();
            
            telaAgenda.setMedico(nome, crm);
            this.dispose();
        }
    }//GEN-LAST:event_jBselecionarActionPerformed

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        Integer crm = Integer.parseInt(jTcrm.getText());
        
        try{   
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on m.crm = me.crm_medico left join especialidade e on me.especialidade_id = e.id_especialidade where m.crm like ? group by m.crm");
            
            ps.setString(1, "%" + crm + "%");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"), rs.getInt("crm"), rs.getString("especialidades"), rs.getDouble("preco_consulta")
                }); 
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBbuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarNomeActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       

        PreparedStatement ps;
        ResultSet rs;
        String nome = jTnome.getText();
    
        try {   
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades "
                    + "from medico m left join medico_especialidade me on m.crm = me.crm_medico "
                    + "left join especialidade e on me.especialidade_id = e.id_especialidade "
                    + "where m.nome_medico like ? group by m.crm");

            ps.setString(1, "%" + nome + "%");
            rs = ps.executeQuery();

            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"), rs.getInt("crm"), rs.getString("especialidades"), rs.getDouble("preco_consulta")
                }); 
            }

            ps.close();
            rs.close();

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar por nome: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarNomeActionPerformed

    private void jBbuscarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarEspActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       

        PreparedStatement ps;
        ResultSet rs;
        String esp = jTesp.getText();
    
        try {   
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades "
                    + "from medico m left join medico_especialidade me on m.crm = me.crm_medico "
                    + "left join especialidade e on me.especialidade_id = e.id_especialidade "
                    + "where e.nome like ? group by m.crm");

            ps.setString(1, "%" + esp + "%");
            rs = ps.executeQuery();

            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"), rs.getInt("crm"), rs.getString("especialidades"), rs.getDouble("preco_consulta")
                }); 
            }

            ps.close();
            rs.close();

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar por especialidade: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarEspActionPerformed

    private void jBbuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{   
            ps = conn.prepareStatement("select m.crm, m.nome_medico, m.preco_consulta, group_concat(e.nome separator ', ') as especialidades from medico m left join medico_especialidade me "
                    + "on m.crm = me.crm_medico left join especialidade e on me.especialidade_id = e.id_especialidade group by m.crm");
                        
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome_medico"), rs.getInt("crm"), rs.getString("especialidades"), rs.getDouble("preco_consulta")
                }); 
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBbuscarEsp;
    private javax.swing.JButton jBbuscarNome;
    private javax.swing.JButton jBbuscarTodos;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JLabel jLcrm;
    private javax.swing.JLabel jLespecialidade;
    private javax.swing.JLabel jListaMedico;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcrm;
    private javax.swing.JTextField jTesp;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables
}
