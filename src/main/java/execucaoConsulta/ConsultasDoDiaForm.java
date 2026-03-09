package execucaoConsulta;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBexecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLdata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jBfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLconsultas)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdata)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBfiltrar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBexecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
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
    
    private void jBfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfiltrarActionPerformed
        DefaultTableModel tabelaConsulta = (DefaultTableModel) jTable1.getModel();
        tabelaConsulta.setNumRows(0);
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select a.id, p.nome, a.id_crm, a.status_consulta from agenda_consulta a join paciente p "
                    + "on p.cpf = a.id_cpf where a.data_consulta = ? and a.status_consulta != 'Finalizada'");
            
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
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jBfiltrarActionPerformed

    private void jBexecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexecutarActionPerformed
        int linha = jTable1.getSelectedRow();
        Integer id = (Integer)jTable1.getValueAt(linha, 3);
        String nome = jTable1.getValueAt(linha, 0).toString();
        String contato = jTable1.getValueAt(linha, 1).toString();
        String sexo = jTable1.getValueAt(linha, 2).toString();
        
        if(linha != -1){
            try {
                Prontuario telaProntuario = new Prontuario();
                telaProntuario.dadosConsulta(id, nome, contato, sexo);
                abrirFrameCentralizado(telaProntuario);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasDoDiaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }//GEN-LAST:event_jBexecutarActionPerformed

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBexecutar;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBfiltrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLconsultas;
    private javax.swing.JLabel jLdata;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
