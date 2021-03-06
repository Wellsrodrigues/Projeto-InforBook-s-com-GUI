/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.bean.Usuario;
import Model.dao.UsuarioDAO;

/**
 *
 * @author aluno09
 */
public class ViewUsuarioCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastro
     */
    public ViewUsuarioCadastro() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        TexUsuario = new javax.swing.JTextField();
        TexSenha = new javax.swing.JPasswordField();
        CadastrarUsuario = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TexEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome de usuario:");

        TexUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TexUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TexUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexUsuarioActionPerformed(evt);
            }
        });

        TexSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TexSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        CadastrarUsuario.setBackground(new java.awt.Color(0, 102, 102));
        CadastrarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CadastrarUsuario.setText("Cadastrar");
        CadastrarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarUsuarioActionPerformed(evt);
            }
        });

        Voltar.setBackground(new java.awt.Color(0, 102, 102));
        Voltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Email:");

        TexEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TexEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TexEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexEmailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Criar senha:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Fa??a seu cadastro e desfrute de nosso servi??o!");

        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setText("CodAluno:");

        TextId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TextId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(TexUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(TexEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TexSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(164, 164, 164))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(TexUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(TexEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(TexSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TexEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexEmailActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        setVisible(false);
        TELAS.TelaInicial tela = new TELAS.TelaInicial();
        tela.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    int cod;
    private void CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuarioActionPerformed
       
        Usuario pes = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
       
        pes.setNome(TexUsuario.getText());
        pes.setEmail(TexEmail.getText());
        pes.setSenha(TexSenha.getName());
        
        dao.create(pes);
        
        setVisible(false);
        TELAS.TelaPrincipal tela = new TELAS.TelaPrincipal();
        tela.setVisible(true);
    }//GEN-LAST:event_CadastrarUsuarioActionPerformed

    private void TexUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexUsuarioActionPerformed

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuarioCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarUsuario;
    private javax.swing.JTextField TexEmail;
    private javax.swing.JPasswordField TexSenha;
    private javax.swing.JTextField TexUsuario;
    private javax.swing.JTextField TextId;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
