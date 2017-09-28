/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

/**
 *
 * @author muszkie
 */
public class Minesweeper {
    
    public enum fieldType{clear("E",false),bomb("@",false),oneBombNear("1",false),twoBombNear("2",false),threeBombNear("3",false),fourBombNear("4",false),fiveBombNear("5",false),sixBombNear("6",false),sevenBombNear("7",false),eightBombNear("8",false),border("#",false);
        
    private final String string;
    public boolean visited;
    fieldType(String string, boolean visited ) { this.string = string; this.visited = false;}
    public String getValue() { return string; }
    public boolean getIfVisited() { return this.visited; }
    public void setVisited() {this.visited = true;}
    }

    public static BattleGround battleGround = new BattleGround(10,10,10);
    
    public static void main(String[] args) {
        // TODO code application logic here
        fieldType[][] ground;
        ground = battleGround.getBattleGround();
        for(int i=0;i<=(battleGround.getBattleWidth()+1);i++){
            for(int j=0;j<=(battleGround.getBattleHeight()+1);j++){
                //System.out.print(" "+ground[i][j].getValue()+" ");
            }
            //System.out.print("\n");
        }
    }
    
    public String getFieldType(int x, int y){
        return battleGround.getBattleGroundFieldType(x, y);
    }
    
    public boolean getIfFieldVisited(int x, int y){
        return battleGround.getBattleGroundFieldIfVisited(x, y);
    }
    
    public void makeFieldVisited(int x, int y){
        battleGround.setBattleGroundFieldVisited(x,y);
    }
}
