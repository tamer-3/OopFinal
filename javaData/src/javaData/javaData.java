package javaData;

import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class javaData extends javax.swing.JFrame {
    
    JFrame window = new JFrame();
    
    private static final String username = "root";
    private static final String password = "T_4m3rl4n";
    private static final String dataConn = "jdbc:mysql://127.0.0.1:3306/"
            + "student";
    Connection sqlConn = null;
    PreparedStatement prep = null;
    ResultSet res = null;

    public javaData() {
        initComponents();
        updDTBS();
        window.setSize(1190, 610);
        this.setIconImage(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("Icon.png")));
    }

    @SuppressWarnings("unchecked")
    
    public void updDTBS(){
        int que,i;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            prep = sqlConn.prepareStatement("SELECT * FROM student.student");
            res = prep.executeQuery();
            
            ResultSetMetaData resData = res.getMetaData();
            que = resData.getColumnCount();
            
            DefaultTableModel defTable = (DefaultTableModel)
                    StudentData.getModel();
            defTable.setRowCount(0);
            
            while (res.next()){
                Vector colData = new Vector();
                
                for(i = 6; i <= que; i++){
                    
                    colData.add(res.getString("ID"));
                    colData.add(res.getString("Name"));
                    colData.add(res.getString("Surname"));
                    colData.add(res.getString("Year"));
                    colData.add(res.getString("Gender"));
                    colData.add(res.getString("StudentID"));
                    
                    defTable.addRow(colData);
                }
            }
        }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        colID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        colName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        colSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        colYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        colGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        colStudentID = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        Info = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentData = new javax.swing.JTable();
        Name = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        Content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 40));

        colID.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 290, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        Content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 40));

        colName.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 290, 40));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Surname");
        Content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 40));

        colSurname.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 290, 40));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year");
        Content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 40));

        colYear.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 290, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gender");
        Content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 40));

        colGender.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colGender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 290, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Student ID");
        Content.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 40));

        colStudentID.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        colStudentID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Content.add(colStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 290, 40));

        addButton.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        Content.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 170, 70));

        deleteButton.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        deleteButton.setText("DEL");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        Content.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 70));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ID columns must be unique");
        Content.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 410, 40));

        Clear.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        Content.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 170, 70));

        exitButton.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        Content.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 170, 70));

        MainPanel.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 410, 470));

        Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentData.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        StudentData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Year", "Gender", "Student ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        StudentData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        StudentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentData);

        Info.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        MainPanel.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 470));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1180, 490));

        Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Name.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ala-Too University DataBase");
        Name.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1160, 80));

        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1160, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            prep = sqlConn.prepareStatement("insert into student(ID,Name,"
                    + "Surname,Year,Gender,StudentID)values"
                    + "(?,?,?,?,?,?)");
            prep.setString(1, colID.getText());
            prep.setString(2, colName.getText());
            prep.setString(3, colSurname.getText());
            prep.setString(4, colYear.getText());
            prep.setString(5, colGender.getText());
            prep.setString(6, colStudentID.getText());
            
            prep.executeUpdate();
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
        updDTBS();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel defTable = (DefaultTableModel)StudentData.getModel();
        
        int SelectRows = StudentData.getSelectedRow();
        
        try {
            int id = Integer.parseInt(
                    defTable.getValueAt(SelectRows, 0).toString());
            int del = JOptionPane.showConfirmDialog(null, "You can't bring "
                    + "back deleted data.","Are you sure?",
                    JOptionPane.YES_NO_OPTION);
            if (del == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            prep = sqlConn.prepareStatement("delete from student where ID = ?");
            prep.setInt(1, id);
            prep.executeUpdate();
            
            colID.setText("");
            colName.setText("");
            colSurname.setText("");
            colYear.setText("");
            colGender.setText("");
            colStudentID.setText("");
            
            
            updDTBS();
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void StudentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentDataMouseClicked
        DefaultTableModel defTable = (DefaultTableModel)StudentData.getModel();
        
        int SelectRows = StudentData.getSelectedRow();
        
        colID.setText(defTable.getValueAt(SelectRows, 0).toString());
        colName.setText(defTable.getValueAt(SelectRows, 1).toString());
        colSurname.setText(defTable.getValueAt(SelectRows, 2).toString());
        colYear.setText(defTable.getValueAt(SelectRows, 3).toString());
        colGender.setText(defTable.getValueAt(SelectRows, 4).toString());
        colStudentID.setText(defTable.getValueAt(SelectRows, 5).toString());
    }//GEN-LAST:event_StudentDataMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        colID.setText("");
        colName.setText("");
        colSurname.setText("");
        colYear.setText("");
        colGender.setText("");
        colStudentID.setText("");
        
        DefaultTableModel defTable = (DefaultTableModel)StudentData.getModel();
        
        int SelectRows = StudentData.getSelectedRow();
        
        updDTBS();
    }//GEN-LAST:event_ClearActionPerformed
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info 
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    javaData.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Info;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Name;
    private javax.swing.JTable StudentData;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField colGender;
    private javax.swing.JTextField colID;
    private javax.swing.JTextField colName;
    private javax.swing.JTextField colStudentID;
    private javax.swing.JTextField colSurname;
    private javax.swing.JTextField colYear;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
