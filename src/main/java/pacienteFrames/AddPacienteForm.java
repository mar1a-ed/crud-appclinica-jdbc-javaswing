package pacienteFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddPacienteForm extends javax.swing.JInternalFrame {
    
    private static Connection conn;
    
    public AddPacienteForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLnome = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLtelefone = new javax.swing.JLabel();
        jLcpf = new javax.swing.JLabel();
        jLsexo = new javax.swing.JLabel();
        jLdataNasc = new javax.swing.JLabel();
        jBcadastrar = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jTemail = new javax.swing.JTextField();
        jTtelefone = new javax.swing.JTextField();
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField();
        jDateChooserNasc = new com.toedter.calendar.JDateChooser();
        jTnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRf = new javax.swing.JRadioButton();
        jRm = new javax.swing.JRadioButton();

        setClosable(true);

        jLnome.setText("Nome : ");

        jLemail.setText("E-mail : ");

        jLtelefone.setText("Telefone : ");

        jLcpf.setText("CPF : ");

        jLsexo.setText("Sexo : ");

        jLdataNasc.setText("Data Nascimento :");

        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.setToolTipText("");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Cadastrar Paciente");

        buttonGroup1.add(jRf);
        jRf.setText("F");

        buttonGroup1.add(jRm);
        jRm.setText("M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBcadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLdataNasc)
                                    .addComponent(jLtelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLcpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLsexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTemail)
                                    .addComponent(jTtelefone)
                                    .addComponent(jFormattedTextFieldcpf)
                                    .addComponent(jDateChooserNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jTnome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRf)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRm)))))))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemail)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelefone)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcpf)
                    .addComponent(jFormattedTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsexo)
                    .addComponent(jRf)
                    .addComponent(jRm))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLdataNasc)
                    .addComponent(jDateChooserNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        PreparedStatement ps;
        
        String nome = jTnome.getText();
        String email = jTemail.getText();
        String telefone = jTtelefone.getText();
        String sexo;
        
        if(jRf.isSelected()){
            sexo = "f";
        }else{
            sexo = "m";
        }
        
        String cpf = jFormattedTextFieldcpf.getText();
        Date dataNasc = jDateChooserNasc.getDate();
        java.sql.Date dataNasc2 = new java.sql.Date(dataNasc.getTime());       
        
        try{
            conn = ConexaoDB.getConnection();
            ps = conn.prepareStatement("insert into paciente (nome, email, telefone, sexo, cpf, data_nasc) values (?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, telefone);
            ps.setString(4, sexo);
            ps.setString(5, cpf);
            ps.setDate(6, dataNasc2);
            
            ps.executeUpdate();
            
            ps.close();
            
            JOptionPane.showMessageDialog(rootPane, "Paciente cadastrado com sucesso.");
            limparCampos();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar paciente. "+ex.getMessage());
        }
        
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void limparCampos(){       
        jTnome.setText("");
        jTemail.setText("");
        jTtelefone.setText("");
        jRf.setSelected(false);
        jRm.setSelected(false);
        jFormattedTextFieldcpf.setText("");
        jDateChooserNasc.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBfechar;
    private com.toedter.calendar.JDateChooser jDateChooserNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLdataNasc;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsexo;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JRadioButton jRf;
    private javax.swing.JRadioButton jRm;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
