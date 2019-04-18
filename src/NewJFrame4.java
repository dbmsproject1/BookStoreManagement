/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Admin
 */
public class NewJFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame4
     */
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public NewJFrame4() {
        initComponents();
        con=jdbcConnection.dbConnection();
        updateTable();
    }
    private void updateTable(){
        String sql="select * from booktech11";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void clearfeild(){
        text_no.setText(null);
        text_name.setText(null);
        text_author.setText(null);
        text_edition.setText(null);
        text_cat.setText(null);
        text_price.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_no = new javax.swing.JTextField();
        text_name = new javax.swing.JTextField();
        text_author = new javax.swing.JTextField();
        text_price = new javax.swing.JTextField();
        text_edition = new javax.swing.JTextField();
        text_block = new javax.swing.JTextField();
        text_cat = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(945, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 13, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Book_no");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Book_name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Author_Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Edition");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Block");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        text_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_noActionPerformed(evt);
            }
        });
        getContentPane().add(text_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, -1));
        getContentPane().add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, -1));
        getContentPane().add(text_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, -1));

        text_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_priceActionPerformed(evt);
            }
        });
        getContentPane().add(text_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 190, -1));
        getContentPane().add(text_edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 190, -1));

        text_block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_blockActionPerformed(evt);
            }
        });
        getContentPane().add(text_block, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 190, -1));
        getContentPane().add(text_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 190, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 90, 440, 390));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("ADD BOOK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.setActionCommand("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_blockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_blockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_blockActionPerformed

    private void text_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_priceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new update().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_noActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql="update BOOKTECH11 set "
                    +"BOOK_NAME='"+text_name.getText()+"',"
                    +"AUTHOR_NAME='"+text_author.getText()+"',"
                    +"PRICE='"+text_price.getText()+"',"
                    +"EDITION='"+text_edition.getText()+"',"
                    +"CATEGORY='"+text_cat.getText()+"' "
                    +"WHERE BOOK_NO='"+text_no.getText()+"' ";
        System.out.println(sql); 
        try {
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Updated");
            updateTable();
            clearfeild();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int row=jTable1.getSelectedRow();
      
        System.err.println(row);
      String selection=jTable1.getModel().getValueAt(row,3).toString();
      String sql="select * from booktech11 where PRICE = "+selection;
      try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                text_no.setText(rs.getString("BOOK_NO"));
                text_name.setText(rs.getString("BOOK_NAME"));
                text_author.setText(rs.getString("AUTHOR_NAME"));
                text_price.setText(rs.getString("PRICE"));
                text_edition.setText(rs.getString("EDITION"));
                text_cat.setText(rs.getString("CATEGORY"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
     int row=jTable1.getSelectedRow();
      
        System.err.println(row);
      String selection=jTable1.getModel().getValueAt(row,3).toString();
      String sql="select * from booktech11 where PRICE = "+selection;
      try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                text_no.setText(rs.getString("BOOK_NO"));
                text_name.setText(rs.getString("BOOK_NAME"));
                text_author.setText(rs.getString("AUTHOR_NAME"));
                text_price.setText(rs.getString("PRICE"));
                text_edition.setText(rs.getString("EDITION"));
                text_cat.setText(rs.getString("CATEGORY"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         String sql="Insert into booktech11 (BOOK_NO,BOOK_NAME,AUTHOR_NAME,PRICE,EDITION,CATEGORY) VALUES (?,?,?,?,?,?)";
            try {
            pst=con.prepareStatement(sql);
            pst.setString(1, text_no.getText());
            pst.setString(2, text_name.getText());
            pst.setString(3, text_author.getText());
            pst.setString(4, text_price.getText());
            pst.setString(5, text_edition.getText());
            pst.setString(6, text_cat.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Insertion sucessfull");
            updateTable();
            clearfeild();
            pst.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int row = jTable1.getSelectedRow();
        String cell= jTable1.getModel().getValueAt(row,3).toString();
        String sql="DELETE FROM BOOKTECH11 WHERE PRICE = "+ cell;
        try {
            pst= con.prepareStatement(sql);
            pst.execute();
            updateTable();
            clearfeild();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text_author;
    private javax.swing.JTextField text_block;
    private javax.swing.JTextField text_cat;
    private javax.swing.JTextField text_edition;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_no;
    private javax.swing.JTextField text_price;
    // End of variables declaration//GEN-END:variables
}
