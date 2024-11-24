/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import dbconnection.dbcon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Ralph Creencia
 */
public class LogIn extends javax.swing.JFrame {
    private Connection connection ;
    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    // STEP # 2 CONNECT THE JFRAME FROM TO THE DATABASE, REMEMBER THE DBConnection THAT WE HAD MADE A WHILE AGO, WE NEED TO CREATE AN OBJECT FROM IT SO WE CAN CALL ITS METHODS.
        dbcon dbConnect = dbcon.getDBConnection(); //ONCE YOU WRITE THIS, THE CONNECTION MUST BE ALREADY ESTABLISHED
        connection = dbConnect.getConnection(); // NOW ASSIGN THE VARIABLE dbConnect AND CALL THE METHOD getConnection(), ACTUALLY ITS NO LONGER NECESSARY BECAUSE WE ALREADY DID IT ON THE CODE ABOVE
                                                // KAYA LANG SIGURISTA TAYO, PARA SURE NA NAKA-CONNECT, MAHIRAP MAWALAN NG CONNECTION BAKA MAGKALABUAN HALA SIGE KA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        unamef = new javax.swing.JTextField();
        passf = new javax.swing.JPasswordField();
        loginb = new javax.swing.JButton();
        signupb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        unamef.setBackground(new java.awt.Color(211, 166, 166));
        unamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unamefActionPerformed(evt);
            }
        });

        passf.setBackground(new java.awt.Color(197, 140, 140));
        passf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfActionPerformed(evt);
            }
        });

        loginb.setBackground(new java.awt.Color(221, 170, 170));
        loginb.setText("LOG IN");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        signupb.setBackground(new java.awt.Color(221, 170, 170));
        signupb.setText("SIGN UP");
        signupb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbActionPerformed(evt);
            }
        });

        jLabel1.setText("Password:");

        jLabel2.setText("User Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signupb))
                    .addComponent(passf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamef, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unamef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginb)
                    .addComponent(signupb))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfActionPerformed

    private void unamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unamefActionPerformed

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
    // Get the username and password entered by the user
    String username = unamef.getText();
    String password = new String(passf.getPassword());

    // SQL query to check if the username and password match any record in the database
    String query = "SELECT * FROM user WHERE uname = '" + username + "' AND password = '" + password + "'";

    try {
        // Create a Statement object and execute the query
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
            // If a matching user is found, proceed to the next page
            JOptionPane.showMessageDialog(this, "Login successful!");

            // Navigate to the next page (e.g., HomePage)
            HomePage homePage = new HomePage();
            homePage.setVisible(true);

            // Close the current login screen
            this.dispose();
        } else {
            // If no matching user is found, show an error message
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }    }//GEN-LAST:event_loginbActionPerformed

    private void signupbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbActionPerformed

    this.setVisible(false);

    SignUp SignUpPage = new SignUp();
    SignUpPage.setVisible(true);
    }//GEN-LAST:event_signupbActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new dbcon();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginb;
    private javax.swing.JPasswordField passf;
    private javax.swing.JButton signupb;
    private javax.swing.JTextField unamef;
    // End of variables declaration//GEN-END:variables
}