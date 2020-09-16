
import javax.swing.JOptionPane;

public class TempConverter2 extends javax.swing.JFrame {

    double cel, far;

    public TempConverter2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fbox = new javax.swing.JTextField();
        cbox = new javax.swing.JTextField();
        fbutton = new javax.swing.JButton();
        cbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        answerBox = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Degrees F");

        jLabel2.setText("Enter Degrees C");

        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        fbutton.setText(">>>>");
        fbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbuttonActionPerformed(evt);
            }
        });

        cbutton.setText("<<<<");
        cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuttonActionPerformed(evt);
            }
        });

        answerBox.setBackground(new java.awt.Color(0, 0, 0));
        answerBox.setForeground(new java.awt.Color(255, 255, 255));
        answerBox.setOpaque(true);

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(fbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fbox))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(cbox, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(answerBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3))
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbutton)
                    .addComponent(cbutton))
                .addGap(30, 30, 30)
                .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // read farenheit
        cel = Double.parseDouble(cbox.getText());
        far = (cel * 9.0 / 50) + 32;
        cbox.setText("" + far);
        answerBox.setText(String.format("%.1f C = %.1f F", cel, far));
    }//GEN-LAST:event_cboxActionPerformed

    private void cbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuttonActionPerformed
        try {
            cel = Double.parseDouble(cbox.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error - Must enter a value.");
            return;
        } //stops the program
        far = (cel * 9.0 / 50) + 32;
        cbox.setText("" + far);
        answerBox.setText(String.format("%.1f C = %.1f F", cel, far));
    }//GEN-LAST:event_cbuttonActionPerformed

    private void fbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbuttonActionPerformed
        try {
            far = Double.parseDouble(fbox.getText());
        } catch (Exception e) {
            //what to do if error is thrown
            JOptionPane.showMessageDialog(this, "Error - Must enter a value.");
            return; //stops the program
        }
        cel = (far - 32) * 5 / 9;
        fbox.setText("" + cel);
        answerBox.setText(String.format("%.1f F = %.1f C", far, cel));
    }//GEN-LAST:event_fbuttonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        fbox.setText("");
        cbox.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TempConverter2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempConverter2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempConverter2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConverter2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConverter2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerBox;
    private javax.swing.JTextField cbox;
    private javax.swing.JButton cbutton;
    private javax.swing.JTextField fbox;
    private javax.swing.JButton fbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
