/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author gumaro
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form New_User
     */
    public login() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 132, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user50.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 397, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 492, -1, -1));

        jTextField1.setBackground(new java.awt.Color(230, 230, 230));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setText("E-mail");
        jTextField1.setPreferredSize(new java.awt.Dimension(413, 49));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 397, -1, -1));

        jTextField4.setBackground(new java.awt.Color(230, 230, 230));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField4.setText("Password");
        jTextField4.setPreferredSize(new java.awt.Dimension(413, 49));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 492, -1, -1));

        jLabel6.setBackground(new java.awt.Color(230, 230, 230));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar");
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(313, 43));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 645, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x32.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/_32.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 20));

        jLabel9.setBackground(new java.awt.Color(230, 230, 230));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingresar");
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(313, 43));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 580, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("¿Olvido su contraseña? Clic aqui");
        jLabel10.setPreferredSize(new java.awt.Dimension(230, 26));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 704, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 177, 210), 5));
        jLabel2.setPreferredSize(new java.awt.Dimension(614, 400));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 342, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
