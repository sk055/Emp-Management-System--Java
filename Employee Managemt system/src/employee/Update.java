/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Update.java
 *
 * Created on Jan 12, 2011, 9:15:53 AM
 */

package employee;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Update extends javax.swing.JFrame {
Connection con;
Statement stat, upStat;
ResultSet rs;
    /** Creates new form Update */
    public Update() {
        initComponents();
         try{
        Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/projects", "root","tiger");
        JOptionPane.showMessageDialog(null, "Connection Established With Database");
        stat=con.createStatement();
        rs=stat.executeQuery("select * from emp");

       while(rs.next())
        {
            cbEmpno.addItem(rs.getInt("empno"));

        }

        }
        catch(Exception e)
        {}
        disAllow();
    }
    
public void disAllow()
{
        tfEName.setEnabled(false);
        tfCity.setEnabled(false);
        tfJob.setEnabled(false);
        tfSal.setEnabled(false);
        tfDeptNo.setEnabled(false);
      
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfEName = new javax.swing.JTextField();
        btnMain = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        tfSal = new javax.swing.JTextField();
        tfDeptNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfJob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        cbEmpno = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Dept. No.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setText("Update Form");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Employee ID");

        tfEName.setFont(new java.awt.Font("Tahoma", 1, 14));

        btnMain.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnMain.setText("Back To Main Form");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Salary");

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tfSal.setFont(new java.awt.Font("Tahoma", 1, 14));

        tfDeptNo.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("City");

        tfJob.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Job");

        tfCity.setFont(new java.awt.Font("Tahoma", 1, 14));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEmpno, 0, 185, Short.MAX_VALUE)
                            .addComponent(tfSal, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(tfJob, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(tfCity, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(tfEName, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(tfDeptNo, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShow)
                    .addComponent(btnUpdate))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShow)
                        .addGap(79, 79, 79)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(cbEmpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfDeptNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMain)
                            .addComponent(btnExit))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // TODO add your handling code here:
        Main main=new Main();
        main.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_btnMainActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            int sal=Integer.parseInt(tfSal.getText());


            int res=JOptionPane.showConfirmDialog(null, "Are u sure want to update the current record .....");
            if(res==JOptionPane.YES_OPTION) {
                upStat=con.createStatement();
                upStat.execute("update emp set sal="+ sal +" where empno= "+ cbEmpno.getSelectedItem() +";");
                JOptionPane.showMessageDialog(null, "Record is Updated in the database....");
                upStat.close();

                //blank all the text fields
                tfEName.setText(null);
                tfCity.setText(null);
                tfJob.setText(null);
                tfSal.setText(null);
                tfDeptNo.setText(null);

                cbEmpno.removeAllItems();
                rs=stat.executeQuery("Select * from emp");

                while(rs.next()){
                    cbEmpno.addItem(rs.getInt("empno"));
                }
                tfSal.setEnabled(false);
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        try{
            rs.first();
            rs.relative(cbEmpno.getSelectedIndex());
            tfEName.setText(rs.getString("ename"));
            tfCity.setText(rs.getString("city"));
            tfJob.setText(rs.getString("job"));
            tfSal.setText(rs.getString("sal"));
            tfDeptNo.setText(rs.getString("deptno"));
            tfSal.setEnabled(true);

        }
        catch(Exception e){}
}//GEN-LAST:event_btnShowActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbEmpno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfDeptNo;
    private javax.swing.JTextField tfEName;
    private javax.swing.JTextField tfJob;
    private javax.swing.JTextField tfSal;
    // End of variables declaration//GEN-END:variables

}