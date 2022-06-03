/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_sad_login_register;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ms
 */
public class JFrame_LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_LoginForm
     */
    public JFrame_LoginForm() {
        initComponents();
        //Center Form in the screen
        this.setLocationRelativeTo(null);
        //Stretch Image
        Icon i = JLabel_Icon.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(JLabel_Icon.getWidth(),JLabel_Icon.getHeight(), Image.SCALE_SMOOTH);
        JLabel_Icon.setIcon(new ImageIcon(image));
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
        JLabel_Icon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLabel_LoginText = new javax.swing.JLabel();
        JLabel_Close = new javax.swing.JLabel();
        JLabel_Minimize = new javax.swing.JLabel();
        JLabel_Username = new javax.swing.JLabel();
        JLabel_Password = new javax.swing.JLabel();
        JTxt_Username = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        JBtn_Login = new javax.swing.JButton();
        JLabel_Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JLabel_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/key.png"))); // NOI18N
        JLabel_Icon.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JLabel_LoginText.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        JLabel_LoginText.setText("Login Form");

        JLabel_Close.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        JLabel_Close.setText("X");
        JLabel_Close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_CloseMouseClicked(evt);
            }
        });

        JLabel_Minimize.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        JLabel_Minimize.setText("_");
        JLabel_Minimize.setToolTipText("");
        JLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_MinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel_LoginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_LoginText)
                    .addComponent(JLabel_Close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JLabel_Minimize)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JLabel_Username.setBackground(new java.awt.Color(255, 255, 255));
        JLabel_Username.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JLabel_Username.setText("Username");

        JLabel_Password.setBackground(new java.awt.Color(255, 255, 255));
        JLabel_Password.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JLabel_Password.setText("Password");

        JTxt_Username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        JBtn_Login.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JBtn_Login.setText("Login");
        JBtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_LoginActionPerformed(evt);
            }
        });

        JLabel_Register.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLabel_Register.setText("Create new account");
        JLabel_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(JLabel_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(JLabel_Username))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTxt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBtn_Login)
                            .addComponent(JLabel_Password))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLabel_Register)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabel_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JTxt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Username)
                .addGap(21, 21, 21)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel_Password)
                .addGap(18, 18, 18)
                .addComponent(JBtn_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel_Register)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_CloseMouseClicked
        // //JLabel_Close
        System.exit(0);
    }//GEN-LAST:event_JLabel_CloseMouseClicked

    private void JLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_MinimizeMouseClicked
        //JLabel_Minimize
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_JLabel_MinimizeMouseClicked

    private void JLabel_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_RegisterMouseClicked
        // JLabel_Register
        JFrame_RegisterForm rgf = new JFrame_RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_JLabel_RegisterMouseClicked

    private void JBtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtn_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtn_Login;
    private javax.swing.JLabel JLabel_Close;
    private javax.swing.JLabel JLabel_Icon;
    private javax.swing.JLabel JLabel_LoginText;
    private javax.swing.JLabel JLabel_Minimize;
    private javax.swing.JLabel JLabel_Password;
    private javax.swing.JLabel JLabel_Register;
    private javax.swing.JLabel JLabel_Username;
    private javax.swing.JTextField JTxt_Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}