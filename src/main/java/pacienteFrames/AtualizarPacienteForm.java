package pacienteFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AtualizarPacienteForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public AtualizarPacienteForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnome = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLtelefone = new javax.swing.JLabel();
        jLcpf = new javax.swing.JLabel();
        jLsexo = new javax.swing.JLabel();
        jLdataNasc = new javax.swing.JLabel();
        jBatualizar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jTnome = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jTtelefone = new javax.swing.JTextField();
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField();
        jTsexo = new javax.swing.JTextField();
        jDateChooserNasc = new com.toedter.calendar.JDateChooser();

        jLnome.setText("Nome :");

        jLemail.setText("E-mail : ");
        jLemail.setToolTipText("");

        jLtelefone.setText("Telefone :");

        jLcpf.setText("CPF :");

        jLsexo.setText("Sexo :");

        jLdataNasc.setText("Data de Nascimento :");

        jBatualizar.setText("Atualizar");
        jBatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jTnome.setEditable(false);

        jFormattedTextFieldcpf.setEditable(false);
        try {
            jFormattedTextFieldcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTsexo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jBfechar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLdataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLsexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLcpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLtelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTnome)
                            .addComponent(jTemail)
                            .addComponent(jTtelefone)
                            .addComponent(jFormattedTextFieldcpf)
                            .addComponent(jTsexo)
                            .addComponent(jDateChooserNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemail)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelefone)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcpf)
                    .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsexo)
                    .addComponent(jTsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLdataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void selectDados(String cpf){
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select * from paciente where cpf = ?");
            
            ps.setString(1, cpf);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                jTnome.setText(rs.getString("nome"));
                jTemail.setText(rs.getString("email"));
                jTtelefone.setText(rs.getString("telefone"));
                jFormattedTextFieldcpf.setText(cpf);
                jTsexo.setText(rs.getString("sexo"));
                jDateChooserNasc.setDate(rs.getDate("data_nasc"));
            }
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            
        }
    }
    
    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizarActionPerformed
        PreparedStatement ps;
        
        String email = jTemail.getText();
        String telefone = jTtelefone.getText();
        String cpf = jFormattedTextFieldcpf.getText().replaceAll("[^0-9]", "");
        
        int linhas;
        
        try{
            ps = conn.prepareStatement("update paciente set email = ?, telefone = ? where cpf = ?");
            
            ps.setString(1, email);
            ps.setString(2, telefone);
            ps.setString(3, cpf);
            
            linhas = ps.executeUpdate();
            
            if(linhas > 0){
                JOptionPane.showMessageDialog(rootPane, "Dados atualizados com sucesso.");
            }
            
            ps.close();
            
        }catch(SQLException e){
            
        }
    }//GEN-LAST:event_jBatualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBatualizar;
    private javax.swing.JButton jBfechar;
    private com.toedter.calendar.JDateChooser jDateChooserNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLdataNasc;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsexo;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTsexo;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
