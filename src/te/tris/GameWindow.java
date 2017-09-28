/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 *
 * @author muszkie
 */
public class GameWindow extends javax.swing.JPanel {
   
    Table mainTable = new Table();
    Table drawableTable = new Table();
    Shape shape = new Shape_Square();
    Shape shapeTemp = new Shape_Square();
    int score = 0;
    boolean gameOver = false;
   
    public GameWindow() {
         initComponents();
         drawableTable.addShape(shape);
         jLabel1.setVisible(true);
         
         
    }
    
    public void refresh(){
        restore();
        if(mainTable.checkIfThereIsSpace(shape.points)){
            drawableTable.addShape(shape);
        }
        else{
            shape.moveUp();
            mainTable.addShape(shape);
            checkTableIfAnyRowFull();
            shape = getRandomShape();            
            restore();
            drawableTable.addShape(shape);
            for (int i = 2 ; i < 15 ; i++){
                if(mainTable.getColor(i, 2) != Color.WHITE){
                    gameOver = true;
                }
            }
        }
        repaint();
    }
    
    private void restore() {
        drawableTable.copyTable(mainTable);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        for (int i = 0; i<16;i++){
            for (int j = 2; j<22;j++){
                g.setColor(drawableTable.getColor(i, j));
                g.fillRect((10+(i*20)), (10+((j-2)*20)),18, 18);                
            }
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

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("GAME OVER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Shape getRandomShape() {
        Shape randomShape;
        Random generator = new Random();
        int randomNumber = generator.nextInt(8);
        switch (randomNumber){
            case 0 :
                randomShape = new Shape_Square();
                break;
            case 1 :
                randomShape = new Shape_Rectangle();
                break;
            case 2 :
                randomShape = new Shape_J();
                break;
            case 3 :
                randomShape = new Shape_L();
                break;
            case 4 :
                randomShape = new Shape_Z();
                break;
            case 5 :
                randomShape = new Shape_S();
                break;
            default:
                randomShape = new Shape_T();                
        }
        
        return randomShape;
    }
    private boolean addedPoint = false;
    
    public boolean checkIfPointAddedThisTime(){
        return addedPoint;
    }
    
    
    private void checkTableIfAnyRowFull() {
        addedPoint = false;
        for(int j=1 ; j<21 ; j++){
            int count = 0;
            for(int i = 0 ; i<16 ; i++){
                if(mainTable.getColor(i, j) != Color.WHITE )
                    count+=1;
            }
            if(count==16){
                cleanRow(j);
            }
        }
    }

    public void cleanRow(int row){
        //row+=1;
        for (int i=0; i<16;i++){
            mainTable.setColor(i, row, Color.WHITE);
                    }
        score += 14;
        addedPoint = true;
        for (int j=row;j>0;j--){
            for (int i=0;i<16;i++){
                mainTable.setColor(i, j, mainTable.getColor(i, j-1));                   
            }
        }
    }
        
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void restart() {
    mainTable = new Table();
    drawableTable = new Table();
    shape = new Shape_Square();
    shapeTemp = new Shape_Square();
    score = 0;
    gameOver = false;
    addedPoint = false;
    refresh();
    }
}
