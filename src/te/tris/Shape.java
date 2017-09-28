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
public abstract class Shape {
    protected Color color;
    protected Point[] points;
    protected int y = 2;
    protected int x = 7;
    enum Direction { north, south , east, west };
    protected Direction z = Direction.east;
    
    public Shape(){};
    
   
    public abstract Point[] getPoints();
    public abstract Color getColor();
    public abstract void rotate();
    public abstract void reRotate();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract void moveDown();
    public abstract void moveUp();
}
