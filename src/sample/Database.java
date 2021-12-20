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

    public void addNewUser(String navn,int phone,String email,int kontoNr,int kontrolCifre,String expirationDate,String userName,String kode) {
        try {
            String sql = "INSERT INTO bruger(navn, phone, email, kontonr, kontrolCifre, expirationDate, userName, kode)"
                    + "VALUES(" + phone +", "+ navn + ", " + email + ", " + kontoNr + ", "
                    + kontrolCifre + ", " + expirationDate + ", " + userName + ", " + kode + ");";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();

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