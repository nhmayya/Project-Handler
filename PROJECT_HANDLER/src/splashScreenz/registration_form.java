/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashScreenz;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class registration_form extends javax.swing.JFrame {

    /**
     * Creates new form registration_form
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public registration_form() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tigerback.jpg")));
        this.setTitle("Registration");
        if(a.length==4){
        int x=Integer.parseInt(a[0]);
        int y=Integer.parseInt(a[1]);
        int w=Integer.parseInt(a[2]);
        int h=Integer.parseInt(a[3]);
        this.setBounds(x, y, w, h);
        }
        else{
            this.setLocationRelativeTo(this);
        }
   
      //  checkUsername();
     // setIcon();
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
        jPanel1 = new javax.swing.JPanel();
        dbms_password = new javax.swing.JPasswordField();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jTextField_UN = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setText("cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 371, 103, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dbms_password.setBackground(new java.awt.Color(153, 255, 153));
        dbms_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dbms_password.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(dbms_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 180, 30));

        jPasswordField_REPASS.setBackground(new java.awt.Color(153, 255, 153));
        jPasswordField_REPASS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField_REPASS.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jPasswordField_REPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 180, 30));

        jPasswordField_PASS.setBackground(new java.awt.Color(153, 255, 153));
        jPasswordField_PASS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField_PASS.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(jPasswordField_PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 178, 30));

        jTextField_UN.setBackground(new java.awt.Color(153, 255, 153));
        jTextField_UN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_UN.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField_UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 178, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 204));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 154, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 154, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Repassword");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 154, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("Database Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 231, 23));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dragback.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          String uname = jTextField_UN.getText().trim();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());
         if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Add Username","ERROR",0);
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password","ERROR",0);
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(this, "Retype The Password Again","ERROR",0);
           // login_form.main(null);
        }
        else if(!dbms_password.getText().trim().equals("root123")){
            JOptionPane.showMessageDialog(this,"Database Password is Wrong","ERROR",0);
        }
        
        else {
            if(checkUsername(uname)){
        
            JOptionPane.showMessageDialog(this, "This Username Already Exist","ERROR",0);
        }
            try{
          PreparedStatement ps;
  //     String query = "INSERT INTO `user`(`u_uname`,`u_pass`) VALUES (?,?)";
         String query = "INSERT INTO user VALUES (?,?)";
            ps = myconnection.getConnection().prepareStatement(query);
            
  
            ps.setString(1, uname);
            ps.setString(2, pass);
             if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(this, "New User Added"," SUCCESS",1);
                Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim=this.getSize();
    String s[]=new String[4];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim.width);
    s[3]=String.valueOf(dim.height);
    this.dispose();
   login_form.main(s);
                //this.setVisible(false);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(registration_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim=this.getSize();
    String s[]=new String[4];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim.width);
    s[3]=String.valueOf(dim.height);
    
  login_form.main(s);
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean checkUsername(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean checkuser=false;
        String query="select * from user where u_name=?";
         try {
            ps = myconnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkuser = true;
            }
        }catch(SQLException ex){
             Logger.getLogger(registration_form.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkuser;
          }

    /**
     * @param args the command line arguments
     */
    public static String a[]=new String[4];
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
            java.util.logging.Logger.getLogger(registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       // registration_form.checkUsername();
        //</editor-fold>
       // registration_form.checkUsername();
       
       
        /* Create and display the form */
        a=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration_form().setVisible(true);
            }
        });
    }
       private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));

     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField dbms_password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Point p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
