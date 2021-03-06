/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author sundar
 */
public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form UserHome
     */
    public UserHome() {
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

        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton6.setToolTipText("Logout");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(159, 59));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 40, 20, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("Search");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 340, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Book Name", "By Author Name", "By Category", "By BookID" }));
        jComboBox1.setToolTipText(" Select Category");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 147, -1));

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author Name", "Category", "Available Books", "No. of Books"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setEnabled(false);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 680, 120));

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Book ID", "Book Name", "Issue Date", "Due Date", "Return"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 680, 140));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HISTORY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER  LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pexels-wendy-van-zyl-1112048.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int opt=JOptionPane.showConfirmDialog(null, "Do you want to Logout","Logout",JOptionPane.YES_NO_OPTION);
        if(opt==0)
        {
            dispose();
            new RootUserLogin().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed
 private void theader()
    {
        JTableHeader thead = jTable1.getTableHeader();
        thead.setFont(new Font("Tohome",Font.BOLD,14));
        JTableHeader THEAD = jTable2.getTableHeader();
        THEAD.setFont(new Font("Tohome",Font.BOLD,14));
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(150);
        TableColumn col2=jTable2.getColumnModel().getColumn(1);
        col2.setPreferredWidth(200);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try
        {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        String s="yes";
        ResultSet rs=st.executeQuery("select issue.bookID as 'Book ID',Books.bookName as 'Book Name',issue.issueDate as 'Issue Date',issue.dueDate as 'Due Date','"+s+"' as 'Return Book Status' from user inner join Books inner join issue where Books.bookID=issue.bookID and user.userID=issue.userID and user.userID='"+UserLogin.jTextField1.getText()+"'");
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        theader();
        jLabel5.setText(UserLogin.jTextField1.getText());
        ResultSet rsm=st.executeQuery("select *from user where userID='"+UserLogin.jTextField1.getText()+"'");
        rsm.next();
        jLabel6.setText(rsm.getString(2));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select bookID as 'Book ID',bookName as 'Book Name',authorName as 'Author Name',category as 'Category',availableBooks as 'Available Books',noOfBooks as 'No of Books' from Books");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                theader();
            }
            catch(SQLException e)
            {
            }
    }//GEN-LAST:event_formComponentShown

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String search=jTextField1.getText();
        String category=(String)jComboBox1.getSelectedItem();
        try
        {
            switch (category) {
                case "By Book Name" ->                     {
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select Books.bookID as 'Book ID',Books.bookName as 'Book Name',Books.authorName as 'Author Name',Books.category as 'Category',Books.availableBooks as 'Available Books',Books.noOfBooks as 'No. of Books' from Books where Books.bookName like'%"+search+"%'");
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        theader();
                    }
                case "By Author Name" ->                     {
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select Books.bookID as 'Book ID',Books.bookName as 'Book Name',Books.authorName as 'Author Name',Books.category as 'Category',Books.availableBooks as 'Available Books',Books.noOfBooks as 'No. of Books' from Books where Books.authorName like'%"+search+"%'");
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        theader();
                    }
                case "By BookID" ->                     {
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select Books.bookID as 'Book ID',Books.bookName as 'Book Name',Books.authorName as 'Author Name',Books.category as 'Category',Books.availableBooks as 'Available Books',Books.noOfBooks as 'No. of Books' from Books where Books.bookID like'%"+search+"%'");
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        theader();
                    }
                default ->                     {
                        Connection con=ConnectionProvider.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select Books.bookID as 'Book ID',Books.bookName as 'Book Name',Books.authorName as 'Author Name',Books.category as 'Category',Books.availableBooks as 'Available Books',Books.noOfBooks as 'No. of Books' from Books where Books.category like'%"+search+"%'");
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        theader();
                    }
            }
        }
        catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
