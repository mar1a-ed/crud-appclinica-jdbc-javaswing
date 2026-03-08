package medicoFrames;

import connector.ConexaoDB;
import entities.Especialidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditarMedicoForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    private javax.swing.DefaultListModel<String> listModel = new javax.swing.DefaultListModel<>();

    public EditarMedicoForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
        comboBoxEspecialidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnome = new javax.swing.JLabel();
        jLcrm = new javax.swing.JLabel();
        jLespecialidade = new javax.swing.JLabel();
        jLpreco = new javax.swing.JLabel();
        jTcrm = new javax.swing.JTextField();
        jComboBoxEsp = new javax.swing.JComboBox<>();
        jTpreco = new javax.swing.JTextField();
        jBeditar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jTnome = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jListEsp = new javax.swing.JList<>();

        jLnome.setText("Nome :");

        jLcrm.setText("CRM :");

        jLespecialidade.setText("Especialidade :");

        jLpreco.setText("Preço Consulta :");

        jComboBoxEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBeditar.setText("Editar");

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jBsalvar.setText("Salvar");

        jScrollPane.setViewportView(jListEsp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLespecialidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLcrm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLpreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTnome)
                            .addComponent(jTcrm)
                            .addComponent(jComboBoxEsp, 0, 183, Short.MAX_VALUE)
                            .addComponent(jTpreco))
                        .addGap(18, 18, 18)
                        .addComponent(jBsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcrm)
                    .addComponent(jTcrm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLespecialidade)
                        .addComponent(jComboBoxEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpreco)
                    .addComponent(jTpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comboBoxEspecialidades(){
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select * from especialidade order by nome");
            
            rs = ps.executeQuery();
            
            jComboBoxEsp.removeAllItems();
            
            while(rs.next()){
                jComboBoxEsp.addItem(new Especialidade(rs.getInt("id_especialidade"), rs.getString("nome"), rs.getString("desc_especialidade")));      
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            
        }
        
    }
    
    public void selectDados(Integer crm){
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select * from medico where crm = ?");
            
            ps.setInt(1, crm);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                jTnome.setText("nome");
                jTcrm.setText("crm");
                jTpreco.setText("preco_consulta");
            }
            
            ps = conn.prepareStatement("select e.nome from especialidade e join medico_especialidade me on e.id_especialidade = me.especialidade_id where me.crm_medico = ?");
            ps.setInt(1, crm);
            rs = ps.executeQuery();

            while (rs.next()) {
                listModel.addElement(rs.getString("nome"));
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            
        }
    
    }
    
    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JComboBox<Object> jComboBoxEsp;
    private javax.swing.JLabel jLcrm;
    private javax.swing.JLabel jLespecialidade;
    private javax.swing.JList<String> jListEsp;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLpreco;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTcrm;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpreco;
    // End of variables declaration//GEN-END:variables
}
