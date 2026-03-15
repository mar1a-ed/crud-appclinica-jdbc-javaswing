package execucaoConsulta;

import connector.ConexaoDB;
import entities.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Prontuario extends javax.swing.JInternalFrame {

    List<Exame> exames;
    private DefaultListModel<String> listaExames = new DefaultListModel<>();
    private Integer idConsulta;
    Connection conn;
    
    public Prontuario() throws SQLException {
        this.exames = new ArrayList<>();
        initComponents();
        conn = ConexaoDB.getConnection();
        jList1.setModel(listaExames);
        comboBoxExames();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLpaciente = new javax.swing.JLabel();
        jLmedico = new javax.swing.JLabel();
        jLdiagnostico = new javax.swing.JLabel();
        jLsexo = new javax.swing.JLabel();
        jRadioButtonfeminino = new javax.swing.JRadioButton();
        jRadioButtonmasculino = new javax.swing.JRadioButton();
        jTpaciente = new javax.swing.JTextField();
        jTcrmMedico = new javax.swing.JTextField();
        jLexames = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxExames = new javax.swing.JComboBox<>();
        jBaddExame = new javax.swing.JButton();
        jBregistrarConsulta = new javax.swing.JButton();
        jBfechar = new javax.swing.JButton();
        jLprontuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setClosable(true);

        jLpaciente.setText("Paciente :");

        jLmedico.setText("Medico :");

        jLdiagnostico.setText("Diagnóstico :");

        jLsexo.setText("Sexo :");

        buttonGroup1.add(jRadioButtonfeminino);
        jRadioButtonfeminino.setText("F");

        buttonGroup1.add(jRadioButtonmasculino);
        jRadioButtonmasculino.setText("M");

        jTpaciente.setEditable(false);

        jTcrmMedico.setEditable(false);

        jLexames.setText("Exames :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBoxExames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxExamesActionPerformed(evt);
            }
        });

        jBaddExame.setText("+");
        jBaddExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddExameActionPerformed(evt);
            }
        });

        jBregistrarConsulta.setText("Registrar Consulta");
        jBregistrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarConsultaActionPerformed(evt);
            }
        });

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLprontuario.setText("Prontuário Clínico");

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBregistrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLdiagnostico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLpaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLmedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLexames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTpaciente)
                            .addComponent(jTcrmMedico)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jComboBoxExames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jBaddExame, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLsexo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonfeminino)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonmasculino))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLprontuario)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLprontuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpaciente)
                    .addComponent(jLsexo)
                    .addComponent(jRadioButtonfeminino)
                    .addComponent(jRadioButtonmasculino)
                    .addComponent(jTpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLmedico))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTcrmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdiagnostico)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLexames)
                            .addComponent(jComboBoxExames, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBaddExame, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBregistrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comboBoxExames(){
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conn.prepareStatement("select * from exame order by nome_exame");
            
            rs = ps.executeQuery();
            
            jComboBoxExames.removeAllItems();
            
            while(rs.next()){
                jComboBoxExames.addItem(new Exame(rs.getInt("id"), rs.getString("nome_exame")));
            }
            
            ps.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
    }
    
    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBfecharActionPerformed

    private void jComboBoxExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxExamesActionPerformed
        
    }//GEN-LAST:event_jComboBoxExamesActionPerformed

    public void dadosConsulta(Integer id, String nomePaciente, String medico, String sexo){
        idConsulta = id;
        jTpaciente.setText(nomePaciente);
        jTcrmMedico.setText(medico);
        
        if (sexo != null) {
            if (sexo.equalsIgnoreCase("F")) {
                jRadioButtonfeminino.setSelected(true);
            } else if (sexo.equalsIgnoreCase("M")) {
                jRadioButtonmasculino.setSelected(true);
            }
        }
    }
    
    private void jBaddExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddExameActionPerformed
        Exame exame = (Exame) jComboBoxExames.getSelectedItem();
        
        if(!exames.contains(exame)){
            exames.add(exame);
            listaExames.addElement(exame.getNome());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Exame já adicionado");
        }
    }//GEN-LAST:event_jBaddExameActionPerformed

    private void jBregistrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarConsultaActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String diagnostico = jTextArea1.getText();
        
        try{
            ps = conn.prepareStatement("insert into execucao_consulta (id_ag, diagnostico) values (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, idConsulta);
            ps.setString(2, diagnostico);
  
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            
            int id = 0;
            
            if(rs.next())
                id = rs.getInt(1);
                
            ps = conn.prepareStatement("insert into consulta_exame (execucao_id, exame_id) values (?, ?)");
            
            for(Exame exame: exames){
                ps.setInt(1, id);
                ps.setInt(2, exame.getId());
                ps.executeUpdate();
            }
                
            ps = conn.prepareStatement("update agenda_consulta set status_consulta = 'Finalizada' where id = ?");
                
            ps.setInt(1, idConsulta);
                
            ps.executeUpdate();
             
            JOptionPane.showMessageDialog(rootPane, "Consulta registrada com sucesso.");
            
            ps.close();
            rs.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
        }
        
    }//GEN-LAST:event_jBregistrarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBaddExame;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBregistrarConsulta;
    private javax.swing.JComboBox<Object> jComboBoxExames;
    private javax.swing.JLabel jLdiagnostico;
    private javax.swing.JLabel jLexames;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jLmedico;
    private javax.swing.JLabel jLpaciente;
    private javax.swing.JLabel jLprontuario;
    private javax.swing.JLabel jLsexo;
    private javax.swing.JRadioButton jRadioButtonfeminino;
    private javax.swing.JRadioButton jRadioButtonmasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTcrmMedico;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTpaciente;
    // End of variables declaration//GEN-END:variables
}
