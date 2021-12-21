package sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection connection;

    public void createListUser() {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS USER (\n"
                    + "	phone integer PRIMARY KEY,\n"
                    + "	Fnavn TEXT NOT NULL,\n"
                    + "	Lname TEXT NOT NULL,\n"
                    + "	adresse TEXT NOT NULL,\n"
                    + "	Email TEXT NOT NULL,\n"
                    + "	mobil TEXT NOT NULL,\n"
                    + "	kontoNr TEXT NOT NULL, \n"
                    + "	kontrolCifre TEXT NOT NULL, \n"
                    + "	expirationDate_M TEXT NOT NULL, \n"
                    + "	expirationDate_y TEXT NOT NULL, \n"
                    + "	userName TEXT NOT NULL, \n"
                    + "	kode TEXT NOT NULL, \n"
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
   public static boolean login (String loginUserName,String loginPassword){

            String sql = "SELECT * FROM bruger WHERE \n userNavn =" + loginUserName
                    + " if(kode = "+ loginPassword + ") \n  return true;";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
/*

 */