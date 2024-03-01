/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
public class Pendingfine extends javax.swing.JFrame {
    Connection myConn = null;
   
    
    public Pendingfine() {
        initComponents();
        myConn = DbConn.connect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        paybutton = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        driver_pending_fine_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Driver's Pending Fine ");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Dashboard / Driver's Pending Fine");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        paybutton.setText("Pay Now");
        paybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybuttonActionPerformed(evt);
            }
        });

        back3.setText("Back");
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });

        jButton1.setText("Show fines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        driver_pending_fine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provision ID", "Vehicle No", "Issue Date", "Expire Date", "Provision", "Amount"
            }
        ));
        driver_pending_fine_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                driver_pending_fine_tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(driver_pending_fine_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(back3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paybutton)
                    .addComponent(back3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        // TODO add your handling code here:
        Driverlogin dlog = new Driverlogin();
        dlog.show();//display Driverlogin here
        dispose();//close current frame(Pendingfine) after opening Driverlogin
        
    }//GEN-LAST:event_back3ActionPerformed

    private void driver_pending_fine_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_driver_pending_fine_tableKeyPressed
      
        
    }//GEN-LAST:event_driver_pending_fine_tableKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
          String driver_email1 = Driverlogin.driver_email.getText();
          Statement st = myConn.createStatement();
          String sql = "SELECT * FROM fine WHERE driver_email = '" + driver_email1 +"'";
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String provision_id1 = String.valueOf(rs.getInt("provision_id"));
              String vehicle_no1 = String.valueOf(rs.getInt("vehicle_no"));
              String fine_issue_date1 = rs.getString("fine_issue_date");
              String fine_expire_date1 = rs.getString("fine_expire_date");
              String provision1 = rs.getString("provision");
              String fine_amount1 = String.valueOf(rs.getDouble("fine_amount"));
          
          String tbData[] = {provision_id1, vehicle_no1, fine_issue_date1, fine_expire_date1, provision1, fine_amount1};
          DefaultTableModel tblModel = (DefaultTableModel)driver_pending_fine_table.getModel();
          tblModel.addRow(tbData);
          
      }
      }
      catch(Exception e){
          System.out.println("The error was" + e);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybuttonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)driver_pending_fine_table.getModel();
        if(driver_pending_fine_table.getSelectedRowCount()==1){
            int row = driver_pending_fine_table.getSelectedRow();
            String value = driver_pending_fine_table.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM fine where provision_id = " + value;
            try{
                PreparedStatement pst3 = myConn.prepareStatement(sql);                        
                pst3.execute();
                //JOptionPane.showMessageDialog(null, "Deleted Succesfully!");
                tblModel.removeRow(driver_pending_fine_table.getSelectedRow());
            } catch(Exception e){
                System.out.println("The erroe was: " + e);
            }
            
        }else{
            if(driver_pending_fine_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "No more fines to pay!");
            }else{
                JOptionPane.showMessageDialog(this, "Please select single fine to pay!");
            }
        }
        
        
    }//GEN-LAST:event_paybuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Pendingfine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendingfine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendingfine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendingfine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendingfine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back3;
    private javax.swing.JTable driver_pending_fine_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton paybutton;
    // End of variables declaration//GEN-END:variables
}
