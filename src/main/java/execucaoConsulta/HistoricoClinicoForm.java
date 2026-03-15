package execucaoConsulta;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistoricoClinicoForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public HistoricoClinicoForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBvoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBbuscarCpf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBbuscarTodos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBvisualizarDados = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        jLabel1.setText("Histórico Clínico");

        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Paciente", "Data Consulta", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBbuscarCpf.setText("Buscar");
        jBbuscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarCpfActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        jBbuscarTodos.setText("Buscar");
        jBbuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarTodosActionPerformed(evt);
            }
        });

        jLabel3.setText("Todos:");

        jBvisualizarDados.setText("Visualizar Dados");
        jBvisualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisualizarDadosActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(327, 327, 327))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscarCpf))
                    .addComponent(jBbuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBvisualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBbuscarCpf)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbuscarTodos)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBvisualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
    
    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBbuscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarCpfActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);
        
        PreparedStatement ps;
        ResultSet rs;
        
        String cpf = jFormattedTextField1.getText();
        
        try{
            ps = conn.prepareStatement("select p.nome, a.data_consulta, a.id from paciente p join agenda_consulta a on p.cpf = a.id_cpf"
                    + " where a.id_cpf = ? and a.status_consulta = 'Finalizada' order by a.data_consulta desc");
            
            ps.setString(1, cpf);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome"), rs.getString("data_consulta"), rs.getInt("id")
                });
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBbuscarCpfActionPerformed

    private void jBbuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);
        
        PreparedStatement ps;
        ResultSet rs;
                
        try{
            ps = conn.prepareStatement("select p.nome, a.data_consulta, a.id from paciente p join agenda_consulta a on p.cpf = a.id_cpf"
                    + " where a.status_consulta = 'Finalizada' order by a.data_consulta desc");
                        
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome"), rs.getString("data_consulta"), rs.getInt("id")
                });
            }
            
            ps.close();
            rs.close();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
    }//GEN-LAST:event_jBbuscarTodosActionPerformed

    private void jBvisualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisualizarDadosActionPerformed
        
        int linha = jTable1.getSelectedRow();
        if (linha != -1) {
            int idConsulta = (int) jTable1.getValueAt(linha, 2); // Pega o ID da coluna oculta
        
            try {
                PacienteHistoricoForm telaHistorico = new PacienteHistoricoForm();
                telaHistorico.selectDados(idConsulta);
                abrirFrameCentralizado(telaHistorico);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBvisualizarDadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarCpf;
    private javax.swing.JButton jBbuscarTodos;
    private javax.swing.JButton jBvisualizarDados;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
