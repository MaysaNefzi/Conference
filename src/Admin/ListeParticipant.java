package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaefdfyjhlk
 */
public class ListeParticipant extends javax.swing.JFrame {
    String tot_par;
    String tot_E;
    String tot_pro;
    String tot_ac;

    /**
     * Creates new form AfficherPartichipant
     */
    public ListeParticipant() throws ClassNotFoundException {
        initComponents(); 
    }
    public ListeParticipant(String Code) throws ClassNotFoundException {
        initComponents();
        table_participants();
        tot_par=total_p();
        tot_E=total_E();
        tot_pro=total_Pro();
        tot_ac=total_Ac();
        lab_tot.setText(tot_par);
        lab_e.setText(tot_E);
        lab_a.setText(tot_pro);
        lab_p.setText(tot_ac);
        lab_code.setText(Code);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab_tot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lab_e = new javax.swing.JLabel();
        lab_a = new javax.swing.JLabel();
        lab_p = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        participant_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lab_code = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

        jButton2.setText("ANNULER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liste des  Participants :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Les etudiants :");

        lab_tot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_tot.setForeground(new java.awt.Color(255, 255, 255));
        lab_tot.setText("label");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Les Académiques: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Les Professionnels :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nbr T.O.T des participants : ");

        lab_e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_e.setForeground(new java.awt.Color(255, 255, 255));
        lab_e.setText("label");

        lab_a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_a.setForeground(new java.awt.Color(255, 255, 255));
        lab_a.setText("label");

        lab_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lab_p.setForeground(new java.awt.Color(255, 255, 255));
        lab_p.setText("label");

        participant_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(participant_table);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code Conference");

        lab_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_code.setForeground(new java.awt.Color(255, 255, 255));
        lab_code.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lab_p))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(lab_tot))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lab_e))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lab_a)))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel3)
                .addGap(123, 123, 123)
                .addComponent(lab_code)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lab_code))
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lab_tot))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lab_e))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lab_a))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lab_p)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        Event E = null;
        try {
            E = new Event();
        } catch (SQLException ex) {
            Logger.getLogger(ListeParticipant.class.getName()).log(Level.SEVERE, null, ex);
        }
        E.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListeParticipant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeParticipant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeParticipant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeParticipant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListeParticipant().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ListeParticipant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void table_participants() throws ClassNotFoundException
    {
        String sql="SELECT nom,situation FROM participant WHERE conderence=?";
        try
        {
            String urlPilote="oracle.jdbc.driver.OracleDriver";
            String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
            Class.forName(urlPilote);
            Connection con = DriverManager.getConnection(urlBD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,lab_code.getText());
            ResultSet res=ps.executeQuery();
            participant_table.setModel(DbUtils.resultSetToTableModel(res));
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public String total_p() throws ClassNotFoundException
    {
        int tot = 0;
        String total_participant = null;
        String sql="SELECT count(*) FROM participant WHERE conderence=?";
        try
        {
            String urlPilote="oracle.jdbc.driver.OracleDriver";
            String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
            Class.forName(urlPilote);
            Connection con = DriverManager.getConnection(urlBD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,lab_code.getText());
            ResultSet res=ps.executeQuery();
            while(res.next())
            {
              tot=res.getInt(1);
              total_participant=""+tot;
            }
 
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return (total_participant);
    }
    public String total_E() throws ClassNotFoundException
    {
        int tot = 0;
        String sit="etudiant";
        String total_etudiant= null;
        String sql="SELECT count(*) FROM participant WHERE conderence=? and situation =?";
        try
        {
            String urlPilote="oracle.jdbc.driver.OracleDriver";
            String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
            Class.forName(urlPilote);
            Connection con = DriverManager.getConnection(urlBD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,lab_code.getText());
            ps.setString(2,sit);
            ResultSet res=ps.executeQuery();
            res.next();
             while(res.next())
            {
              tot=res.getInt(1);
              total_etudiant=""+tot;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return (total_etudiant);
    }
    public String total_Ac() throws ClassNotFoundException
    {
        int tot = 0;
        String sit="academic";
        String total_academic = null;
        String sql="SELECT count(*) FROM participant WHERE conderence=? and situation =?";
        try
        {
            String urlPilote="oracle.jdbc.driver.OracleDriver";
            String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
            Class.forName(urlPilote);
            Connection con = DriverManager.getConnection(urlBD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,lab_code.getText());
            ps.setString(2,sit);
            ResultSet res=ps.executeQuery();
            res.next();
            while(res.next())
            {
              tot=res.getInt(1);
              total_academic=""+tot;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return (total_academic);
    }
    public String total_Pro() throws ClassNotFoundException
    {
        int tot = 0;
        String sit="professional";
        String total_pro = null;
        String sql="SELECT count(*) FROM participant where conderence= ? and situation =?";
        try
        {
            String urlPilote="oracle.jdbc.driver.OracleDriver";
            String urlBD="jdbc:oracle:thin:testuser/testuser@localhost";
            Class.forName(urlPilote);
            Connection con = DriverManager.getConnection(urlBD);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,lab_code.getText());
            ps.setString(2,sit);
            ResultSet res=ps.executeQuery();
            res.next();
           while(res.next())
            {
              tot=res.getInt(1);
              total_pro=""+tot;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return (total_pro);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_a;
    private javax.swing.JLabel lab_code;
    private javax.swing.JLabel lab_e;
    private javax.swing.JLabel lab_p;
    private javax.swing.JLabel lab_tot;
    private javax.swing.JTable participant_table;
    // End of variables declaration//GEN-END:variables
}
