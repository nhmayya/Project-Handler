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
import static java.sql.Types.INTEGER;
import static javax.accessibility.AccessibleText.CHARACTER;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TEAM_CREATION extends javax.swing.JFrame {

    /**
     * Creates new form TEAM_CREATION
     */
    public TEAM_CREATION() {
        initComponents();
        this.setLocationRelativeTo(this);
         try{
            if(a1.length==10){   
        int x=Integer.parseInt(a1[0]);
        int y=Integer.parseInt(a1[1]);
        int w=Integer.parseInt(a1[2]);
        int h=Integer.parseInt(a1[3]);
        this.setBounds(x, y, w, h);
        }
        }catch(NullPointerException e){}
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tigerback.jpg")));
        this.setResizable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("TEAM ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 69, 75, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("PROJECT TITLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 154, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("GUIDE ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 230, 75, -1));

        jTextField1.setBackground(new java.awt.Color(102, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 263, -1));

        jTextField2.setBackground(new java.awt.Color(102, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 267, -1));

        jTextField3.setBackground(new java.awt.Color(102, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 230, 270, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< CANCEL >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 414, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("< OK >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 414, 93, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 300, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("MEMBERS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 303, 75, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("only USN seperated by ,");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 128, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dragback.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
                   Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[6];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
    s[4]="create";
      student_button.main(s);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{
          
          String sql="select faculty_id from faculty where faculty_id=?";
          PreparedStatement p=myconnection.getConnection().prepareStatement(sql);
          p.setString(1, jTextField3.getText().trim());
          ResultSet rs=p.executeQuery();
          if(jTextField1.getText().equals(""))
              JOptionPane.showMessageDialog(this, "TEAM ID IS EMPTY", "ERROR", 3);
          else if(jTextField4.getText().equals(""))  JOptionPane.showMessageDialog(this, "ENTER THE MEMBERS", "ERROR", 3);
          
          else if(!rs.next()){
                  JOptionPane.showMessageDialog(rootPane, "Faculty ID is not correct");
              }
          else{
              String[] str=new String[10];
              
                  str=jTextField4.getText().trim().split(",");
                  
              
              int rss=0,i=0,j=0;
              dps: while(i<str.length){
                  try{
                      
                       
                   String sql1="select id from department where department=?";
                   PreparedStatement ps2=myconnection.getConnection().prepareStatement(sql1);
                   ps2.setString(1, a1[4].trim());
                   rs=ps2.executeQuery();
                   rs.next();
                   String did=rs.getString(1);
                   System.out.println("did is "+did);
                      
                      if(str[i].trim().equals("")){ 
                          JOptionPane.showMessageDialog(rootPane, "NULL value given as input");
                          
                          j=1;
                          break dps;
                          
                      }
                      else{
                          sql="select sem,section,id,team_id from student where usn=?";
                          PreparedStatement ps1=myconnection.getConnection().prepareStatement(sql);
                              ps1.setString(1,str[i].trim());
                        
                      rs=ps1.executeQuery();
                      rs.next();
                      System.out.println(a1[5]+".."+a1[6]+".."+rs.getString(1).trim()+","+rs.getString(2).trim()+","+rs.getString(3)+",,"+a1[5]);
                      if(!(rs.getString(1).trim().equals(a1[5].trim())&&rs.getString(2).trim().equals(a1[6].trim())&&did.equals(rs.getString(3).trim()))) {JOptionPane.showMessageDialog(rootPane, "USN "+str[i]+" not in given Semister or Section or Department","",3);
                      j=1;
                      
                      break dps;}
                      try{
                       if(!(rs.getString(4).trim().equals(null)||rs.getString(4).trim().equals(jTextField1.getText().trim()))){
                              JOptionPane.showMessageDialog(rootPane,"student "+str[i]+" Already in a team ->"+rs.getString(4).trim());
                              j=1;
                            //  System.out.println("ide batthnd");
                                      break dps;
                      }
                      } catch(NullPointerException e){}
                      }
                  }catch(Exception e){System.out.println("dp "+e);}
                  i++;
                  
              }
              System.out.println("j is "+j);
              
               
              
                if(j==0){
                    ss=12;
                    String check="select * from team where TEAM_ID=?";
                    PreparedStatement  ps1=myconnection.getConnection().prepareStatement(check);
                    ps1.setString(1,jTextField1.getText().trim());
                     rs=ps1.executeQuery();
                     
                     rs.next();
                     System.out.print("rs is "+rs);
                     try{
                         
                    if(!rs.getString(1).equals(null)) {ss=9;JOptionPane.showMessageDialog(rootPane, "Already Team  "+jTextField1.getText().trim()+"  is exist");}
                    }catch(Exception e){}if(ss==12){
                sql="insert into team values(?,?,?,?,0)";
             PreparedStatement  ps=myconnection.getConnection().prepareStatement(sql);
              ps.setString(1, jTextField1.getText().trim());
              ps.setString(2, jTextField2.getText().trim());
              ps.setString(3, jTextField3.getText().trim());
              ps.setNull(4, INTEGER);
               rss=ps.executeUpdate();
              if(rss!=0)
                  JOptionPane.showMessageDialog(this, "SUCCESSFULLY CREATED", "", 1);
              
          
                }
                     
                
                   i=0;
                   if(j==0){
                while(i<str.length){
                  try{
                     
               sql="update student set TEAM_ID=? where USN=?";
             PreparedStatement ps=myconnection.getConnection().prepareStatement(sql);
              ps.setString(1,jTextField1.getText().trim());
              System.out.println( "str["+i+"] is "+str[i]);
              ps.setString(2, str[i]);
                rss=ss=ps.executeUpdate();
               System.out.print("rss= "+ss);
               if(ss==0)
                   JOptionPane.showMessageDialog(rootPane, "given usn inforamtion ("+str[i]+") ,is not correct");
               } catch(Exception e){System.out.print("ffff 0 "+e);}
                   i++;
              }
                }
                }
      }
      }
      catch(Exception e){System.out.print(e+" here");}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private static String a1[]=new String[12];
    int ss=0;
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
            java.util.logging.Logger.getLogger(TEAM_CREATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEAM_CREATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEAM_CREATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEAM_CREATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        a1=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEAM_CREATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
