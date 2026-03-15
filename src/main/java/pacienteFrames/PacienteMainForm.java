package pacienteFrames;

import connector.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteMainForm extends javax.swing.JInternalFrame {

    Connection conn;
    
    public PacienteMainForm() throws SQLException {
        initComponents();
        conn = ConexaoDB.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBfechar = new javax.swing.JButton();
        jLcpf = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jBbuscarNome = new javax.swing.JButton();
        jLtodos = new javax.swing.JLabel();
        jBbuscarTodos = new javax.swing.JButton();
        jFcpf = new javax.swing.JFormattedTextField();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Data de Nascimento", "Cpf", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBfechar.setText("Fechar");
        jBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfecharActionPerformed(evt);
            }
        });

        jLcpf.setText("CPF : ");

        jBbuscar.setText("Buscar");
        jBbuscar.setToolTipText("");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pacientes");
        jLabel1.setToolTipText("");

        jLnome.setText("Nome :");

        jBbuscarNome.setText("Buscar");
        jBbuscarNome.setToolTipText("");
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

        try {
            jFcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jBfechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLtodos)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLnome)
                                    .addComponent(jLcpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTnome, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(jFcpf))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBbuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBbuscarTodos))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcpf)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBbuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
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
    
    private void jBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfecharActionPerformed
        this.dispose(); //fecha a tela ao apertar o botao voltar
    }//GEN-LAST:event_jBfecharActionPerformed

    //abre o frame de cadastrar paciente
    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        AddPacienteForm telaAdd = new AddPacienteForm();
        abrirFrameCentralizado(telaAdd);       
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        int qtd_linha = jTable1.getSelectedRow(); //verifica a linha selecionada na tabela
        
        if(qtd_linha != -1){ //se tiver pelo menos uma linha selecionada
        
            String cpf = jTable1.getValueAt(qtd_linha, 4).toString(); //pega o cpf do paciente da linha selecionada com o mouse
            
            //abre o frame de atualizar dados do paciente
            try {
                AtualizarPacienteForm telaAtualizar = new AtualizarPacienteForm();          
                telaAtualizar.selectDados(cpf);                
                abrirFrameCentralizado(telaAtualizar);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jBeditarActionPerformed

    //buscar pelo cpf
    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel(); //cria uma tabela modelo auxiliar
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        String string = jFcpf.getText(); //pega o cpf inserido no campo 'cpf'
        
        if(jFcpf.getText() != null){ //se o campo cpf n for nulo
            try{   
                ps = conn.prepareStatement("select * from paciente where cpf like ?"); //faz o select comando sql para recuperar os dados do paciente

                ps.setString(1, "%" + string + "%");

                rs = ps.executeQuery();

                //adiciona os dados recuperados nas linhas das tabelas
                while(rs.next()){
                    tabelaModelo.addRow(new Object[]{
                        rs.getString("nome"), rs.getString("email"), rs.getString("telefone"), rs.getDate("data_nasc"), rs.getString("cpf"), rs.getString("sexo")
                    }); 
                }

                ps.close();
                rs.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        PreparedStatement ps = null;
        
        int qtd_linha = jTable1.getSelectedRow();
        
        if(qtd_linha != -1){
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Atenção! Deseja excluir este paciente?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(confirmacao == JOptionPane.YES_OPTION) {
                String cpf = jTable1.getValueAt(qtd_linha, 4).toString();

                try{
                    ps = conn.prepareStatement("delete from paciente where cpf = ?");

                    ps.setString(1, cpf);

                    ps.executeUpdate();

                    ps.close();
                    
                    JOptionPane.showMessageDialog(rootPane, "Paciente removido com sucesso.");
                    jBbuscarActionPerformed(evt);
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro. " + ex.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBbuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarNomeActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        String string = jTnome.getText();
        
        if(jTnome.getText() != null){
            try{   
                ps = conn.prepareStatement("select * from paciente where nome like ?");

                ps.setString(1, "%" + string + "%");

                rs = ps.executeQuery();

                while(rs.next()){
                    tabelaModelo.addRow(new Object[]{
                        rs.getString("nome"), rs.getString("email"), rs.getString("telefone"), rs.getDate("data_nasc"), rs.getString("cpf"), rs.getString("sexo")
                    }); 
                }

                ps.close();
                rs.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro. " + e.getMessage());
            }
        }
        
        
    }//GEN-LAST:event_jBbuscarNomeActionPerformed

    private void jBbuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosActionPerformed
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
        tabelaModelo.setNumRows(0);       
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{   
            ps = conn.prepareStatement("select * from paciente");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                tabelaModelo.addRow(new Object[]{
                    rs.getString("nome"), rs.getString("email"), rs.getString("telefone"), rs.getDate("data_nasc"), rs.getString("cpf"), rs.getString("sexo")
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
    private javax.swing.JButton jBbuscarNome;
    private javax.swing.JButton jBbuscarTodos;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBfechar;
    private javax.swing.JButton jBnovo;
    private javax.swing.JFormattedTextField jFcpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables
}
