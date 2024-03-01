/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author hp
 */
public class login2 extends javax.swing.JFrame {

    /**
     * Creates new form login2
     */
    public login2() {
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

        mtdbutton = new javax.swing.JButton();
        tpabutton = new javax.swing.JButton();
        tpobutton = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mtdbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mtdbutton.setText("Motor Traffic Department");
        mtdbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtdbuttonActionPerformed(evt);
            }
        });

        tpabutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tpabutton.setText("Traffic Police Admin");
        tpabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpabuttonActionPerformed(evt);
            }
        });

        tpobutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tpobutton.setText("Traffic Police Officer");
        tpobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpobuttonActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tpabutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tpobutton)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mtdbutton)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mtdbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tpabutton)
                .addGap(58, 58, 58)
                .addComponent(tpobutton)
                .addGap(36, 36, 36)
                .addComponent(exit)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpabuttonActionPerformed
        // TODO add your handling code here:
        PAlogin palog = new PAlogin();
        palog.show();//display PAlogin here
        dispose();//close current frame(login2) after opening PAlogin
    }//GEN-LAST:event_tpabuttonActionPerformed

    private void tpobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpobuttonActionPerformed
        // TODO add your handling code here:
        POlogin polog = new POlogin();
        polog.show();//display POlogin here
        dispose();//close current frame(login2) after opening POlogin
    }//GEN-LAST:event_tpobuttonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.show();//display login here
        dispose();//close current frame(login2) after opening login
    }//GEN-LAST:event_exitActionPerformed

    private void mtdbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtdbuttonActionPerformed
        // TODO add your handling code here:
        MDlogin mlog = new MDlogin();
        mlog.show();//display MDlogin here
        dispose();//close current frame(login2) after opening MDlogin
    }//GEN-LAST:event_mtdbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton mtdbutton;
    private javax.swing.JButton tpabutton;
    private javax.swing.JButton tpobutton;
    // End of variables declaration//GEN-END:variables
}
