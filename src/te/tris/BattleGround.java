/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import te.tris.Minesweeper.fieldType;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author muszkie
 */
public class BattleGround {

    private final int battleWidth;
    private final int battleHeight;
    private final int battleBombCount;
    private  fieldType[][] battleGround;

    public BattleGround(int battleWidth, int battleHeight, int battleBombCount) {
        this.battleWidth = battleWidth;
        this.battleHeight = battleHeight;
        this.battleBombCount = battleBombCount;
        battleGround = new fieldType[this.battleWidth + 2][this.battleHeight + 2];
        fillBattleGround();

    }

    public void fillBattleGround() {        
        for (int i = 1; i <= getBattleWidth(); i++) {
            for (int j = 1; j < getBattleHeight() + 1; j++) {
                battleGround[i][j] = fieldType.clear;
                battleGround[i][j].visited=false;
            }
        }
        makeBorder();
        randomPlaceBombs();
    }

    private void makeBorder() {
        for (int i = 0; i <= getBattleHeight() + 1; i++) {
            battleGround[0][i] = fieldType.border;
            battleGround[getBattleWidth() + 1][i] = fieldType.border;
            battleGround[i][0] = fieldType.border;
            battleGround[i][getBattleWidth() + 1] = fieldType.border;
        }
    }

    private void randomPlaceBombs() {
        Random generator = new Random();
        for (int i = 0; i < battleBombCount; i++) {
            int x = generator.nextInt(getBattleHeight());
            int y = generator.nextInt(getBattleWidth());
            while (battleGround[x][y] == fieldType.bomb || battleGround[x][y] == fieldType.border) {
                x = generator.nextInt(getBattleHeight());
                y = generator.nextInt(getBattleWidth());
            }
            battleGround[x][y] = fieldType.bomb;
            correctBattleGroundBombNearCounters(x, y);
        }
    }

    private void correctBattleGroundBombNearCounters(int x, int y) {
        Point upperleft = new Point(x - 1, y - 1);
        Point upper = new Point(x, y - 1);       
        Point upperRight = new Point(x + 1, y - 1);        
        Point left = new Point(x - 1, y);        
        Point right = new Point(x + 1, y);        
        Point underLeft = new Point(x - 1, y + 1);        
        Point under = new Point(x, y + 1);        
        Point underRight = new Point(x + 1, y + 1);
        
        bombCountIncrease(upperleft);
        bombCountIncrease(upper);
        bombCountIncrease(upperRight);
        bombCountIncrease(left);
        bombCountIncrease(right);
        bombCountIncrease(underLeft);
        bombCountIncrease(under);
        bombCountIncrease(underRight);
    }

    private void bombCountIncrease(Point point) {
        switch(battleGround[point.x][point.y]){
            case clear: battleGround[point.x][point.y] = fieldType.oneBombNear;
                break;
            case bomb:
                break;
            case oneBombNear: battleGround[point.x][point.y] = fieldType.twoBombNear;
                break;
            case twoBombNear: battleGround[point.x][point.y] = fieldType.threeBombNear;
                break;
            case threeBombNear: battleGround[point.x][point.y] = fieldType.fourBombNear;
                break;
            case fourBombNear: battleGround[point.x][point.y] = fieldType.fiveBombNear;
                break;
            case fiveBombNear: battleGround[point.x][point.y] = fieldType.sixBombNear;
                break;
            case sixBombNear: battleGround[point.x][point.y] = fieldType.sevenBombNear;
                break;
            case sevenBombNear: battleGround[point.x][point.y] = fieldType.eightBombNear;
                break;
            case eightBombNear:
                break;
            case border:
                break;
            default:
                throw new AssertionError(battleGround[point.x][point.y].name());
        }
    }

    public fieldType[][] getBattleGround() {
        return this.battleGround;
    }
    
    public String getBattleGroundFieldType(int x, int y){
        return battleGround[y][x].getValue();
    }
    
    public boolean getBattleGroundFieldIfVisited(int x, int y){
        return battleGround[y][x].getIfVisited();
    }
    
    public void setBattleGroundFieldVisited(int x, int y){
        battleGround[y][x].setVisited();
    }

    /**
     * @return the battleWidth
     */
    public int getBattleWidth() {
        return battleWidth;
    }

    /**
     * @return the battleHeight
     */
    public int getBattleHeight() {
        return battleHeight;
    }
}

