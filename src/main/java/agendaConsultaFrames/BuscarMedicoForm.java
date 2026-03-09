package agendaConsultaFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        jLcrm.setText("CRM");

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
                .addGap(52, 52, 52)
                .addComponent(jLcrm)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(jTcrm))
                .addContainerGap(57, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLcrm)
                            .addComponent(jTcrm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
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
        }
    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JLabel jLcrm;
    private javax.swing.JLabel jListaMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcrm;
    // End of variables declaration//GEN-END:variables
}
