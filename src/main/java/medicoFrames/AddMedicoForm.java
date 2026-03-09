package medicoFrames;

import connector.ConexaoDB;
import entities.Especialidade;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddMedicoForm extends javax.swing.JInternalFrame {

    Connection conn;
    List<Especialidade> especialidades;
    private javax.swing.DefaultListModel<String> listModel = new javax.swing.DefaultListModel<>();
    
    public AddMedicoForm() throws SQLException {
        this.especialidades = new ArrayList<>();
        initComponents();
        conn = ConexaoDB.getConnection(); 
        jListEsp.setModel(listModel);
        comboBoxEspecialidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnome = new javax.swing.JLabel();
        jLcrm = new javax.swing.JLabel();
        jLesp = new javax.swing.JLabel();
        jLpreco = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jTcrm = new javax.swing.JTextField();
        jComboBoxEsp = new javax.swing.JComboBox<>();
        jTpreco = new javax.swing.JTextField();
        jBcadastrar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jBaddEsp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEsp = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        jLnome.setText("Nome :");

        jLcrm.setText("CRM : ");

        jLesp.setText("Especialidade :");

        jLpreco.setText("Preço Consulta :");

        jComboBoxEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBcadastrar.setText("Cadastrar");
        jBcadastrar.setToolTipText("");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jBaddEsp.setText("Salvar");
        jBaddEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddEspActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListEsp);

        jLabel1.setText("Cadastrar Medico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLesp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLcrm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLnome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLpreco, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTnome)
                                    .addComponent(jTcrm)
                                    .addComponent(jComboBoxEsp, 0, 167, Short.MAX_VALUE)
                                    .addComponent(jTpreco))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBaddEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcrm)
                    .addComponent(jTcrm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLesp)
                        .addComponent(jComboBoxEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBaddEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLpreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
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
    
    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        PreparedStatement ps;
        String nome = jTnome.getText();
        Integer crm = Integer.parseInt(jTcrm.getText());
        Double preco_consulta = Double.parseDouble(jTpreco.getText());
        
        try{
            ps = conn.prepareStatement("insert into medico (nome_medico, crm, preco_consulta) values (?, ?, ?)");
            
            ps.setString(1, nome);
            ps.setInt(2, crm);
            ps.setDouble(3, preco_consulta);
            
            ps.executeUpdate();
            
            ps = conn.prepareStatement("insert into medico_especialidade (crm_medico, especialidade_id) values (?, ?)");
            
            for (Especialidade e : especialidades) {
            ps.setInt(1, crm);
            ps.setInt(2, e.getIdEspecialidade()); 
            ps.executeUpdate();
            
            }
            
            JOptionPane.showMessageDialog(rootPane, "Medico cadastrado com sucesso.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jBaddEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddEspActionPerformed
        Especialidade esp = (Especialidade) jComboBoxEsp.getSelectedItem();
        
        if(!especialidades.contains(esp)){
            especialidades.add(esp);
            listModel.addElement(esp.getNome());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Especialidade já adicionada");
        }
    }//GEN-LAST:event_jBaddEspActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddEsp;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBfechar;
    private javax.swing.JComboBox<Object> jComboBoxEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcrm;
    private javax.swing.JLabel jLesp;
    private javax.swing.JList<String> jListEsp;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLpreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcrm;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpreco;
    // End of variables declaration//GEN-END:variables
}
