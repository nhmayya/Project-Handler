/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashScreenz;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class DEPARTMENT_BUTTON extends javax.swing.JFrame {

    /**
     * Creates new form DEPARTMENT_BUTTON
     */
    public DEPARTMENT_BUTTON() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tigerback.jpg")));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        System.out.println("a1 is "+a1.length);
         try{
            if(a1.length==5){   
        int x=Integer.parseInt(a1[0].trim());
        int y=Integer.parseInt(a1[1].trim());
        int w=Integer.parseInt(a1[2].trim());
        int h=Integer.parseInt(a1[3].trim());
        this.setBounds(x, y, w, h);
        }
        }catch(NullPointerException e){}
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("SELECT DEPARTMENT :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, 50));

        jComboBox1.setBackground(new java.awt.Color(0, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTER SCIENCE AND ENGINEERING", "INFORMATION SCIENCE AND ENGINEERING", "MECHANICAL ENGINEERING", "ELECTRICAL ENGINEERING", "MARINE ENGINEERING", "ELECTRONICS AND COMMUNICATION ENGINEERING", "ELECTRICAL AND ELECTRONICS ENGINEERING", "CIVI ENGINEERING", "NANO TECHNOLOGY AND ENGINEERING", "AERONAUTICAL ENGINEERING", "OTHERS" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 290, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< CANCEL >");
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("< NEXT >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dragback.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(info==1){
           
           str[0]=(String) jComboBox1.getSelectedItem();
         //  this.dispose();
           DEFAULT_FACULTY.main(str);
       }
       else if(info==3){
                     Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[5];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
           s[4]=(String) jComboBox1.getSelectedItem();
           this.dispose();
           team_delete.main(s);
       }
       else{
             Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[5];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
           s[4]=(String) jComboBox1.getSelectedItem();
           this.dispose();
           DEPARTMENT_BUTTON_NEXT.main(s);
       }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      if(info==1){ 
           Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[4];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
    this.dispose();
          INFORMATION.main(s);}
      else {
                    Point FormLocation;
    FormLocation=this.getLocation();
    Dimension dim1=this.getSize();
    String s[]=new String[4];
    s[0]=String.valueOf(FormLocation.x);
    s[1]=String.valueOf(FormLocation.y);
    s[2]=String.valueOf(dim1.width);
    s[3]=String.valueOf(dim1.height);
    this.dispose();
          EDIT_ACTION.main(s);}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     */
    private static String a1[]=new String[10];
    private static String str[]=new String[4];
    public static int info=0;
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
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEPARTMENT_BUTTON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        a1=args;
        java.awt.EventQueue.invokeLater(() -> {
             if("information".equals(a1[4]))
            info=1;
             else if(a1[4].equals("deletes")) info=3;
             
             else info=2;
            new DEPARTMENT_BUTTON().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
