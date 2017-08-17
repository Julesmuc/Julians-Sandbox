package test.example.JFrames;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class JFrameExampleGUI extends javax.swing.JFrame {

	private static final long serialVersionUID = 500387275147502272L;
	
    public JFrameExampleGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Languages = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new TitledBorder(new CompoundBorder(), "Name", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 51, 102)));
        jPanel1.setName("Name"); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setText("First Name:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name: ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        
        textField = new JTextField();
        textField.setToolTipText("");
        
        JLabel lblEmail = new JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBackground(Color.WHITE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(38)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(18))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField1)
        				.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblEmail))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        Languages.setBorder(new TitledBorder(new CompoundBorder(), "Languages", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 51)));
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Java");
        
        JCheckBox chckbxC = new JCheckBox("C");
        
        JCheckBox chckbxPhp = new JCheckBox("PHP");
        
        JCheckBox chckbxC_1 = new JCheckBox("C++");
        
        JCheckBox chckbxHtml = new JCheckBox("HTML");
        chckbxHtml.setSelected(true);
        
        JCheckBox chckbxPython = new JCheckBox("Python");

        javax.swing.GroupLayout gl_Languages = new javax.swing.GroupLayout(Languages);
        gl_Languages.setHorizontalGroup(
        	gl_Languages.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, gl_Languages.createSequentialGroup()
        			.addGap(109)
        			.addGroup(gl_Languages.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_Languages.createSequentialGroup()
        					.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(chckbxPhp, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)
        					.addComponent(chckbxHtml, GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(chckbxC, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_Languages.createSequentialGroup()
        					.addComponent(chckbxC_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(chckbxPython, GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
        					.addGap(98)))
        			.addGap(109))
        );
        gl_Languages.setVerticalGroup(
        	gl_Languages.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_Languages.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_Languages.createParallelGroup(Alignment.BASELINE)
        				.addComponent(chckbxNewCheckBox)
        				.addComponent(chckbxPhp)
        				.addComponent(chckbxHtml)
        				.addComponent(chckbxC))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_Languages.createParallelGroup(Alignment.BASELINE)
        				.addComponent(chckbxC_1)
        				.addComponent(chckbxPython))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        Languages.setLayout(gl_Languages);

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(151)
        					.addComponent(jButton1))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(Languages, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(Languages, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButton1)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameExampleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel Languages;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private JTextField textField;
}