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
import javax.swing.table.DefaultTableModel;
import static splashScreenz.student_button.a1;

/**
 *
 * @author user
 */
public class DELETE_TEAM extends javax.swing.JFrame {

    /**
     * Creates new form DELETE_TEAM
     */
    public DELETE_TEAM() {
        initComponents();
         this.setResizable(false);
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
        try{
        String sql="select distinct t.team_id,t.project,t.faculty_id,marks from team t join student s on s.team_id=t.team_id join department x on s.id=x.id where s.id=(select id from department d where d.DEPARTMENT=?) and s.sem=? and s.section=?";
        PreparedStatement p=myconnection.getConnection().prepareStatement(sql);
        p.setString(1, a1[4].trim());
        p.setString(2, a1[5].trim());
        p.setString(3, a1[6].trim());
        ResultSet r=p.executeQuery();
        myconnection.ShowDataInTable(r, jTable1, this);
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(102, 255, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 484, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 166, 107, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 204));
        jButton2.setText("DELETE  ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 236, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("<  EXIT  >");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 311, 107, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dragback.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
          String sql="delete from TEAM where TEAM_ID=?";
         // String usn=(String) jTable1.getText(jTable1.getSelectedRow(), 2);
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
         
         String usn=(model.getValueAt(jTable1.getSelectedRow(), 0)).toString().trim();
        
          PreparedStatement p=myconnection.getConnection().prepareStatement(sql);
      //  p=myconnection.getConnection().prepareStatement(sql);
          p.setString(1, usn);
            p.executeUpdate();
            
          sql="select distinct t.team_id,t.project,t.faculty_id,marks from team t join student s on s.team_id=t.team_id join department x on s.id=x.id where s.id=(select id from department d where d.DEPARTMENT=?) and s.sem=? and s.section=?";
        p=myconnection.getConnection().prepareStatement(sql);
        p.setString(1, a1[4].trim());
        p.setString(2, a1[5].trim());
        p.setString(3, a1[6].trim());
        ResultSet r=p.executeQuery();
        myconnection.ShowDataInTable(r, jTable1, this);
      }
    catch(Exception e){ System.out.print(e);}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{String sql="select team_id from team where team_id in (select t.team_id from team t join student s on s.team_id=t.team_id join department x on s.id=x.id where section=? and sem=? and x.id=(select id from department where DEPARTMENT=?))";
       PreparedStatement p=myconnection.getConnection().prepareStatement(sql);
       p.setString(1, a1[6].trim());
       p.setString(2, a1[5].trim());
       p.setString(3, a1[4].trim());
       ResultSet rs=p.executeQuery();
       while(rs.next()){
           sql="delete from team where team_id=?";
            p=myconnection.getConnection().prepareStatement(sql);
            p.setString(1, rs.getString(1).trim());
            p.executeUpdate();
       }
       
         sql="select distinct t.team_id,t.project,t.faculty_id,marks from team t join student s on s.team_id=t.team_id join department x on s.id=x.id where s.id=(select id from department d where d.DEPARTMENT=?) and s.sem=? and s.section=?";
         p=myconnection.getConnection().prepareStatement(sql);
        p.setString(1, a1[4].trim());
        p.setString(2, a1[5].trim());
        p.setString(3, a1[6]);
        ResultSet r=p.executeQuery();
        myconnection.ShowDataInTable(r, jTable1, this);
       }
catch(Exception e){}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
                   Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[6];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
    s[4]="deletes1";
    student_button.main(s);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
  private static String[] a1=new String[10];
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
            java.util.logging.Logger.getLogger(DELETE_TEAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELETE_TEAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELETE_TEAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELETE_TEAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        a1=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETE_TEAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
