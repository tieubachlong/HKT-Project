/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelSystem.java
 *
 * Created on Oct 3, 2014, 3:42:20 PM
 */
package hkt.project;

import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class PanelSystem extends javax.swing.JPanel {

    public JTextField getTxtSource() {
        return txtSource;
    }

    /** Creates new form PanelSystem */
    
    public PanelSystem() {
        initComponents();

        ButtonGroup databaseGroup = new ButtonGroup();
        ButtonGroup data = new ButtonGroup();
        ButtonGroup system = new ButtonGroup();
        ButtonGroup license = new ButtonGroup();
        // add into Group 
        databaseGroup.add(rbtBookStore);
        databaseGroup.add(rbtEtc);
        databaseGroup.add(rbtPharmacies);
        databaseGroup.add(rbtRestauren);
        databaseGroup.add(rbtShop);
        databaseGroup.add(rbtSpa);
        databaseGroup.add(rbtSupperMarket);
        databaseGroup.add(rbtCaKaBi);
        //add into group thiết lập cơ sở dữ liệu
        data.add(rbtData);
        data.add(rbtData2);
        //add into group máy chủ máy trạm
        system.add(rbtClient);
        system.add(rbtServer);
        //add group license
        license.add(rbtLicense);
        license.add(rbtTrial);

        rbtServer.setSelected(true);
        rbtLicense.setSelected(true);
        rbtData.setSelected(true);
        setComponent(false);
        rbtData.setEnabled(true);
        rbtData2.setEnabled(true);
        txtSource.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtServer = new javax.swing.JRadioButton();
        rbtClient = new javax.swing.JRadioButton();
        txtSource = new javax.swing.JTextField();
        panelDatabase = new javax.swing.JPanel();
        rbtData = new javax.swing.JRadioButton();
        rbtData2 = new javax.swing.JRadioButton();
        rbtRestauren = new javax.swing.JRadioButton();
        rbtSupperMarket = new javax.swing.JRadioButton();
        rbtShop = new javax.swing.JRadioButton();
        rbtCaKaBi = new javax.swing.JRadioButton();
        rbtPharmacies = new javax.swing.JRadioButton();
        rbtBookStore = new javax.swing.JRadioButton();
        rbtSpa = new javax.swing.JRadioButton();
        rbtEtc = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtLicense = new javax.swing.JRadioButton();
        rbtTrial = new javax.swing.JRadioButton();
        txtCodeLicense = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 237, 255));
        setFont(new java.awt.Font("Tahoma", 0, 14));
        setMaximumSize(new java.awt.Dimension(435, 302));
        setMinimumSize(new java.awt.Dimension(435, 302));

        rbtServer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtServer.setText("Máy chủ");
        rbtServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtServerActionPerformed(evt);
            }
        });

        rbtClient.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtClient.setText("Máy trạm");
        rbtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtClientActionPerformed(evt);
            }
        });

        txtSource.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSource.setText("localhost");
        txtSource.setPreferredSize(new java.awt.Dimension(59, 25));

        panelDatabase.setBackground(new java.awt.Color(226, 237, 255));

        rbtData.setFont(new java.awt.Font("Tahoma", 1, 14));
        rbtData.setText("Dữ liệu trắng");
        rbtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDataActionPerformed(evt);
            }
        });

        rbtData2.setFont(new java.awt.Font("Tahoma", 1, 14));
        rbtData2.setText("Dữ liệu mẫu");
        rbtData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtData2ActionPerformed(evt);
            }
        });

        rbtRestauren.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtRestauren.setText("Nhà hàng");
        rbtRestauren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtRestaurenActionPerformed(evt);
            }
        });

        rbtSupperMarket.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtSupperMarket.setText("Siêu thị");
        rbtSupperMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSupperMarketActionPerformed(evt);
            }
        });

        rbtShop.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtShop.setText("Shop quần áo");
        rbtShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtShopActionPerformed(evt);
            }
        });

        rbtCaKaBi.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtCaKaBi.setText("Cafe karaoke ");
        rbtCaKaBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCaKaBiActionPerformed(evt);
            }
        });

        rbtPharmacies.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtPharmacies.setText("Hiệu thuốc");
        rbtPharmacies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPharmaciesActionPerformed(evt);
            }
        });

        rbtBookStore.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtBookStore.setText("Hiệu sách");
        rbtBookStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtBookStoreActionPerformed(evt);
            }
        });

        rbtSpa.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtSpa.setText("Spa");
        rbtSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSpaActionPerformed(evt);
            }
        });

        rbtEtc.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtEtc.setText("Khác");
        rbtEtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEtcActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Thiết lập cơ sở dữ liệu");

        javax.swing.GroupLayout panelDatabaseLayout = new javax.swing.GroupLayout(panelDatabase);
        panelDatabase.setLayout(panelDatabaseLayout);
        panelDatabaseLayout.setHorizontalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtSupperMarket)
                    .addComponent(rbtBookStore)
                    .addComponent(rbtData)
                    .addComponent(rbtRestauren))
                .addGap(25, 25, 25)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtCaKaBi)
                    .addComponent(rbtData2)
                    .addComponent(rbtPharmacies)
                    .addComponent(rbtEtc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtShop)
                    .addComponent(rbtSpa))
                .addGap(30, 30, 30))
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        panelDatabaseLayout.setVerticalGroup(
            panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatabaseLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtData)
                    .addComponent(rbtData2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtShop)
                    .addComponent(rbtRestauren)
                    .addComponent(rbtCaKaBi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtSupperMarket)
                    .addComponent(rbtPharmacies)
                    .addComponent(rbtSpa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtBookStore)
                    .addComponent(rbtEtc))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        rbtLicense.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtLicense.setText("Bản quyền");
        rbtLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtLicenseActionPerformed(evt);
            }
        });

        rbtTrial.setFont(new java.awt.Font("Tahoma", 0, 14));
        rbtTrial.setText("Dùng thử");
        rbtTrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTrialActionPerformed(evt);
            }
        });

        txtCodeLicense.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodeLicense.setPreferredSize(new java.awt.Dimension(59, 23));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Thiết lập hệ thống");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ IP máy chủ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã bản quyền");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(txtCodeLicense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbtLicense)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtTrial))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbtServer)
                                    .addGap(29, 29, 29)
                                    .addComponent(rbtClient))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtServer)
                    .addComponent(rbtClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtLicense)
                    .addComponent(rbtTrial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodeLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(panelDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void rbtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtClientActionPerformed

    txtSource.setEnabled(true);
    txtSource.setText("");
    setComponent(false);

}//GEN-LAST:event_rbtClientActionPerformed

    public void setComponent(boolean value) {
        rbtEtc.setEnabled(value);
        rbtPharmacies.setEnabled(value);
        rbtRestauren.setEnabled(value);
        rbtShop.setEnabled(value);
        rbtSpa.setEnabled(value);
        rbtSupperMarket.setEnabled(value);
        rbtCaKaBi.setEnabled(value);
        rbtData.setEnabled(value);
        rbtData2.setEnabled(value);
        rbtBookStore.setEnabled(value);
    }
private void rbtServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServerActionPerformed

    txtSource.setEnabled(false);
    txtSource.setText("localhost");
    if (rbtData.isSelected()) {

        setComponent(false);
        rbtData.setEnabled(true);
        rbtData2.setEnabled(true);
    } else {
        setComponent(true);
    }

}//GEN-LAST:event_rbtServerActionPerformed

