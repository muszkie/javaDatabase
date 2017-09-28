/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;



/**
 *
 * @author muszkie
 */



public class TetrisGame extends javax.swing.JFrame {
    
    public boolean gameOverFlag = false;
    private boolean timerFlag = true;
    public class MoveDown extends TimerTask{        

    public void run() {

        gameWindow.shape.moveDown();
        gameWindow.refresh();
    }
}
    
    Timer timer = new Timer();
    public TetrisGame() {
        initComponents();
        timer = new Timer();
        timer.schedule(new MoveDown() , 0 , 300);
    }
    
    public boolean gameOver(){
        
        return gameOverFlag;
    }
    
    public int getScore(){
        return Integer.parseInt(this.ScoreField.getText());
    }
    
    public void resetScore(){
        this.ScoreField.setText("0");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        gameWindow = new te.tris.GameWindow();
        gameOver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ScoreField = new javax.swing.JLabel();
        gameOverMSG = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gameOver.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        javax.swing.GroupLayout gameWindowLayout = new javax.swing.GroupLayout(gameWindow);
        gameWindow.setLayout(gameWindowLayout);
        gameWindowLayout.setHorizontalGroup(
            gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameWindowLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(gameOver, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        gameWindowLayout.setVerticalGroup(
            gameWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameWindowLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(gameOver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jLabel1.setText("Score :");

        ScoreField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ScoreField.setText("0");
        ScoreField.setToolTipText("");
        ScoreField.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ScoreField.setFocusable(false);
        ScoreField.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ScoreField.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        gameOverMSG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton2.setText("Pause");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(gameOverMSG))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel1)))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ScoreField)
                .addGap(91, 91, 91)
                .addComponent(gameOverMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean cheater = false;
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int score = gameWindow.score;
        
        
        ScoreField.setText(String.valueOf(score));
        if(gameWindow.gameOver){
            gameOver.setText("GAME OVER");
            gameOverMSG.setText("press enter to continue");
        }
        
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                gameWindow.shape.moveLeft();
                if(gameWindow.mainTable.checkIfThereIsSpace(gameWindow.shape.points)){
                    gameWindow.refresh();                    
                }
                else{
                    gameWindow.shape.moveRight();
                }
                
                
                break;
            case KeyEvent.VK_RIGHT:
                gameWindow.shape.moveRight();
                if(gameWindow.mainTable.checkIfThereIsSpace(gameWindow.shape.points)){
                    gameWindow.refresh();                    
                }
                else{
                    gameWindow.shape.moveLeft();
                }
                break;
            case KeyEvent.VK_DOWN:
                gameWindow.shape.moveDown();
                gameWindow.refresh();
                if(gameWindow.checkIfPointAddedThisTime() && !timerFlag){
                    cheater = true;
                }
                break;
            case KeyEvent.VK_UP:
                gameWindow.shape.rotate();
                if(gameWindow.mainTable.checkIfThereIsSpace(gameWindow.shape.points)){
                    gameWindow.refresh();                    
                }
                else{
                    gameWindow.shape.reRotate();
                }
                break;
            case KeyEvent.VK_SPACE:
                TimerPause();
                break;
            case KeyEvent.VK_ENTER:
                if(gameWindow.gameOver){
                    gameOverFlag = true;
                    /*gameWindow.restart();
                    gameOver.setText("");
                    gameOverMSG.setText("");*/

                }
            default:
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    public boolean isThisPlayerCheating(){
        return cheater;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gameOverFlag = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TimerPause();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void TimerPause(){
       if (timerFlag){
            timer.cancel();
            timerFlag = !timerFlag;
        }
        else{
            timer = new Timer();
            timer.schedule(new MoveDown() , 0 , 300);
            timerFlag = !timerFlag;
    }
    }
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
            java.util.logging.Logger.getLogger(TetrisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TetrisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TetrisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TetrisGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TetrisGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ScoreField;
    private javax.swing.JLabel gameOver;
    private javax.swing.JLabel gameOverMSG;
    private te.tris.GameWindow gameWindow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}