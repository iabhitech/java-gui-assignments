package com.iabhitech.java.guiassignment;

import java.awt.Color;

/**
 *
 * @author Abhineet Verma
 */
public class Assignment4 extends javax.swing.JFrame {

    /**
     * Creates new form Assignment4
     */
    public Assignment4() {
        initComponents();
        this.checkBoxItemStateChanged(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOuter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkBoxRed = new javax.swing.JCheckBox();
        checkBoxGreen = new javax.swing.JCheckBox();
        checkBoxBlue = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        textFieldColorCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Color Combination - Assignment4");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Color Combination");
        jLabel1.setOpaque(true);

        checkBoxRed.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkBoxRed.setText("RED");
        checkBoxRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });

        checkBoxGreen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkBoxGreen.setText("GREEN");
        checkBoxGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });

        checkBoxBlue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkBoxBlue.setText("BLUE");
        checkBoxBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Color Code:");
        jLabel2.setOpaque(true);

        textFieldColorCode.setEditable(false);
        textFieldColorCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout panelOuterLayout = new javax.swing.GroupLayout(panelOuter);
        panelOuter.setLayout(panelOuterLayout);
        panelOuterLayout.setHorizontalGroup(
            panelOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOuterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOuterLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelOuterLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(checkBoxRed)
                .addGap(62, 62, 62)
                .addComponent(checkBoxGreen)
                .addGap(62, 62, 62)
                .addComponent(checkBoxBlue)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        panelOuterLayout.setVerticalGroup(
            panelOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOuterLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(panelOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(panelOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxRed)
                    .addComponent(checkBoxGreen)
                    .addComponent(checkBoxBlue))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOuter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOuter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxItemStateChanged
        // TODO add your handling code here:
        int red = (checkBoxRed.isSelected())?255:0;
        int green = (checkBoxGreen.isSelected())?255:0;
        int blue = (checkBoxBlue.isSelected())?255:0;
        
        textFieldColorCode.setText("("+red+", "+green+", "+blue+")");
        panelOuter.setBackground(new Color(red, green, blue));
    }//GEN-LAST:event_checkBoxItemStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxBlue;
    private javax.swing.JCheckBox checkBoxGreen;
    private javax.swing.JCheckBox checkBoxRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelOuter;
    private javax.swing.JTextField textFieldColorCode;
    // End of variables declaration//GEN-END:variables
}
