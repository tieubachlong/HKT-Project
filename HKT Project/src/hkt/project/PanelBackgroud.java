/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelBackgroud.java
 *
 * Created on Oct 2, 2014, 11:14:55 AM
 */
package hkt.project;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author longnt
 */
public class PanelBackgroud extends javax.swing.JPanel {

    /** Creates new form PanelBackgroud */
    private ImageIcon icon;
    public PanelBackgroud() {
        initComponents();
        icon = new ImageIcon(getClass().getResource("Background.jpg"));
    }
    
     @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    ImageIcon iic = new ImageTool().resize(icon, this.getSize());
    Image bgimage = iic.getImage();
    g.drawImage(bgimage, 1, 1, null);
  }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(549, 419));
        setMinimumSize(new java.awt.Dimension(549, 419));
        setPreferredSize(new java.awt.Dimension(549, 419));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}