private void rbtLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtLicenseActionPerformed
    txtCodeLicense.setEnabled(true);
}//GEN-LAST:event_rbtLicenseActionPerformed

private void rbtTrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTrialActionPerformed

    txtCodeLicense.setEnabled(false);
}//GEN-LAST:event_rbtTrialActionPerformed

private void rbtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDataActionPerformed

    setComponent(false);
    rbtData.setEnabled(true);
    rbtData2.setEnabled(true);
    rbtEtc.setText("Khác");
    rbtBookStore.setSelected(false);
//    rbtCaKaBi.setSelected(false);
//    rbtEtc.setSelected(false);
//    rbtPharmacies.setSelected(false);
//    rbtRestauren.setSelected(false);
//    rbtShop.setSelected(false);
//    rbtSpa.setSelected(false);
//    rbtSupperMarket.setSelected(false);

}//GEN-LAST:event_rbtDataActionPerformed

private void rbtData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtData2ActionPerformed

    setComponent(true);
}//GEN-LAST:event_rbtData2ActionPerformed

private void rbtEtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEtcActionPerformed

    JFileChooser jfc = new JFileChooser();
    if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

        int returnValue = jfc.showOpenDialog(null);
//Neu file duoc chon 
        File selectedFile = jfc.getSelectedFile();
        String ect = selectedFile.getName();
        rbtEtc.setText(ect);

    }
}//GEN-LAST:event_rbtEtcActionPerformed

private void rbtRestaurenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtRestaurenActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtRestaurenActionPerformed

private void rbtCaKaBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCaKaBiActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtCaKaBiActionPerformed

private void rbtShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtShopActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtShopActionPerformed

private void rbtSupperMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSupperMarketActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtSupperMarketActionPerformed

private void rbtPharmaciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPharmaciesActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtPharmaciesActionPerformed

private void rbtBookStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtBookStoreActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtBookStoreActionPerformed

private void rbtSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSpaActionPerformed

    rbtEtc.setText("Khác");
}//GEN-LAST:event_rbtSpaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelDatabase;
    private javax.swing.JRadioButton rbtBookStore;
    private javax.swing.JRadioButton rbtCaKaBi;
    private javax.swing.JRadioButton rbtClient;
    private javax.swing.JRadioButton rbtData;
    private javax.swing.JRadioButton rbtData2;
    private javax.swing.JRadioButton rbtEtc;
    private javax.swing.JRadioButton rbtLicense;
    private javax.swing.JRadioButton rbtPharmacies;
    private javax.swing.JRadioButton rbtRestauren;
    private javax.swing.JRadioButton rbtServer;
    private javax.swing.JRadioButton rbtShop;
    private javax.swing.JRadioButton rbtSpa;
    private javax.swing.JRadioButton rbtSupperMarket;
    private javax.swing.JRadioButton rbtTrial;
    private javax.swing.JTextField txtCodeLicense;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}