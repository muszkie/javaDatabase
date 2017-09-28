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
public class Score {
    private int score;
    private String name;
    
    public Score(int score, String name){
        this.score = score;
        this.name = name;
    }
    
    public int getScore(){
        
        return this.score;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
