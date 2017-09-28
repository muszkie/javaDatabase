/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author muszkie
 */
public class Highscores {
    Score[] scores = new Score[10];
    int scoreCount = scores.length;
    Connection conn;
    //String url = "jdbc:mysql://127.0.0.1:3306/licencjat";
    //String login = "root";
    //String password = "";
    String url = "jdbc:mysql://muszro.mysql.dhosting.pl:3306/og4sow_licencjat";
    String login = "eohi3o_root";
    String password = "rootabC1";

    
    public Highscores(){
        for(int i = 0 ; i < 10 ; i++){
            scores[i] = new Score(0,"empty");
        }
        
    }
    public void makeConnection() throws SQLException{

    Connection conn = DriverManager.getConnection(url,login,password);;
    }
    public void makeDESC(){
        for(int i = 0 ; i < 10 ; i++){
            scores[i] = new Score(999,"empty");
        }
    }
    
    public Score[] getScores(){        
        return scores;
    }
    
    public void addScoreASC(String name, int score){
        int i =0;
        while(i < 10){
            if(scores[i].getScore() < score){
                int scoreTemp = scores[i].getScore();
                String nameTemp = scores[i].getName();
                scores[i] = new Score(score,name);
                score = new Integer(scoreTemp);
                name =  new String(nameTemp);
            }
            i+=1;
        }
        
    }
        public void addScoreDESC(String name, int score){
        int i =0;
        while(i < 10){
            if(scores[i].getScore() > score || scores[i].getScore() == 0){
                int scoreTemp = scores[i].getScore();
                String nameTemp = scores[i].getName();
                scores[i] = new Score(score,name);
                score = new Integer(scoreTemp);
                name =  new String(nameTemp);
            }
            i+=1;
        }
        
    }
    void wczytajZBazyASC(String nazwa){
        try {
            /*try {
            makeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + nazwa);
            while(rs.next()){
            addScoreASC(rs.getString(1),Integer.parseInt(rs.getString(2)));        
            }
            } catch (SQLException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
            //String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11177111";
            //String login = "sql11177111";
            //String password = "bKdD4XYcvH";
            Connection conn = DriverManager.getConnection(url,login,password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + nazwa);
            while(rs.next()){
                //System.out.print(rs.getString(1)+Integer.parseInt(rs.getString(2)));
                addScoreASC(rs.getString(1),Integer.parseInt(rs.getString(2)));     
            }
        } catch (SQLException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    void wczytajZBazyDESC(String nazwa){
        try {
            /*makeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + nazwa);
            while(rs.next()){
                addScoreDESC(rs.getString(1),Integer.parseInt(rs.getString(2)));        
            }*/
            //String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11177111";
            //String login = "sql11177111";
            //String password = "bKdD4XYcvH";
            Connection conn = DriverManager.getConnection(url,login,password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + nazwa);
            while(rs.next()){
                //System.out.print(rs.getString(1)+Integer.parseInt(rs.getString(2)));
                addScoreDESC(rs.getString(1),Integer.parseInt(rs.getString(2)));     
            }
        } catch (SQLException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void wczytajPlikASC(String nazwa) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(nazwa));
            String linia;
            String[] t;
            while ((linia = r.readLine()) != null) {
                t = linia.split(" ");
                addScoreASC(t[0], Integer.parseInt(t[1]));
            }
        } catch (Exception e) {
            //System.out.println("Coś nie tak: " + e);
        }
    }
    
        void wczytajPlikDESC(String nazwa) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(nazwa));
            String linia;
            String[] t;
            while ((linia = r.readLine()) != null) {
                t = linia.split(" ");
                addScoreDESC(t[0], Integer.parseInt(t[1]));
            }
        } catch (IOException e) {
            //System.out.println("Coś nie tak: " + e);
        }
    }
        void zapiszBaze(String nazwa){
            BufferedWriter writer = null;
            try
            {
                writer = new BufferedWriter( new FileWriter( nazwa));
                for(int i = 0 ; i < 10 ; i++){
                    writer.write(scores[i].getName() + " " + scores[i].getScore() + "\n");
                }
                
            }
            catch ( IOException e)
            {
            }
            finally
            {
                try
                {
                    if ( writer != null)
                        writer.close( );
                
                }
                catch ( IOException e)
                {
                }
            }
        }
        void zapiszPlik(String nazwa){
            
        try {
            //String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11177111";
            //String login = "sql11177111";
            //String password = "bKdD4XYcvH";
            Connection conn = DriverManager.getConnection(url,login,password);
            Statement st = conn.createStatement();
            st.executeUpdate("TRUNCATE TABLE " + nazwa);
            for(int i = 0 ; i < 10 ; i++){
                //writer.write(scores[i].getName() + " " + scores[i].getScore() + "\n");
                st.executeUpdate("INSERT INTO " + nazwa + " VALUES ('" + scores[i].getName() + "','" + scores[i].getScore() + "')");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Highscores.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
