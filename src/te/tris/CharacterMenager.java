/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muszkie
 */
public class CharacterMenager {
    
    String name;
    String password;
    int accountBalance = 0;
    int tetrisLVL = 1;
    int saperLVL = 1;
    
    //String url = "jdbc:mysql://127.0.0.1:3306/licencjat";
    //String login = "root";
    //String cPassword = "";
    String url = "jdbc:mysql://muszro.mysql.dhosting.pl:3306/og4sow_licencjat";
    String login = "eohi3o_root";
    String cPassword = "rootabC1";
    Connection conn;
    Statement st;

    private void makeConnection() throws SQLException{
        conn = DriverManager.getConnection(url,login,cPassword);
        st = conn.createStatement();
    }

    public CharacterMenager(String name, String password, int accountBalance, int tetrisLVL, int saperLVL) {
        this.name=name;
        this.password=password;
        this.accountBalance=accountBalance;
        this.saperLVL=saperLVL;
        this.tetrisLVL=tetrisLVL;
    }
    
    public CharacterMenager(String name, String password){
        this.name=name;
        this.password=password;
    }
    
    
    void addTetrisScore(int score){
        accountBalance+= (score*tetrisLVL);
        updateUser();
    }
    
    void addSaperScore(int score){
        if(score<99){
        accountBalance = accountBalance + ((100-score)*saperLVL);
        }
        updateUser();
    }
    
    void upgradeTetris(){
        if (accountBalance>= ((100*(tetrisLVL+1))*1.25)){
             tetrisLVL+=1;
             accountBalance-=((100*tetrisLVL)*1.25);
        }
        updateUser();

    }
    
    void addMoney(int amount){
        accountBalance+=amount;
        updateUser();        
    }
    
    void getMoney(int amount){
        accountBalance-=amount;
        updateUser();
    }
        
    void upgradeSaper(){
        if (accountBalance>= ((100*(saperLVL+1))*1.25)){
             saperLVL+=1;
             accountBalance-=((100*saperLVL)*1.25);
        }
        updateUser();

    }
    
    int getAccountBalance(){
        return accountBalance;
    }
    
    void updateUser(){
       
        String string = "INSERT INTO `characters` (`name`, `password`, `accountBalance`, `tetrisLVL`, `saperLVL`) VALUES ('"+name+"', '"+password+"', '"+accountBalance+"', '"+tetrisLVL+"', '"+saperLVL+"');";
        try {
            makeConnection();
            st.executeUpdate(string);
        } catch (SQLException ex) {
            try {
                string = "UPDATE `characters` SET `accountBalance` = '"+accountBalance+"', `tetrisLVL` = '"+tetrisLVL+"', `saperLVL` = '"+saperLVL+"' WHERE `characters`.`name` = '"+name+"'; ";
                makeConnection();
                st.executeUpdate(string);
                conn.close();
            } catch (SQLException ex1) {
                //Logger.getLogger(CharacterMenager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }
    boolean userInDatabase(){
        try {
            makeConnection();
            ResultSet rs = st.executeQuery("SELECT name FROM `characters` ");
            while (rs.next()){
                if(rs.getString(1).equals(name)){
                    return true;
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CharacterMenager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    boolean login(){
        try {
            makeConnection();
            ResultSet rs = st.executeQuery("SELECT * FROM `characters` ");
            while (rs.next()){
                //System.out.println(rs.getString(1)+ name + rs.getString(2) + password);
                if(rs.getString(1).equals(name) && rs.getString(2).equals(password)){
                    //System.out.print(rs.getInt(3)+" "+rs.getInt(4)+" "+ rs.getInt(5));
                    accountBalance = rs.getInt(3);
                    tetrisLVL = rs.getInt(4);
                    saperLVL = rs.getInt(5);
                    return true;
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CharacterMenager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    String getName() {
        return this.name;
    }
    
}
