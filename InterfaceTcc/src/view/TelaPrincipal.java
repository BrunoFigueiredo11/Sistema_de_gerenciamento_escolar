/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.LinkController;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jdptela = new javax.swing.JDesktopPane();
        btnnovo = new javax.swing.JButton();
        btnturmas = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btncursos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnadm1 = new javax.swing.JButton();
        btnturmas1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Menucadastrar = new javax.swing.JMenuItem();
        Menualterar = new javax.swing.JMenuItem();
        Menuturmas = new javax.swing.JMenu();
        Menucursos = new javax.swing.JMenu();
        Menusobre = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adduserpainel.png"))); // NOI18N
        btnnovo.setContentAreaFilled(false);
        btnnovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnovoMouseExited(evt);
            }
        });
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btnturmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grouppanel.png"))); // NOI18N
        btnturmas.setContentAreaFilled(false);
        btnturmas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnturmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnturmasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnturmasMouseExited(evt);
            }
        });
        btnturmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturmasActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edituserpainel.png"))); // NOI18N
        btneditar.setContentAreaFilled(false);
        btneditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditarMouseExited(evt);
            }
        });
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btncursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookpainel.png"))); // NOI18N
        btncursos.setContentAreaFilled(false);
        btncursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncursosMouseExited(evt);
            }
        });
        btncursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncursosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Alterar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cadastrar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Turmas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cursos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("  Logout");

        btnadm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        btnadm1.setContentAreaFilled(false);
        btnadm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadm1MouseExited(evt);
            }
        });
        btnadm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadm1ActionPerformed(evt);
            }
        });

        btnturmas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chamada.png"))); // NOI18N
        btnturmas1.setContentAreaFilled(false);
        btnturmas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnturmas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnturmas1MouseExited(evt);
            }
        });
        btnturmas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturmas1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Chamada");

        jdptela.setLayer(btnnovo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnturmas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btneditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btncursos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnadm1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(btnturmas1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdptela.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdptelaLayout = new javax.swing.GroupLayout(jdptela);
        jdptela.setLayout(jdptelaLayout);
        jdptelaLayout.setHorizontalGroup(
            jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdptelaLayout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addComponent(btnturmas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(btncursos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(235, 235, 235)
                                .addComponent(jLabel7))))
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)))))
                .addGap(191, 191, 191)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnturmas1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdptelaLayout.createSequentialGroup()
                            .addComponent(btnadm1)
                            .addGap(17, 17, 17))
                        .addGroup(jdptelaLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(228, 228, 228))
        );
        jdptelaLayout.setVerticalGroup(
            jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdptelaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addComponent(btnnovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addComponent(btneditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnturmas1))
                .addGap(115, 115, 115)
                .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnturmas)
                            .addComponent(btncursos))
                        .addGap(3, 3, 3)
                        .addGroup(jdptelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jdptelaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdptelaLayout.createSequentialGroup()
                        .addComponent(btnadm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMenu2.setText("Alunos");

        Menucadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        Menucadastrar.setText("Cadastrar");
        Menucadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menucadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(Menucadastrar);

        Menualterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        Menualterar.setText("Alterar");
        Menualterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menualterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenualterarActionPerformed(evt);
            }
        });
        jMenu2.add(Menualterar);

        jMenuBar1.add(jMenu2);

        Menuturmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        Menuturmas.setText("Turmas");
        Menuturmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuturmasMouseClicked(evt);
            }
        });
        Menuturmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuturmasActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menuturmas);

        Menucursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        Menucursos.setText("Cursos");
        Menucursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenucursosMouseClicked(evt);
            }
        });
        Menucursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenucursosActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menucursos);

        Menusobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        Menusobre.setText("Sobre");
        jMenuBar1.add(Menusobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdptela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdptela)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenucadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucadastrarActionPerformed

        TelaCadastroAluno telaCadAluno = new TelaCadastroAluno();
        jdptela.add(telaCadAluno);
        telaCadAluno.setVisible(true);


    }//GEN-LAST:event_MenucadastrarActionPerformed

    private void MenualterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenualterarActionPerformed
        TelaAlteraAluno telaAltCad = new TelaAlteraAluno();
        jdptela.add(telaAltCad);
        telaAltCad.setVisible(true);
    }//GEN-LAST:event_MenualterarActionPerformed

    private void btncursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncursosMouseExited
        btncursos.setBorder(null);
    }//GEN-LAST:event_btncursosMouseExited

    private void btncursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncursosMouseEntered
        btncursos.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btncursosMouseEntered

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        TelaAlteraAluno telaAltCad = new TelaAlteraAluno();
        jdptela.add(telaAltCad);
        telaAltCad.setVisible(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseExited
        btneditar.setBorder(null);
    }//GEN-LAST:event_btneditarMouseExited

    private void btneditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseEntered
        btneditar.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btneditarMouseEntered

    private void btnturmasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmasMouseExited
        btnturmas.setBorder(null);
    }//GEN-LAST:event_btnturmasMouseExited

    private void btnturmasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmasMouseEntered
        btnturmas.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnturmasMouseEntered

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        TelaCadastroAluno telaCadAluno = new TelaCadastroAluno();
        jdptela.add(telaCadAluno);
        telaCadAluno.setVisible(true);
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnnovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseExited
        btnnovo.setBorder(null);
    }//GEN-LAST:event_btnnovoMouseExited

    private void btnnovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseEntered
        btnnovo.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnnovoMouseEntered

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked

    }//GEN-LAST:event_btnnovoMouseClicked

    private void btnadm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadm1MouseEntered
       btnadm1.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnadm1MouseEntered

    private void btnadm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadm1MouseExited
        btnadm1.setBorder(null);
    }//GEN-LAST:event_btnadm1MouseExited

    private void btnturmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturmasActionPerformed
        TelaListarTurmas telaturmas = new TelaListarTurmas();
        jdptela.add(telaturmas);
        telaturmas.setVisible(true);
    }//GEN-LAST:event_btnturmasActionPerformed

    private void MenuturmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuturmasActionPerformed
        
    }//GEN-LAST:event_MenuturmasActionPerformed

    private void btnadm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadm1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair ?");
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnadm1ActionPerformed

    private void btncursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncursosActionPerformed
        TelaListarCursos telacursos = new TelaListarCursos();
        jdptela.add(telacursos);
        telacursos.setVisible(true);
    }//GEN-LAST:event_btncursosActionPerformed

    private void MenucursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenucursosActionPerformed
        
    }//GEN-LAST:event_MenucursosActionPerformed

    private void MenuturmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuturmasMouseClicked
       TelaListarTurmas telaturmas = new TelaListarTurmas();
        jdptela.add(telaturmas);
        telaturmas.setVisible(true);
    }//GEN-LAST:event_MenuturmasMouseClicked

    private void MenucursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenucursosMouseClicked
     TelaListarCursos telacursos = new TelaListarCursos();
        jdptela.add(telacursos);
        telacursos.setVisible(true);
    }//GEN-LAST:event_MenucursosMouseClicked

    private void btnturmas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmas1MouseEntered
        btnturmas1.setBorder(BorderFactory.createRaisedBevelBorder());
    }//GEN-LAST:event_btnturmas1MouseEntered

    private void btnturmas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnturmas1MouseExited
        btnturmas1.setBorder(null);
    }//GEN-LAST:event_btnturmas1MouseExited

    private void btnturmas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturmas1ActionPerformed
        LinkController l = new LinkController();
        LinkController.main();
    }//GEN-LAST:event_btnturmas1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menualterar;
    private javax.swing.JMenuItem Menucadastrar;
    private javax.swing.JMenu Menucursos;
    private javax.swing.JMenu Menusobre;
    private javax.swing.JMenu Menuturmas;
    private javax.swing.JButton btnadm1;
    private javax.swing.JButton btncursos;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnturmas;
    private javax.swing.JButton btnturmas1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdptela;
    // End of variables declaration//GEN-END:variables
}
