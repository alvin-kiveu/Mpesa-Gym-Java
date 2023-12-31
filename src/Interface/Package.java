/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ccs
 */
public class Package extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    private String parseSql;
    String pid;
    String name;
    String hour;
    String milk;
    String tablet;
    String expert;
    String body;
    
    public Package() {
        initComponents();
         conn=DBConnect.connect();
        tablelord();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpackage = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txthour = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtpackagename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbbodycheckup = new javax.swing.JComboBox();
        cmbadvice = new javax.swing.JComboBox();
        cmbtablet = new javax.swing.JComboBox();
        cmbmilk = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Create Packages");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 400, 50));

        tblpackage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblpackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpackageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpackage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 380, 130));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel1.setText("Package name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel3.setText("Hours per week :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 109, -1, 30));
        jPanel1.add(txthour, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, -1));
        jPanel1.add(txtpackagename, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 220, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel5.setText("Body Check-Up :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        cmbbodycheckup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanel1.add(cmbbodycheckup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 220, -1));

        cmbadvice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanel1.add(cmbadvice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 220, -1));

        cmbtablet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanel1.add(cmbtablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 220, -1));

        cmbmilk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jPanel1.add(cmbmilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel6.setText("Expert Advice :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel7.setText("Tablet :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 189, -1, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 3, 14)); // NOI18N
        jLabel8.setText("Milk :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 110, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      getData();
        try {
                String q= "INSERT INTO `package`(`name`, `hours`, `milk`, `tablet`, `expert`, `body`) VALUES ('"+name+"','"+hour+"','"+milk+"','"+tablet+"','"+expert+"','"+body+"')";
                 pst=conn.prepareStatement(q);
                pst.execute(); 
                JOptionPane.showMessageDialog(rootPane,"Package added successfully");
                
                    } 
                catch (Exception e) 
                {
       
                 JOptionPane.showMessageDialog(rootPane,e);                    
                } 
        tablelord();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
         int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to delete");
        if(x==0)
        {
        try {
                String sql="DELETE FROM `package` WHERE name='"+ txtpackagename.getText() +"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                
                tablelord();
                clearData();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       getData();
        try {
              String squpdate = "UPDATE `package` SET `hours`='"+hour+"',`milk`='"+milk+"',`tablet`='"+tablet+"',`expert`='"+expert+"',`body`='"+body+"' WHERE name = '"+txtpackagename.getText()+"'";
              pst=conn.prepareStatement(squpdate);
                pst.execute();  
                clearData();
                tablelord();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,e);              
            }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblpackageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpackageMouseClicked
       DefaultTableModel tmodel=(DefaultTableModel)tblpackage.getModel();
        int selectrowindex=tblpackage.getSelectedRow();
        txtpackagename.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txthour.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        cmbmilk.setSelectedItem(tmodel.getValueAt(selectrowindex, 2).toString());
        cmbtablet.setSelectedItem(tmodel.getValueAt(selectrowindex, 3).toString());
        cmbadvice.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        cmbbodycheckup.setSelectedItem(tmodel.getValueAt(selectrowindex, 5).toString());

    }//GEN-LAST:event_tblpackageMouseClicked

    private void getData()
    {
    
        name = txtpackagename.getText();
        hour = txthour.getText();
       
        
        milk = cmbmilk.getSelectedItem().toString();
        tablet = cmbtablet.getSelectedItem().toString();
        expert = cmbadvice.getSelectedItem().toString();
        body = cmbbodycheckup.getSelectedItem().toString();
        
    
    }
    private void clear()
    {
    
        txtpackagename.setText("");
        txthour.setText("");
        cmbmilk.setSelectedIndex(0);
        cmbtablet.setSelectedIndex(0);
        cmbadvice.setSelectedIndex(0);
        cmbbodycheckup.setSelectedIndex(0);
    
    
    }
     private void tablelord()
    {
        try {
            String sql="SELECT `name` as 'Package Name', `hours` as 'Hours', `milk` as 'Milk', `tablet` as 'Tablet', `expert` as 'Expert Advice', `body` as 'Body Checkup' FROM `package`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblpackage.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            clear();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }
    private void clearData()
    {
    
        txtpackagename.setText("");
        txthour.setText("");
  
        cmbmilk.setSelectedIndex(0);
        cmbadvice.setSelectedIndex(0);
        cmbbodycheckup.setSelectedIndex(0);
        cmbtablet.setSelectedIndex(0);

    
    }
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
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Package().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbadvice;
    private javax.swing.JComboBox cmbbodycheckup;
    private javax.swing.JComboBox cmbmilk;
    private javax.swing.JComboBox cmbtablet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpackage;
    private javax.swing.JTextField txthour;
    private javax.swing.JTextField txtpackagename;
    // End of variables declaration//GEN-END:variables
}
