/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelRefuse.java
 *
 * Created on Oct 3, 2014, 9:57:04 AM
 */
package hkt.project;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.Painter;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class PanelAccept extends javax.swing.JPanel {

    /** Creates new form PanelRefuse */
    private String path = "C:\\Program Files";

    public String getPath() {
        return path;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public PanelAccept() {
        initComponents();
 
        UIDefaults defaults = new UIDefaults();
        defaults.put("ProgressBar[Enabled].foregroundPainter", new MyPainter(Color.GREEN));
        defaults.put("ProgressBar[Enabled+Finished].foregroundPainter", new MyPainter(Color.GREEN));
        progressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.TRUE);
        progressBar.putClientProperty("Nimbus.Overrides", defaults);
        lbMs.setVisible(false);
        progressBar.setVisible(false);
    }
    
    class MyPainter implements Painter<JProgressBar> {

        private final Color color;

        public MyPainter(Color c1) {
            this.color = c1;
        }
        @Override
        public void paint(Graphics2D gd, JProgressBar t, int width, int height) {
            gd.setColor(color);
            gd.fillRect(0, 0, width, height);
        }
    }         

    public void showPro() {
        lbMs.setVisible(true);
        progressBar.setVisible(true);
    }

    public void view(boolean fag) {
        jButton1.setEnabled(fag);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSourceInstall = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbMs = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(226, 237, 255));
        setFont(new java.awt.Font("Tahoma", 0, 14));
        setMaximumSize(new java.awt.Dimension(435, 302));
        setMinimumSize(new java.awt.Dimension(435, 302));
        setPreferredSize(new java.awt.Dimension(435, 302));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("<html> <b>Chương trình sẽ cài đặt phần mềm HKT Software </b><br> <br>  Xin hãy tắt các chương trình khác trên thiết bị được cài đặt <br> </html>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Phần mềm HKT Software sẽ được cài đặt vào địa chỉ sau:");

        txtSourceInstall.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtSourceInstall.setText("C:\\\\Program Files\\\\HKT Software 4.0");
        txtSourceInstall.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSourceInstall.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("....");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbMs.setFont(new java.awt.Font("Tahoma", 3, 14));
        lbMs.setText("Phần mềm HKT Software đang được cài đặt");

        progressBar.setForeground(new java.awt.Color(204, 0, 0));
        progressBar.setPreferredSize(new java.awt.Dimension(334, 30));
        progressBar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMs, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSourceInstall, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE))
                            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtSourceInstall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(lbMs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.showOpenDialog(null);

    path = chooser.getSelectedFile().getAbsolutePath();
    txtSourceInstall.setText(path);
}//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbMs;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txtSourceInstall;
    // End of variables declaration//GEN-END:variables
}
