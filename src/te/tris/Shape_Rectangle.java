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
public class Shape_Rectangle extends Shape{
    
   public Shape_Rectangle(){
        this.color = Color.GREEN;
        y=2;
        points = new Point[4];
        points[0] = new Point(x,y);
        points[1] = new Point(x+1,y);
        points[2] = new Point(x+2,y);
        points[3] = new Point(x+3,y);
    }

@Override
    public Point[] getPoints() {
        return this.points;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void rotate() {
        switch (z) {         
              case east:
              
        points[0] = new Point(x,y+1);
        points[1] = new Point(x,y);
        points[2] = new Point(x,y-1);
        points[3] = new Point(x,y-2);
        z=Direction.south;
              
        break;
              case south:
        points[0] = new Point(x-1,y);
        points[1] = new Point(x,y);
        points[2] = new Point(x+1,y);
        points[3] = new Point(x+2,y);
        z=Direction.east;
        break;
              case north:    //disabled
        points[0] = new Point(x,y);
        points[1] = new Point(x+1,y);
        points[2] = new Point(x+2,y);
        points[3] = new Point(x+3,y);
        z=Direction.east;
        break;
        
              case west:    //disabled
        points[0] = new Point(x-3,y);
        points[1] = new Point(x-2,y);
        points[2] = new Point(x-1,y);
        points[3] = new Point(x,y);
        z=Direction.west;
        break;
        }
    }
    
    @Override
    public void reRotate() {
        rotate();
    }

    @Override
    public void moveLeft() {
        for(Point point : points){
            point.x -=1;
        }
        x-=1;
    }

    @Override
    public void moveRight() {
        for(Point point : points){
            point.x +=1;
        }
        x+=1;
    }

    @Override
    public void moveDown() {
       for(Point point : points){
            point.y +=1;
        }
       y+=1;
    }
    
    @Override
    public void moveUp() {
       for(Point point : points){
            point.y -=1;
        }
    }


    
}
