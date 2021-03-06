package TELAS;


import BOTOES.Favoritos;
import BOTOES.Observações;
import BOTOES.PrimeiroAno;
import BOTOES.Logoff;
import BOTOES.SegundoAno;
import BOTOES.Slides;
import BOTOES.TerceiroAno;
import BOTOES.TodosLivros;
import View.ViewUsuarioDeletarAtualizar;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno09
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form testes
     */
    public TelaPrincipal() {
        initComponents();
         
        setExtendedState(MAXIMIZED_BOTH);
        
        ImageIcon fun = new ImageIcon("src/IMAGENS/aaaaa.jpg");
        fun.setImage(fun.getImage().getScaledInstance(1366, 768, 1));
        fundo.setIcon(fun);
       
        ImageIcon set = new ImageIcon("src/IMAGENS/list.png");
        set.setImage(set.getImage().getScaledInstance(25, 25, 1));
        Menu.setIcon(set);
        
        ImageIcon lupa = new ImageIcon("src/IMAGENS/lupa.png");
        lupa.setImage(lupa.getImage().getScaledInstance(50, 48, 1));
        Pesq.setIcon(lupa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AreaBusca = new javax.swing.JTextField();
        Pesq = new javax.swing.JButton();
        Liv = new javax.swing.JButton();
        Serie = new javax.swing.JComboBox<String>();
        Fav = new javax.swing.JButton();
        Slid = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Obs = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        logoff = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Olá Estudante, seja bem-vindo ao InforBook's!");
        jLabel1.setAlignmentY(1.0F);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 160, 724, 50);

        AreaBusca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AreaBusca.setAlignmentY(1.0F);
        AreaBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AreaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(AreaBusca);
        AreaBusca.setBounds(200, 300, 348, 50);

        Pesq.setBackground(new java.awt.Color(0, 153, 153));
        Pesq.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Pesq.setAlignmentY(1.0F);
        Pesq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Pesq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PesqItemStateChanged(evt);
            }
        });
        Pesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesqActionPerformed(evt);
            }
        });
        jPanel1.add(Pesq);
        Pesq.setBounds(590, 300, 60, 50);

        Liv.setBackground(new java.awt.Color(0, 153, 153));
        Liv.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Liv.setText("LIVROS");
        Liv.setAlignmentY(1.0F);
        Liv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Liv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivActionPerformed(evt);
            }
        });
        jPanel1.add(Liv);
        Liv.setBounds(90, 460, 100, 50);

        Serie.setBackground(new java.awt.Color(0, 102, 102));
        Serie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Serie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VER POR ANO ESCOLAR", "1° ANO", "2° ANO", "3° ANO" }));
        Serie.setAlignmentX(2.0F);
        Serie.setAlignmentY(5.0F);
        Serie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Serie.setEditor(null);
        Serie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SerieItemStateChanged(evt);
            }
        });
        Serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerieActionPerformed(evt);
            }
        });
        jPanel1.add(Serie);
        Serie.setBounds(250, 460, 180, 50);

        Fav.setBackground(new java.awt.Color(0, 153, 153));
        Fav.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Fav.setText("FAVORITOS");
        Fav.setAlignmentY(1.0F);
        Fav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Fav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavActionPerformed(evt);
            }
        });
        jPanel1.add(Fav);
        Fav.setBounds(660, 460, 109, 50);

        Slid.setBackground(new java.awt.Color(0, 153, 153));
        Slid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Slid.setText("SLIDES");
        Slid.setAlignmentY(1.0F);
        Slid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Slid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlidActionPerformed(evt);
            }
        });
        jPanel1.add(Slid);
        Slid.setBounds(480, 460, 100, 50);
        jPanel1.add(fundo);
        fundo.setBounds(0, 0, 1370, 740);

        jMenuBar2.setPreferredSize(new java.awt.Dimension(25, 25));

        Menu.setBackground(new java.awt.Color(0, 153, 153));
        Menu.setForeground(new java.awt.Color(51, 51, 51));
        Menu.setAlignmentX(0.1F);
        Menu.setAlignmentY(0.1F);
        Menu.setMaximumSize(new java.awt.Dimension(25, 25));
        Menu.setPreferredSize(new java.awt.Dimension(100, 50));

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setText("Editar Conta");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Menu.add(login);
        Menu.add(jSeparator4);
        Menu.add(jSeparator1);

        Obs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Obs.setText("Observações");
        Obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObsActionPerformed(evt);
            }
        });
        Menu.add(Obs);
        Menu.add(jSeparator9);
        Menu.add(jSeparator10);

        logoff.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoff.setText("Logout");
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });
        Menu.add(logoff);
        Menu.add(jSeparator2);
        Menu.add(jSeparator3);

        Sair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        jMenuBar2.add(Menu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObsActionPerformed
        // TODO add your handling code here:
        Observações novo = new Observações();
        novo.setVisible(true);
    }//GEN-LAST:event_ObsActionPerformed

    private void logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffActionPerformed
        // TODO add your handling code here:
        Logoff novo = new Logoff();
        novo.setVisible(true);
    }//GEN-LAST:event_logoffActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void AreaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaBuscaActionPerformed

    private void PesqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PesqItemStateChanged

    }//GEN-LAST:event_PesqItemStateChanged

    private void PesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesqActionPerformed

    private void LivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivActionPerformed
        setVisible(false);
        TodosLivros tela = new TodosLivros();
        tela.setVisible(true);
    }//GEN-LAST:event_LivActionPerformed

    private void SerieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SerieItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SerieItemStateChanged

    private void SerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerieActionPerformed
        // TODO add your handling code here:
        if(Serie.getSelectedItem() == "1° ANO"){
            setVisible(false);
            PrimeiroAno tela = new PrimeiroAno();
            tela.setVisible(true);
        }if(Serie.getSelectedItem() == "2° ANO"){
            setVisible(false);
            SegundoAno tela = new SegundoAno();
            tela.setVisible(true);
        }if(Serie.getSelectedItem() == "3° ANO"){
            setVisible(false);
            TerceiroAno tela = new TerceiroAno();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_SerieActionPerformed

    private void FavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavActionPerformed
        setVisible(false);
        Favoritos tela = new Favoritos();
        tela.setVisible(true);
    }//GEN-LAST:event_FavActionPerformed

    private void SlidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlidActionPerformed
        setVisible(false);
        Slides tela = new Slides();
        tela.setVisible(true);
    }//GEN-LAST:event_SlidActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         ViewUsuarioDeletarAtualizar tela = new ViewUsuarioDeletarAtualizar();
         tela.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AreaBusca;
    private javax.swing.JButton Fav;
    private javax.swing.JButton Liv;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Obs;
    private javax.swing.JButton Pesq;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JComboBox<String> Serie;
    private javax.swing.JButton Slid;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem logoff;
    // End of variables declaration//GEN-END:variables
}
