
package cConvert;

public class cConverters extends javax.swing.JFrame {
    double Bangladesh_BDT=93.89;
    double US_Dollar=1.53;
    double Indian_rupee=71.82;
    double Indonesian_Rupiah=14585.50;
    double Thailand_M=123.87;
    double Pakistan_M=139.00;
    double Singapore_D=1.37;
    double Afgan=94.3748;
    double japan=141.6169;
    double canada=1.7059;

    public cConverters() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcmbcur = new javax.swing.JComboBox<>();
        jlvlcur = new javax.swing.JLabel();
        jbtntxt = new javax.swing.JTextField();
        jbtnConvert = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Currency Converter");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jcmbcur.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jcmbcur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose Country", "Bangladesh", "India", "Pakistan", "USA", "Singapore", "Thailand", "Indonasia", "Afganistan", "Japan", "Canada", " " }));
        jcmbcur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbcurActionPerformed(evt);
            }
        });

        jlvlcur.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlvlcur.setForeground(new java.awt.Color(51, 51, 51));
        jlvlcur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtntxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtntxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtntxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jbtntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntxtActionPerformed(evt);
            }
        });

        jbtnConvert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnConvert.setText("Convert");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter amount in British Pound");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlvlcur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcmbcur, 0, 244, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jbtnConvert)
                        .addGap(65, 65, 65)
                        .addComponent(jbtnReset)
                        .addGap(70, 70, 70)
                        .addComponent(jbtnexit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jbtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcmbcur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jbtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlvlcur, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConvert)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnexit))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbcurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbcurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbcurActionPerformed

    private void jbtntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtntxtActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtntxt.setText(null);
        jlvlcur.setText(null);
        jcmbcur.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
        double British_pound=Double.parseDouble(jbtntxt.getText());
        if(jcmbcur.getSelectedItem().equals("Bangladesh"))
        {
            String cConvert1=String.format("BDT %.2f",British_pound*Bangladesh_BDT);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("India"))
        {
            String cConvert1=String.format("INR %.2f",British_pound*Indian_rupee);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1=String.format("PKR %.2f",British_pound*Pakistan_M);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("USA"))
        {
            String cConvert1=String.format("$ %.2f",British_pound*US_Dollar);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Singapore"))
        {
            String cConvert1=String.format("SGD %2.f",British_pound*Singapore_D);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Thailand"))
        {
            String cConvert1=String.format("TH %.2f",British_pound*Thailand_M);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Indonasia"))
        {
            String cConvert1=String.format("IDR %.2f",British_pound*Indonesian_Rupiah);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Afganistan"))
        {
            String cConvert1=String.format("AFN %.2f",British_pound*Afgan);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Japan"))
        {
            String cConvert1=String.format("JPY %.2f",British_pound*japan);
            jlvlcur.setText(cConvert1);
        }
        else if(jcmbcur.getSelectedItem().equals("Canada"))
        {
            String cConvert1=String.format("IDR %.2f",British_pound*canada);
            jlvlcur.setText(cConvert1);
        }
                                        
    }//GEN-LAST:event_jbtnConvertActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JTextField jbtntxt;
    private javax.swing.JComboBox<String> jcmbcur;
    private javax.swing.JLabel jlvlcur;
    // End of variables declaration//GEN-END:variables
}