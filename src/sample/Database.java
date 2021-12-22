package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import java.io.IOException;
import java.sql.*;

public class Database {
    private Connection connection;
    private Statement stmt;

    private final String URL = "jdbc:sqlite:C://Users/allil/IdeaProjects/MobilePay1SemesterProjekt/mobilePay.db";

    Database() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://Users/allil/IdeaProjects/MobilePay1SemesterProjekt/mobilePay.db";
            connection = DriverManager.getConnection(url);
           // connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //CREATE DATABASE databasename
    public void createListUser() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS user("
                    + "	phone integer PRIMARY KEY,"
                    + "	name TEXT NOT NULL,"
                    + "	email TEXT NOT NULL,"
                    + "	kontonr TEXT NOT NULL, "
                    + "	kontrolcifre TEXT NOT NULL,"
                    + "	expirationdate TEXT NOT NULL, "
                    + "	username TEXT NOT NULL, "
                    + "	password TEXT NOT NULL, "
                    + ");";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void addNewUser2(String testname,int phone1,String email1,int kontonr1,int kontrolcifre1,String expirationdate1,String username1,String password1) {
        try {
            String sql = "INSERT INTO user(name,phone,email,kontonr,kontrolcifre,expirationdate,username,password)"
                    + "VALUES(" + testname +","+ phone1 + "," + email1 + "," + kontonr1 + ","
                    + kontrolcifre1 + "," + expirationdate1 + "," + username1 + "," + password1 + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("addNewUser connection to SQLite has been established.");
            stmt.close();
            //SQL error or missing database (no such column: ak)
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addNewUser(ActionEvent event, String fnavn, int tlf, String email, String kontonr, String kontrolNr, String udloeb, String brugernavn, String kode){
        Controller c = new Controller();
        String sql = "INSERT INTO user (name,phone,email,kontonr,kontrolcifre,expirationdate,username,password) " +
                "VALUES ('"+fnavn+"',"+tlf+",'"+email+"','"+kontonr+"','"+kontrolNr+"','"+udloeb+"','"+brugernavn+"','"+kode+"')";

        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
            c.switchSceneToLogIn(event);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

       // if(loginUserName == Bruger().getuserName;();


   public void login(ActionEvent event, String user, String pass){
        Controller c = new Controller();
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
       try {
           connection = DriverManager.getConnection(URL);
           PreparedStatement prestmt = connection.prepareStatement(sql);
           prestmt.setString(1,user);
           prestmt.setString(2,pass);
           ResultSet rs = prestmt.executeQuery();
           if (rs.next()){
               System.out.println("Skifter scene");
               c.switchSceneToSendMoneyScreen(event);
           }else{
               System.out.println("Forkert login");
               c.switchSceneToLogIn(event);
           }
           connection.close();
           prestmt.close();
           rs.close();

       } catch (SQLException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }


   }
}
