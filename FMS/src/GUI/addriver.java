/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date;
public class addriver extends javax.swing.JFrame {
    Connection myConn = null;
    
    addriver() {
        initComponents();
        myConn = DbConn.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        driver_full_name = new javax.swing.JTextField();
        class_of_vehicle = new javax.swing.JTextField();
        edbutton = new javax.swing.JButton();
        adbutton = new javax.swing.JButton();
        rdbutton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        vehicle_no = new javax.swing.JTextField();
        license_issue_date = new com.toedter.calendar.JDateChooser();
        license_expire_date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        driver_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        driver_login_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        license_id = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Add Driver");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Dashboard / Add Driver");

        driver_full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driver_full_nameActionPerformed(evt);
            }
        });

        class_of_vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_of_vehicleActionPerformed(evt);
            }
        });

        edbutton.setText("Edit Driver");
        edbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edbuttonActionPerformed(evt);
            }
        });

        adbutton.setText("Add Driver");
        adbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbuttonActionPerformed(evt);
            }
        });

        rdbutton.setText("Remove Driver");
        rdbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbuttonActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        vehicle_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_noActionPerformed(evt);
            }
        });

        jLabel3.setText("Driver Full Name");

        jLabel4.setText("License issue date");

        jLabel5.setText("License expire date");

        jLabel6.setText("Vehicle no");

        jLabel7.setText("Class of vehicle");

        jLabel8.setText("Driver Email");

        jLabel10.setText("Password");

        jLabel2.setText("License Id");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(license_expire_date, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(license_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(driver_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(search))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(license_issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(driver_login_password, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(driver_email))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(rdbutton)
                        .addGap(52, 52, 52)
                        .addComponent(edbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vehicle_no, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(class_of_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(license_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(search)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driver_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(license_expire_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(driver_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(driver_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(license_issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicle_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(class_of_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edbutton)
                    .addComponent(adbutton)
                    .addComponent(rdbutton)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void driver_full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driver_full_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driver_full_nameActionPerformed

    private void class_of_vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_of_vehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_of_vehicleActionPerformed

    private void edbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edbuttonActionPerformed
        // TODO add your handling code here:
        try{
            
                String update_driver_query = "UPDATE driver SET driver_email = '" + driver_email.getText() 
                        +"', driver_password ='"+ driver_login_password.getText() 
                        +"', driver_full_name ='"+ driver_full_name.getText() 
                        +"', license_issue_date ='"+ license_issue_date.getDate() 
                        +"', license_expire_date ='"+ license_expire_date.getDate()
                        +"', vehicle_no='"+ vehicle_no.getText()
                        +"', class_of_vehicle ='"+ class_of_vehicle.getText()+"'" ;
                PreparedStatement pst = myConn.prepareStatement(update_driver_query); 
                pst.execute();
                JOptionPane.showMessageDialog(null, "The driver was edited!");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "The driver was not edited!");
            System.out.println("The error was" + e);
        }
    }//GEN-LAST:event_edbuttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MDlogin mdlog = new MDlogin();
        mdlog.show();//display MDlogin here
        dispose();//close current frame(addriver) after opening MDlogin
    }//GEN-LAST:event_backActionPerformed

    private void adbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbuttonActionPerformed
        // TODO add your handling code here:
        try{
            if(  driver_full_name.getText().equals("")
                 ||driver_email.getText().equals("")||license_issue_date.getDate().equals("")
                 ||driver_login_password.getText().equals("")||license_expire_date.getDate().equals("")
                 ||vehicle_no.getText().equals("")||class_of_vehicle.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please ensure to fill out all necessary informations!");
            }
            else{
                String save_driver_query = "INSERT INTO driver("
                     +"`driver_email`,`driver_password`,`driver_full_name`,`license_issue_date`,`license_expire_date`,`vehicle_no`,`class_of_vehicle`)"
                     +"VALUES('"+driver_email.getText()+"','"+driver_login_password.getText()+"','"
                     +driver_full_name.getText()+"','"
                     +license_issue_date.getDate()+"','"+license_expire_date.getDate()+"','"
                     +vehicle_no.getText()+"','"+class_of_vehicle.getText()+"')";
                PreparedStatement pst = myConn.prepareStatement(save_driver_query); 
                pst.execute();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "The driver was not saved!");
            System.out.println("The error was" + e);
        }
    }//GEN-LAST:event_adbuttonActionPerformed

    private void rdbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbuttonActionPerformed
        // TODO add your handling code here:
        try{
                int license_id1 = Integer.parseInt(license_id.getText());
                String delete_driver_query = "DELETE FROM driver where license_id = " + license_id1;
                PreparedStatement pst = myConn.prepareStatement(delete_driver_query); 
                pst.execute();
                JOptionPane.showMessageDialog(null, "The driver was removed!");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "The driver was not removed!");
            System.out.println("The error was" + e);
        }
    }//GEN-LAST:event_rdbuttonActionPerformed

    private void vehicle_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_noActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         try{
            
            int driver_id1 = Integer.parseInt(license_id.getText());
            String q1 = "SELECT * FROM `driver` WHERE license_id = '" +driver_id1+"'";
            PreparedStatement pst1 = myConn.prepareStatement(q1);
            ResultSet rs = pst1.executeQuery();
            String driver_email1 = ""; 
            String driver_full_name1 = "";
            String driver_password1 = "";
            String license_issue_date1 = "";
            String license_expire_date1 = "";
            int vehicle_no1 = 0;
            String class_of_vehicle1 = "";
            while(rs.next()) {
                 driver_email1= rs.getString("driver_email");
                 driver_password1 = rs.getString("driver_password");
                 driver_full_name1=  rs.getString("driver_full_name");
                 license_issue_date1 = rs.getString("license_issue_date");
                 license_expire_date1 = rs.getString("license_expire_date");
                 vehicle_no1 = rs.getInt("vehicle_no");
                 class_of_vehicle1 = rs.getString("class_of_vehicle");
            }
            driver_email.setText(driver_email1);
            driver_login_password.setText(driver_password1);
            driver_full_name.setText(driver_full_name1);
            long license_issue_date2= Date.parse(license_issue_date1);
            Date license_issue_date3 = new Date(license_issue_date2);
            license_issue_date.setDate(license_issue_date3);
            long license_expire_date2= Date.parse(license_expire_date1);
            Date license_expire_date3 = new Date(license_expire_date2);
            license_expire_date.setDate(license_expire_date3);
            String vehicle_no2 = Integer.toString( vehicle_no1);
            vehicle_no.setText(vehicle_no2);
            class_of_vehicle.setText( class_of_vehicle1);
        }
        catch(Exception e1){
            System.out.println("The error was" + e1);
        }
    }//GEN-LAST:event_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(addriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addriver().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adbutton;
    private javax.swing.JButton back;
    private javax.swing.JTextField class_of_vehicle;
    private javax.swing.JTextField driver_email;
    private javax.swing.JTextField driver_full_name;
    private javax.swing.JTextField driver_login_password;
    private javax.swing.JButton edbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser license_expire_date;
    private javax.swing.JTextField license_id;
    private com.toedter.calendar.JDateChooser license_issue_date;
    private javax.swing.JButton rdbutton;
    private javax.swing.JButton search;
    private javax.swing.JTextField vehicle_no;
    // End of variables declaration//GEN-END:variables
}
