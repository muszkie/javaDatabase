/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.Color;
import java.awt.Point;




/**
 *
 * @author muszkie
 */
public class Table {
    final private int width =14;
    final private int height = 20;
    private Color[][] table = new Color[height+2][width+2];
       
    public Table(){
        makeClearTableWithoutBorders();

    }
    
    private void makeClearTableWithoutBorders(){
        for(int i = 0 ; i<=width+1; i++){
            for(int j = 0 ; j<=height+1; j++){
                table[j][i] = Color.WHITE;
            }
        }
        makeBorder();
    }

    private void makeBorder() {
        for (int i = 0 ; i<=width+1 ; i++){
            table[height+1][i] = Color.BLACK;
        }
        for (int i =0 ; i<=height+1 ; i++){
            table[i][0] = Color.BLACK;
            table[i][width+1] = Color.BLACK;
        }
    }
    public Color getColor(int x, int y){      
        if(x<=width && y<=height){
            return table[y][x];
        }
        return Color.BLACK;
    }
    
    public void setColor(int x, int y, Color color){      
        if(x<=width && y<=height){
           table[y][x] = color;
        }
    }
    
    public boolean checkIfThereIsSpace(Point[] points){
        for( Point point : points){
            if(table[point.y][point.x] != Color.WHITE){
                return false;
            }
        }        
        return true;
    }
    
    public void addShape(Shape shape){
        if(checkIfThereIsSpace(shape.getPoints())){
        for(Point point : shape.getPoints()){
            table[point.y][point.x] = shape.getColor();
        }
    }
    }
    
   public void copyTable(Table tableToCopy){
       for(int i = 0 ; i<=width+1; i++){
            for(int j = 0 ; j<=height+1; j++){
                table[j][i] = tableToCopy.table[j][i];
            }
        }      
   }
    
}
