/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author muszkie
 */
public class colorsGraphics extends javax.swing.JPanel {

    /**
     * Creates new form colorsGraphics
     */
    public colorsGraphics() {
        initComponents();
    }
    
    @Override
    protected void paintComponent(Graphics g) {

            super.paintComponent(g);
            g.setColor(Color.green);
            g.fillRect(0, 0, 40, this.getHeight());
            int x=40;
            int y=80;
            int z=120;
            for(int i= 0 ; i<=7 ; i++){
            g.setColor(Color.black);
            g.fillRect(x, 0, y, this.getHeight());
            g.setColor(Color.red);
            g.fillRect(y, 0, z, this.getHeight());
            x+=80;
            y+=80;
            z+=80;
            }

  
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
